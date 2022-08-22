package ListaDirectorio;

import java.io.Serializable;

public class ListaG <TipoDato extends Comparable> implements Serializable {

    NodoGP<TipoDato> L;
    int Cant;

    public ListaG() {
        L = null;
        Cant = 0;
    }
    
    public int getCant() {
        return Cant;
    }

    public void Insertar(TipoDato Dato) {
        if (L == null) { //esta vacia
            NodoGP P = new NodoGP<TipoDato>();
            P.setDato(Dato);
            L = P;
            Cant++;
        } else {
            NodoGP<TipoDato> Ant = null;
            NodoGP<TipoDato> Aux = L;
            while (Aux != null && (Aux.getDato().compareTo(Dato) <= 0)) {
                Ant = Aux;
                Aux = Aux.getEnlace();
            }
            NodoGP P = new NodoGP<>(Dato);
            if (Ant == null) {//inserta en el primero                
                P.setEnlace(L);
                L = P;
                Cant++;
            } else {
                if (Ant.getDato().compareTo(Dato) != 0) {
                    Ant.setEnlace(P);
                    P.setEnlace(Aux);
                    Cant++; 
                }
            }
        }
    }

    public void Eliminar(TipoDato elemento) {
        if (L != null) {
            NodoGP<TipoDato> Aux = L;
            NodoGP<TipoDato> Ant = null;
            while ((Aux != null) && (Aux.getDato().compareTo(elemento) != 0)) {
                Ant = Aux;
                Aux = Aux.getEnlace();
            }
            if (Aux != null) {
                if (Ant == null) {
                    L = L.getEnlace();
                    Cant--;

                } else {
                    Ant.setEnlace(Aux.getEnlace());
                    Cant--;
                }
            }
        }
    }

    @Override
    public String toString() {
        String S = "";
        NodoGP<TipoDato> Aux = L;
        while (Aux != null) {
            S = S + Aux.toString() + '\n';
            Aux = Aux.getEnlace();
        }
        return S;
    }

}
