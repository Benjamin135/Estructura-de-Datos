package ListaDirectorio;

import java.io.Serializable;

public class Directorio implements Comparable, Serializable {
    
    VectorBitsG V;
    String Nombres[];
    int Numeros[];
    int dim;
    
    public Directorio(int cant) {
        this.V = new VectorBitsG(cant, 17);
        this.Nombres = new String[cant];
        this.Numeros = new int[cant];
        this.dim = 0;
    }
    
    public void insertar(String nombre, int numero, int tipoNumero, int dia, int mes, int año, int grupo) {
        int dato = tipoNumero;
        dato = dato | (dia << 1);
        dato = dato | (mes << 6);
        año = año - 2000;
        dato = dato | (año << 10);
        dato = dato | (grupo << 15);
        //System.out.println("dato = " + dato + "   " + Integer.toBinaryString(dato));
        Nombres[dim] = nombre;
        Numeros[dim] = numero;
        dim++;
        V.insertar(dato, dim);
    }
    
    public String getNombre(int pos) {
        return Nombres[pos - 1];
    }
    
    public int getNumero(int pos) {
        return Numeros[pos - 1];
    }
    
    public int getTipoNumero(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 31;
        dato = dato >>> 31;
        return dato;
    }
    
    public int getDia(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 26;
        dato = dato >>> 27;
        return dato;
    }
    
    public int getMes(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 22;
        dato = dato >>> 28;
        return dato;
    }
    
    public int getAño(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 17;
        dato = dato >>> 27;
        return 2000 + dato;
    }
    
    public int getGrupo(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 15;
        dato = dato >>> 30;
        return dato;
    }
    
    public String MostrarDirectorio(int pos) {
        String s = "";
        s = s + "Nombre: " + getNombre(pos) + "\nN° Telefono: " + getNumero(pos) + "\nTipo de Telefono: ";
        int tipoNum = getTipoNumero(pos);
        switch(tipoNum) {
            case 0 -> s = s + "Movil";
            case 1 -> s = s + "Fijo";
        }
        s = s + "\nFecha de nacimiento: ";// + getDia(pos) + "/" + getMes(pos) + "/" + getAño(pos) ;
        
        if (getDia(pos) <= 9 || getMes(pos) <= 9) {
            if (getDia(pos) <= 9) {
                s = s + "0" + getDia(pos) + "/";
            } else {
                s = s + getDia(pos) + "/";
            }
            if (getMes(pos) <= 9) {
                s = s + "0" + getMes(pos) + "/" + getAño(pos);
            } else {
                s = s + getMes(pos) + "/" + getAño(pos);
            }
        } else {
            s = s + getDia(pos) + "/" + getMes(pos) + "/" + getAño(pos);
        }
        s = s + "\nGrupo: ";
        int grupo = getGrupo(pos);
        switch(grupo) {
            case 0 -> s = s + "VIP";
            case 1 -> s = s + "Amigos";
            case 2 -> s = s + "Familia";
        }
        return s;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 1; i <= dim; i++) {
            s = s + MostrarDirectorio(i);
        }
        return s;
    }
    
    @Override
    public int compareTo(Object o) {
        Directorio A = (Directorio)o;
        //return ((getNumero(1)<A.getNumero(1))? -1: (getNumero(1)>A.getNumero(1))? 1: 0);
        return (getNombre(1).compareTo(A.getNombre(1)));
    }
    
    public static void main(String[] args) {
        
        ListaG D = new ListaG<Directorio>();
        Directorio A = new Directorio(10);
        Directorio B = new Directorio(10);
        Directorio C = new Directorio(10);
        Directorio E = new Directorio(10);
        Directorio F = new Directorio(10);
        
        A.insertar("Benjamin", 76075113, 0, 5, 6, 2002, 1);
        B.insertar("Carlos", 77318113, 1, 8, 10, 2012, 0);
        C.insertar("Juan", 67154231, 1, 25, 12, 2020, 2);
        E.insertar("Andres", 78134641, 0, 19, 7, 2010, 0);
        F.insertar("Juan Carlos", 67154231, 1, 25, 12, 2020, 2);
        
        D.Insertar(C);
        D.Insertar(B);
        D.Insertar(A);
        D.Insertar(E);
        D.Insertar(F);
        
        System.out.println(D.toString());
        
    }

    
            
    
}
