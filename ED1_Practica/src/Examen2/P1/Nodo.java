package Examen2.P1;

public class Nodo {
    
    int dato;
    Nodo enlace;
    
    public Nodo() {
        this.enlace = null;
    }
    
    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public int getDato() {
        return this.dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return this.enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "dato = " + dato + " --> enlace = " + enlace;
    }
    
}
