package _Listas;

public class ListaDoble {
    
    NodoDoble primero;
    NodoDoble ultimo;
    int cant;
    
    public ListaDoble() {}
    
    public void agregar(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cant == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        cant++;
    }
    
    public void agregarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cant == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        cant++;
    }
    
    public boolean vacia() {
        return (cant == 0);
    }
    
    public void eliminar() {
        if (cant > 0) {
            if (cant == 1) {
                primero = null;
                ultimo = null;
            } else {
                ultimo.anterior.siguiente = null;
                ultimo = ultimo.siguiente = null;
            }
            cant--;
        }
    }
    
    public void eliminarInicio() {
        if (cant > 0) {
            if (cant == 1) {
                primero = null;
                ultimo = null;
            } else{
                primero.siguiente.anterior = null;
                primero = primero.siguiente;
            }
        }
    }
    
    public void mostrar() {
        String lista = "[ ";
        NodoDoble aux = primero;
        while (aux != null) {
            lista = lista + aux.getDato() + ", ";
            aux = aux.siguiente;
        }
        if (lista.length() > 2) {
            lista = lista.substring(0, lista.length() - 2);
        }
        lista = lista + " ]";
        System.out.println(lista);
    }
    
    public static void main(String[] args) {
        
        ListaDoble A = new ListaDoble();
        
        A.agregar(3);
        A.agregar(5);
        A.agregar(7);
        A.agregar(1);
        A.agregar(6);
        A.agregarInicio(10);
        
        A.mostrar();
        
        A.eliminar();
        A.eliminarInicio();
        
        A.mostrar();
        
    }
    
}
