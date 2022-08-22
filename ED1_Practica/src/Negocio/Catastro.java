package Negocio;

public class Catastro {
    
    VectorBitsG V;
    String Nombres[];
    public int dim;
    
    public Catastro(int cant){
        this.V = new VectorBitsG(cant, 29);
        this.Nombres = new String[cant];
        this.dim = 0;
    }
    
    public void insertar(String nombre, int sup, int zona, int uv, int manzano, int lote, 
            int pavimento, int luz, int agua, int alcant, int telef) {
        int dato = sup - 150;
        dato = dato | (zona << 8);
        dato = dato | (uv << 10);
        dato = dato | (manzano << 15);
        dato = dato | (lote << 19);
        dato = dato | (pavimento << 24);
        dato = dato | (luz << 25);
        dato = dato | (agua << 26);
        dato = dato | (alcant << 27);
        dato = dato | (telef << 28);
        //System.out.println("dato = " + dato + "   " + Integer.toBinaryString(dato));
        Nombres[dim] = nombre;
        dim++;
        V.insertar(dato, dim);
        //System.out.println(V.toString());
    }
    
    public String getNombre(int pos) {
        return Nombres[pos - 1];
    }
    
    public int getSup(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 24;
        dato = dato >>> 24;
        return dato + 150;
    }
    
    public int getZona(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 22;
        dato = dato >>> 30;
        return dato;
    }
    
    public int getUv(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 17;
        dato = dato >>> 27;
        return dato;
    }
    
    public int getManzano(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 13;
        dato = dato >>> 28;
        return dato;
    }
    
    public int getLote(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 8;
        dato = dato >>> 27;
        return dato;
    }
    
    public int getPavimento(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 7;
        dato = dato >>> 31;
        return dato;
    }
    
    public int getLuz(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 6;
        dato = dato >>> 31;
        return dato;
    }
    
    public int getAgua(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 5;
        dato = dato >>> 31;
        return dato;
    }
    
    public int getAlcant(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 4;
        dato = dato >>> 31;
        return dato;
    }
    
    public int getTelef(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 3;
        dato = dato >>> 31;
        return dato;
    }
    
    
    public String mostrarCatastro(int pos) {
        String s = "N° ";
        s = s + pos + "\n\nNombre: " + getNombre(pos) + "\nSuperficie: " + getSup(pos) + "\nZona: ";
        int zona = getZona(pos);
        switch(zona) {
            case 0 -> s = s + "Norte";
            case 1 -> s = s + "Sur";
            case 2 -> s = s + "Este";
            case 3 -> s = s + "Oeste";
        }
        s = s + "\nUv: " + getUv(pos) + "\nManzano: " + getManzano(pos) + "\nLote: " + 
                getLote(pos) + "\nServicios Basicos: ";
        s = (getPavimento(pos) == 1)? s + "\n - Pavimento": s;
        s = (getLuz(pos) == 1)? s + "\n - Luz": s;
        s = (getAgua(pos) == 1)? s + "\n - Agua": s;
        s = (getAlcant(pos) == 1)? s + "\n - Alcantarillado": s;
        s = (getTelef(pos) == 1)? s + "\n - Telefono": s;
        return s;
    }
    
    @Override
    public String toString() {
        String s = "FORMULARIO CATASTRO\n------------------------------------------\n";
        for (int i = 1; i <= dim; i++) {
            s = s + mostrarCatastro(i) + "\n------------------------------------------\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        Catastro A = new Catastro(10);
        
        A.insertar("Benjamin", 280, 2, 15, 7, 4, 1, 1, 1, 0, 0);
        A.insertar("Carlos", 178, 0, 10, 9, 7, 1, 0, 1, 0, 1);
        System.out.println(A);
                
    }
    
}
