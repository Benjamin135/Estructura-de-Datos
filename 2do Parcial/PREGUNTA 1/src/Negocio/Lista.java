package Negocio;

public class Lista {

    Nodo L;
    int cant;

    public Lista() {
        this.L = null;
        this.cant = 0;
    }

    public boolean vacia() {
        return (L == null);
    }

    public void insertar(int elemento) {
        if (vacia()) { // La lista esta vacia
            Nodo p = new Nodo();
            p.setDato(elemento);
            L = p;
            cant++;
        } else { // Hay mas elementos en la lista
            Nodo aux = L;
            Nodo ant = null;
            while (aux != null && aux.getDato() <= elemento) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (ant == null) { // Insertamos en la cabeza de la lista
                Nodo p = new Nodo();
                p.setDato(elemento);
                p.setEnlace(L);
                L = p;
                cant++;
            } else {  // Insertamos en el cuerpo de la lista
                if (ant.getDato() != elemento) {
                    Nodo p = new Nodo();
                    p.setDato(elemento);
                    ant.setEnlace(p);
                    p.setEnlace(aux);
                    cant++;
                }
            }
        }
    }

    public void eliminar(int elemento) {
        if (!vacia()) {
            Nodo aux = L;
            Nodo ant = null;
            while (aux != null && aux.getDato() != elemento) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (aux != null) {
                if (ant == null) {
                    L = L.getEnlace();
                    cant--;
                } else {
                    ant.setEnlace(aux.getEnlace());
                    cant--;
                }
            }
        }
    }

    public int getDato(int pos) {
        Nodo aux = L;
        for (int i = 1; i < pos; i++) {
            aux = aux.getEnlace();
        }
        return aux.getDato();
    }
    
    public int longitud() {
        return cant;
    }

    public void volcar2() {
        if (cant > 1) {
            Nodo ant = null;
            Nodo aux = L;
            while (aux != null) {
                Nodo sig = aux.getEnlace();
                if (sig != null) {
                   aux.setEnlace(sig.getEnlace());
                   sig.setEnlace(aux);
                    if (ant == null) {
                        L = sig;
                    } else {
                        ant.setEnlace(sig);
                    }
                }
                ant = aux;
                aux = aux.getEnlace();
            }
        }
    }

    
    
    @Override
    public String toString() {
        String lista = "L->";
        Nodo aux = L;
        while (aux != null) {
            lista = lista + "[" + aux.getDato() + "]->";
            aux = aux.getEnlace();
        }
//        if (lista.length() > 7) {
//            lista = lista.substring(0, lista.length() - 2);
//        }
        lista = lista + "null";
        return lista;
    }

}
