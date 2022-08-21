package Negocio;

public class Domino {

    Nodo inicio;
    Nodo fin;
    int cant;

    public Domino() {
        this.inicio = null;
        this.fin = null;
        this.cant = 0;
    }

    public boolean vacia() {
        return (inicio == null);
    }

    public void insertar(int izq, int der) {
        if (izq >= 1 && izq <= 6 && der >= 1 && der <= 6) {
            if (vacia()) {
                Nodo nuevo = new Nodo(izq, der);
                inicio = nuevo;
                fin = nuevo;
                cant++;
            } else {
                if (inicio.getDatoIzq() == izq) {
                    Nodo nuevo = new Nodo(der, izq);
                    nuevo.setEnlaceDer(inicio);
                    inicio.setEnlaceIzq(nuevo);
                    inicio = nuevo;
                    cant++;
                } else if (inicio.getDatoIzq() == der) {
                    Nodo nuevo = new Nodo(izq, der);
                    nuevo.setEnlaceDer(inicio);
                    inicio.setEnlaceIzq(nuevo);
                    inicio = nuevo;
                    cant++;
                } else if (fin.getDatoDer() == izq) {
                    Nodo nuevo = new Nodo(izq, der);
                    nuevo.setEnlaceIzq(fin);
                    fin.setEnlaceDer(nuevo);
                    fin = nuevo;
                    cant++;
                } else if (fin.getDatoDer() == der) {
                    Nodo nuevo = new Nodo(der, izq);
                    nuevo.setEnlaceIzq(fin);
                    fin.setEnlaceDer(nuevo);
                    fin = nuevo;
                    cant++;
                }
            }
        }
    }

    @Override
    public String toString() {
        String domino = "";
        Nodo Aux = inicio;
        while (Aux != null) {
            domino = domino + Aux.toString() + " ";
            Aux = Aux.getEnlaceDer();
        }
        return domino;
    }

}
