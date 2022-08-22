package _Arboles;

public class Arbol {
    
    Nodo raiz;
    
    public Arbol() {
        this.raiz = null;
    }
    
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while (true) {
                padre = aux;
                if (dato < aux.dato) { // izquierda
                    aux = aux.hijoIzq;
                    if (aux == null) {
                        padre.hijoIzq = nuevo;
                        return;
                    }
                } else {  // derecha
                    aux = aux.hijoDer; 
                    if (aux == null) {
                        padre.hijoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean vacia() {
        return (raiz == null);
    }
    
    public void mostrar(Nodo nodo) {
        if (nodo != null) {
            mostrar(nodo.hijoIzq);
            System.out.println(nodo.dato);
            mostrar(nodo.hijoDer);
        }
    }
    
    public static void main(String[] args) {
        
        Arbol A = new Arbol();
        
        A.insertar(5);
        A.insertar(2);
        A.insertar(7);
        A.insertar(10);
        A.insertar(1);
        A.insertar(8);
        
        A.mostrar(A.raiz);
        
    }
    
}
