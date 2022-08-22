package Negocio;

public class FichaVacuna {
    
    String Nombres[];
    String Apellidos[];
    VectorBitsG V;
    public int dim;
    
    public FichaVacuna(int cantFicha) {
        this.dim = 0;
        V = new VectorBitsG(cantFicha, 19);
        Nombres = new String[cantFicha];
        Apellidos = new String[cantFicha];
    }
    
    public void insertar(String nombre, String apellido, int dia, int mes, int año, int genero, int edad) {
        int mask = dia;
        this.dim++;
        mes = mes << 5;
        mask = mask | mes;
        año = año - 2020;
        año = año << 9;
        mask = mask | año;
        genero = genero << 11;
        mask = mask | genero;
        edad = edad << 12;
        mask = mask | edad;
        V.insertar(mask, dim);
        Nombres[dim] = nombre;
        Apellidos[dim] = apellido;
    }
    
    public String getNombre(int num) {
        return Nombres[num];
    }
    
     public String getApellido(int num) {
        return Apellidos[num];
    }
    
    public int getDia(int num) {
        int x = V.sacar(num);
        x = x << 27;
        x = x >>> 27;
        return x;
    }
    
    public int getMes(int num) {
        int x = V.sacar(num);
        x = x << 23;
        x = x >>> 28;
        return x;
    }
    
    public int getAño(int num) {
        int x = V.sacar(num);
        x = x << 21;
        x = x >>> 30;
        return x + 2020;
    }
    
    public int getGenero(int num) {
        int x = V.sacar(num);
        x = x << 20;
        x = x >>> 31;
        return x;
    }
    
    public int getEdad(int num) {
        int x = V.sacar(num);
        x = x >>> 12;
        return x;
    }
    
    public void setNombre(int num, String nombre) {
        Nombres[num] = nombre;
    }
    
    public void setApellido(int num, String apellido) {
        Apellidos[num] = apellido;
    }
    
    public void setDia(int num, int dia) {
        int x = V.sacar(num);
        int mask = (int) (Math.pow(2, 5) - 1) ;
        mask = ~mask;
        x = x & mask;
        x = x | dia;
        V.insertar(x, num);
    }
    
    public void setMes(int num, int mes) {
        int x = V.sacar(num);
        int mask = (int) (Math.pow(2, 4) - 1);
        mask = mask << 5;
        mask = ~mask;
        x = x & mask;
        mes = mes << 5;
        x = x | mes;
        V.insertar(x, num);
    }
    
    public void setAño(int num, int año) {
        int x = V.sacar(num);
        int mask = (int) (Math.pow(2, 2) - 1);
        mask = mask << 9;
        mask = ~mask;
        x = x & mask;
        año = año - 2020;
        año = año << 9;
        x = x | año;
        V.insertar(x, num);
    }
    
    public void setGenero(int num, int genero) {
        int x = V.sacar(num);
        int mask = 1;
        mask = mask << 11;
        mask = ~mask;
        x = x & mask;
        genero = genero << 11;
        x = x | genero;
        V.insertar(x, num);
    }
    
    public void setEdad(int num, int edad) {
        int x = V.sacar(num);
        int mask = (int) (Math.pow(2, 7) - 1);
        mask = mask << 12;
        mask = ~mask;
        x = x & mask;
        edad = edad << 12;
        x = x | edad;
        V.insertar(x, num);
    }
    
    public String mostrarFicha(int num) {
        String s;
        if (num >= 1 && num <= dim) {
            s = "N° " + num + "\nNombres: " + Nombres[num] + "\nApellidos: " + Apellidos[num] 
                + "\nFecha: " + getDia(num) + "/" + getMes(num) + "/" + getAño(num) + "\nGenero: ";
            s = (getGenero(num) == 1)? s + "Masculino" :s + "Femenino";
            s = s + "\nEdad: " + getEdad(num);
        } else {
            s = "No se a encontrado la ficha N° " + num;
        }
        return s;
    }
    
    @Override
    public String toString() {
        String S = "-------------------------------------\n";
        for (int i = 1; i <= dim; i++) {
            S = S + mostrarFicha(i) + "\n-------------------------------------\n";
        }
        return S;
    }
    
}
