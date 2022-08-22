package _Listas;

public class NodoDoble {
    
    int dato;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    public NodoDoble() {
        this.siguiente = null;
        this.anterior = null;
    }
    
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getDato() {
        return dato;
    }

}
