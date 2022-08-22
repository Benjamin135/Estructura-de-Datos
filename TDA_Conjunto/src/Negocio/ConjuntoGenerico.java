package Negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ConjuntoGenerico<TipoDato extends Comparable> implements Serializable {
    
    ArrayList<TipoDato> Datos;
    
    public ConjuntoGenerico() {
        this.Datos = new ArrayList<>();
    }
    
    public int getDim() {
        return Datos.size();
    }
    
    public boolean esVacia() {
        return (Datos.isEmpty());
    }
    
    public void insertar(TipoDato elemento) {
        if (esVacia()) {
            Datos.add(elemento);
        } else {
            if (!pertenece(elemento)) {
                Datos.add(elemento);
            }
        }
        Collections.sort(Datos);
    }
    
    public void eliminar(TipoDato elemento) {
        if (!esVacia()) {
            Datos.remove(elemento);
        }
    }
    
    public boolean pertenece(TipoDato elemento) {
        boolean b = false;
        int i= 0;
        while (i < Datos.size() && b == false) {
            if (Datos.get(i) == elemento) {
                b = true;
            }
            i++;
        }
        return b;
    }
 
    public void union(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        for (int i = 0; i < A.Datos.size(); i++) {
            insertar(A.Datos.get(i));
        }
        for (int j = 0; j < B.Datos.size(); j++) {
            insertar(B.Datos.get(j));
        }
    }
    
    public void interseccion(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        for (int i = 0; i < A.Datos.size(); i++) {
            if (B.pertenece(A.Datos.get(i))) {
                insertar(A.Datos.get(i));
            }
        }
    }
    
    public void diferencia(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        for (int i = 0; i < A.Datos.size(); i++) {
            if (!B.pertenece(A.Datos.get(i))) {
                insertar(A.Datos.get(i));
            }
        }
    }
    
    public void diferenciaSimetrica(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        for (int i = 0; i < A.Datos.size(); i++) {
            if (!B.pertenece(A.Datos.get(i))) {
                insertar(A.Datos.get(i));
            }
        }
        for (int i = 0; i < B.Datos.size(); i++) {
            if (!A.pertenece(B.Datos.get(i))) {
                insertar(B.Datos.get(i));
            }
        }
    }
    
    private int cantElementos(ConjuntoGenerico<TipoDato> A) {
        int cant = 0;
        for (int i = 0; i < A.Datos.size(); i++) {
            cant++;
        }
        return cant;
    }
    
    public boolean subconjunto(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        ConjuntoGenerico D = new ConjuntoGenerico<TipoDato>();
        for (int i = 0; i < A.Datos.size(); i++) {
            if (B.pertenece(A.Datos.get(i))) {
                D.insertar(A.Datos.get(i));
            }
        }
        return (cantElementos(A) == cantElementos(D));
    }
    
    public boolean SubConjunto(ConjuntoGenerico<TipoDato> A, ConjuntoGenerico<TipoDato> B) {
        int i = 0;
        while (i < A.Datos.size() && B.pertenece(A.Datos.get(i))) {
            i++;
        }
        return (i == A.Datos.size());
    }
    
    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 0; i < Datos.size(); i++) {
            S = S + Datos.get(i) + ", ";
        }
        if (!esVacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;  
    }

    public static void main(String[] args) {
        
        ConjuntoGenerico A = new ConjuntoGenerico<Integer>();
        ConjuntoGenerico B = new ConjuntoGenerico<Integer>();
        ConjuntoGenerico C = new ConjuntoGenerico<Integer>();
        
        A.insertar(5);
        A.insertar(10);
        A.insertar(3);
//        A.insertar(7);
        
        B.insertar(8);
        B.insertar(5);
        B.insertar(17);
        B.insertar(10);
        B.insertar(1);
        
        //C.union(A, B);
        //C.interseccion(A, B);
        //C.diferencia(B, A);
        C.diferenciaSimetrica(A, B);
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
        boolean b = C.SubConjunto(A, B);
        if (b) {
            System.out.println("A es subconjunto de B");
        } else {
            System.out.println("A no es subconjunto de B");
        }
        
        B.eliminar(10);
        B.eliminar(5);
        
        System.out.println("B = " + B);
        
    }
    
}
