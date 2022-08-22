package _Listas;

public class Lista {
    
    protected Nodo inicio;
    
    public Lista() {
        this.inicio = null;
    }
    
    public void agregarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setEnlace(inicio);
        inicio = nuevo;
    }
    
    @SuppressWarnings("empty-statement")
    public void agregarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setEnlace(null);
        
        if (inicio == null) {
            inicio = nuevo;
            return;
        }
        
        Nodo aux;
        for (aux = inicio; aux.getEnlace() != null; aux = aux.getEnlace());
        aux.setEnlace(nuevo);
    }
    
    @SuppressWarnings("empty-statement")
    public Nodo buscar(int dato) {
        Nodo aux;
        for (aux = inicio; aux != null; aux = aux.getEnlace());
        if (dato == aux.getDato()) {
            return aux;
        }
        return null;
    }
    
    public void eliminar(int dato) {
        boolean encontrado;
        Nodo actual, anterior;
        actual = inicio;
        anterior = null;
        encontrado = false;
        while (actual != null && !encontrado) {
            encontrado = (actual.getDato() == dato);
            if (!encontrado) {
                anterior = actual;
                actual = actual.getEnlace();
            }
        }
        
        if (actual != null) {
            if (actual == inicio) {
                inicio = actual.getEnlace();
            } else {
                anterior.setEnlace(actual.getEnlace());
            }
        }
    }
    
    public void mostrar() {
        String lista = "[ ";
        Nodo aux = inicio;
        while (aux != null) {
            lista = lista + aux.getDato() + ", ";
            aux = aux.getEnlace();
        }
        if (lista.length() > 2) {
            lista = lista.substring(0, lista.length() - 2);
        }
        lista = lista + " ]";
        System.out.println(lista);
    }
    
    public static void main(String[] args) {
        
        Lista A = new Lista();
        
        A.agregarInicio(10);
        A.agregarInicio(5);
        A.agregarInicio(2);
        A.agregarFinal(15);
        
        A.mostrar();
        
        A.eliminar(10);
        
        A.mostrar();
        
    }
    
}
