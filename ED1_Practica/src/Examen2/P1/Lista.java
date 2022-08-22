package Examen2.P1;

public class Lista {

    Nodo inicio;
    int cant;

    public Lista() {
        this.inicio = null;
        this.cant = 0;
    }

    public boolean vacia() {
        return (inicio == null);
    }

    public void insertar(int elemento) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(elemento);
        if (vacia()) { // La lista esta vacia
            inicio = nuevo;
        } else { // Hay mas elementos en la lista
            Nodo aux = inicio;
            Nodo ant = null;
            while (aux != null && aux.getDato() <= elemento) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (ant == null) { // Insertamos en la cabeza de la lista
                nuevo.setEnlace(inicio);
                inicio = nuevo;
            } else {  // Insertamos en el cuerpo de la lista
                if (ant.getDato() != elemento) {
                    ant.setEnlace(nuevo);
                    nuevo.setEnlace(aux);
                }
            }
        }
        cant++;
    }

    public void eliminar(int elemento) {
        if (!vacia()) {
            Nodo aux = inicio;
            Nodo ant = null;
            while (aux != null && aux.getDato() != elemento) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (aux != null) {
                if (ant == null) {
                    inicio = inicio.getEnlace();
                    cant--;
                } else {
                    ant.setEnlace(aux.getEnlace());
                    cant--;
                }
            }
        }
    }

     /* 
        INTERCALAR ELEMENTOS DE UNA LISTA
        SI ES IMPAR --> LISTA = [1, 2, 3, 4, 5, 6, 7]
        RESUTADO    --> LISTA = [1, 3, 2, 5, 4, 7, 6]
    
        SI ES PAR   --> LISTA = [1, 2, 3, 4, 5, 6, 7, 8]
        RESUTADO    --> LISTA = [2, 1, 4, 3, 6, 5, 8, 7]
    */
    
    public void intercalar() {
        if (cant > 1) {
            Nodo aux;
            Nodo ant;
            if (cant % 2 != 0) {
                aux = inicio.getEnlace();
                ant = inicio;
            } else {
                aux = inicio;
                ant = null;
            }
            while (aux != null) {
                Nodo sig = aux.getEnlace();
                aux.setEnlace(sig.getEnlace());
                sig.setEnlace(aux);
                if (ant == null) {
                    inicio = sig;
                    ant = aux;
                } else {
                    ant.setEnlace(sig);
                    ant = ant.getEnlace().getEnlace();
                }
                aux = ant.getEnlace();
            }
        }
    }

    public void intercalar2() {
        if (cant > 1) {
            Nodo aux;
            Nodo ant;
            if (cant % 2 == 0) {
                aux = inicio;
                ant = null;
            } else {
                ant = inicio;
                aux = ant.getEnlace();
            }
            while (aux != null) {
                Nodo sig = aux.getEnlace();
                aux.setEnlace(sig.getEnlace());
                sig.setEnlace(aux);
                if (inicio == aux) {
                    inicio = sig;
                } else {
                    ant.setEnlace(sig);
                }
                ant = aux;
                aux = aux.getEnlace();
            }
        } 
    }

    public boolean pertenece(int elemento) {
        boolean x = false;
        Nodo aux = inicio;
        while (aux != null && aux.getDato() != elemento) {
            aux = aux.getEnlace();
        }
        if (aux != null) {
            x = true;
        }
        return x;
    }

    public int getDato(int pos) {
        Nodo aux = inicio;//3
        for (int i = 1; i < pos; i++) {
            aux = aux.getEnlace();
        }
        return aux.getDato();
    }

    @Override
    public String toString() {
        String lista = "L -> [ ";
        Nodo aux = inicio;
        while (aux != null) {
            lista = lista + aux.getDato() + ", ";
            aux = aux.getEnlace();
        }
        lista = lista.substring(0, lista.length() - 2);
        lista = lista + " ]";
        return lista;
    }

    public static void main(String[] args) {

        Lista A = new Lista();
        Lista B = new Lista();

        A.insertar(1);
        A.insertar(2);
        A.insertar(3);
        A.insertar(4);
        A.insertar(5);
        A.insertar(6);
        A.insertar(7);
        
        System.out.println(A);
        A.intercalar();
        System.out.println(A);

        B.insertar(1);
        B.insertar(2);
        B.insertar(3);
        B.insertar(4);
        B.insertar(5);
        B.insertar(6);
        B.insertar(7);
        B.insertar(8);

        System.out.println();
        System.out.println(B);
        B.intercalar();
        System.out.println(B);

    }

}
