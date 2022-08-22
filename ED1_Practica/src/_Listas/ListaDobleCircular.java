package _Listas;

public class ListaDobleCircular {
    
    NodoDoble primero;
    NodoDoble ultimo;
    int cant;
    
    public ListaDobleCircular() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public void agregar(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    
    public void eliminar(int dato) {
        NodoDoble actual = primero;
        NodoDoble anterior = ultimo;
        do {
            if (actual.dato == dato) {
                if (actual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = ultimo;
                    primero.anterior = ultimo;
                } else if (actual == ultimo) {
                    ultimo = anterior;
                    primero.anterior = ultimo;
                    ultimo.siguiente = primero;
                } else {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);
    }
    
    public void mostrar() {
        String lista = "[ ";
        NodoDoble aux = primero;
        do {
            lista = lista + aux.getDato() + ", ";
            aux = aux.siguiente;
        } while (aux != primero);
        if (lista.length() > 2) {
            lista = lista.substring(0, lista.length() - 2);
        }
        lista = lista + " ]";
        System.out.println(lista);
    }
    
    
    public static void main(String[] args) {
        
        ListaDobleCircular A = new ListaDobleCircular();
        
        A.agregar(1);
        A.agregar(5);
        A.agregar(3);
        A.agregar(2);
        
        A.mostrar();
        
        A.eliminar(5);
        A.eliminar(2);
        A.eliminar(1);
        
        A.mostrar();
        
    }
    
}
