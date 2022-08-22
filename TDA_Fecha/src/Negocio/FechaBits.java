package Negocio;

public class FechaBits {
    
    public VectorBitsG V;
    public int dim;

    public FechaBits() {
        this.dim = 0;
        V = new VectorBitsG(1, 20);
    }
    
    public void insertar(int dia, int mes, int año) {
        this.dim++;
        redimensionar(dim);
        int mask = dia;
        mes = mes << 5;
        mask = mask | mes;
        año = año << 9;
        mask = mask | año;
        V.insertar(mask, dim);
    }
    
    public int getDia(int pos) {
        int x = V.sacar(pos);
        x = x << 27;
        x = x >>> 27;
        return x;
    }
    
    public int getMes(int pos) {
        int x = V.sacar(pos);
        x = x << 23;
        x = x >>> 28;
        return x;
    }
    
    public int getAño(int pos) {
        int x = V.sacar(pos);
        x = x >>> 9;
        return x;
    }
    
    public void setDia(int pos, int dia) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 5) - 1);
        mask = ~mask;
        x = x & mask;
        x = x | dia;
        V.insertar(x, pos);
    }
    
    public void setMes(int pos, int mes) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 4) - 1);
        mask = mask << 5;
        mask = ~mask;
        x = x & mask;
        mes = mes << 5;
        x = x | mes;
        V.insertar(x, pos);
    }
    
    public void setAño(int pos, int año) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 11) - 1);
        mask = mask << 9;
        mask = ~mask;
        x = x & mask;
        año = año << 9;
        x = x | año;
        V.insertar(x, pos);
    }
    
    private void redimensionar(int num) {
        if (num > V.dim) {
            VectorBitsG copia = new VectorBitsG(V.dim, 20);
            int numEnt = (num * 20) / 32;
            if ((num * 20) % 32 != 0) {
                numEnt++;
            }
            copia.V = new int [numEnt];
            System.arraycopy(V.V, 0, copia.V, 0, V.V.length);
            V = new VectorBitsG(num + 10, 20);
            V.V = new int [numEnt];
            System.arraycopy(copia.V, 0, V.V, 0, copia.V.length);
            V.dim = num;
        }
    }
    
    public String fechaLiteral(int dia, int mes, int año) {
        String fecha = "" + dia + " de ";
        switch(mes) {
            case 1 -> fecha = fecha + "enero de ";
            case 2 -> fecha = fecha + "febrero de ";
            case 3 -> fecha = fecha + "marzo de ";
            case 4 -> fecha = fecha + "abril de ";
            case 5 -> fecha = fecha + "mayo de ";
            case 6 -> fecha = fecha + "junio de ";
            case 7 -> fecha = fecha + "julio de ";
            case 8 -> fecha = fecha + "agosto de ";
            case 9 -> fecha = fecha + "septiembre de ";
            case 10 -> fecha = fecha + "octubre de ";
            case 11 -> fecha = fecha + "noviembre de ";
            case 12 -> fecha = fecha + "diciembre de ";
        }
        fecha = fecha + año;
        return fecha;
    }
    
    public String mostrarFecha(int pos) {
        String fecha;
        if (getDia(pos) <= 9 || getMes(pos) <= 9) {
            if (getDia(pos) <= 9) {
                fecha = "0" + getDia(pos) + " / ";
            } else {
                fecha = "" + getDia(pos) + " / ";
            }
            if (getMes(pos) <= 9) {
                fecha = fecha + "0" + getMes(pos) + " / " + getAño(pos);
            } else {
                fecha = fecha + getMes(pos) + " / " + getAño(pos);
            }
        } else {
            fecha = "" + getDia(pos) + " / " + getMes(pos) + " / " + getAño(pos);
        }
        return fecha;
    }
    
    @Override
    public String toString() {
        String s = "-------------------------------------\n";
        for (int i = 1; i <= dim; i++) {
            s = s + "Fecha N° " + i + ":    \n" + fechaLiteral(getDia(i), getMes(i), getAño(i)) +
                    "\n" + mostrarFecha(i) +
                    "\n-------------------------------------\n";
        }
        return s;
    }
    
}
