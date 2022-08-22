package Negocio;

import java.io.Serializable;

public class PilaListaG <TipoDato> implements Serializable {
    
    NodoG<TipoDato> Cima;
    int cant;
    
    public PilaListaG() {
        this.Cima = null;
        this.cant = 0;
    }
    
    public boolean vacia() {
        return (Cima == null);
    }
    
    public void push(TipoDato elemento) {
        NodoG<TipoDato> Pila = new NodoG<>();
        Pila.setDato(elemento);
        Pila.setEnlace(Cima);
        Cima = Pila;
        cant++;
    }
    
    public TipoDato pop() {
        TipoDato x = Cima.getDato();
        Cima = Cima.getEnlace();
        cant--;
        return x;
    }
    
    public TipoDato peek() {
        return (Cima.getDato());
    }
    
    public int size() {
        return cant;
    }
    
    @Override
    public String toString() {
        NodoG<TipoDato> aux = Cima;
        String s = "";
        while (aux != null) {
            s = s + "[" + aux.getDato() + "]" + "\n";
            aux = aux.getEnlace();
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        PilaListaG A = new PilaListaG<Character>();
        PilaListaG B = new PilaListaG<Integer>();
        
        A.push('+');
        A.push('-');
        A.push('/');
        A.push('*');
        
        B.push(1);
        B.push(2);
        B.push(3);
        B.push(4);
        B.push(5);
        
        System.out.println(A);
        System.out.println(B);
        
    }
    
}
