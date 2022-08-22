package _Listas;

public class ListaOrdenada extends Lista {
    
    public ListaOrdenada() {
        super();
    }
    
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {  // primero
            inicio = nuevo;
        } else if (dato < inicio.getDato()) {  // nodoa = 1    nodob = 3
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        } else {   // nodoa = 10    nodob = 5    nodoc = 11
            Nodo anterior, actual;
            anterior = actual = inicio;
            while (actual.getEnlace() != null && dato > actual.getDato()) {
                anterior = actual;
                actual = actual.getEnlace();
            }
            if (dato > actual.getDato()) {
                anterior = actual;
            }
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
    }
    
    public static void main(String[] args) {
        
        ListaOrdenada A = new ListaOrdenada();
        
        A.insertar(10);
        A.insertar(5);
        A.insertar(4);
        A.insertar(1);
        A.insertar(25);
        A.insertar(8);
        
        A.mostrar();
        
    }
    
}
