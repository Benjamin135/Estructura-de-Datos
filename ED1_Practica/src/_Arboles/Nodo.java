package _Arboles;

public class Nodo {
    
    int dato;
    Nodo hijoIzq;
    Nodo hijoDer;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    
    
    @Override
    public String toString() {
        return "Dato = " + dato;
    }
    
}
