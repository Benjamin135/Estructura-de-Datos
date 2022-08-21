package Negocio;

public class PilaLista {
    
    Nodo Cima;
    int cant;
    
    public PilaLista() {
        this.Cima = null;
        this.cant = 0;
    }
    
    public boolean vacia() {
        return (Cima == null);
    }
    
    public void push(int elemento) {
        Nodo Pila = new Nodo();
        Pila.setDato(elemento);
        Pila.setEnlace(Cima);
        Cima = Pila;
        cant++;
    }
    
    public int pop() {
        int x = Cima.getDato();
        Cima = Cima.getEnlace();
        cant--;
        return x;
    }
    
    public int get() {
        return (Cima.getDato());
    }
    
    @Override
    public String toString() {
        Nodo aux = Cima;
        String s = "";
        while (aux != null) {
            s = s + aux.getDato() + "\n";
            aux = aux.getEnlace();
        }
        return s;
    }
    
}
