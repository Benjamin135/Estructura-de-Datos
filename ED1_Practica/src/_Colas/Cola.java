package _Colas;

import java.util.LinkedList;

public class Cola {
    
    Nodo primero;
    Nodo ultimo;
    int tamaño;
    
    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public boolean vacia() {
        return (primero == null);
    }
    
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            primero = nuevo;
        } else {
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamaño++;
    }
    
    public int eliminar() {
        int tmp = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return tmp;
    }
    
    public int inicio() {
        return primero.dato;
    }
    
    public int size() {
        return tamaño;
    }
    
    public void mostrar() {
        String cola = "[ ";
        while (!vacia()) {
            cola = cola + eliminar() +", ";
        }
        if (cola.length() > 2) {
            cola = cola.substring(0, cola.length() - 2);
        }
        cola = cola + " ]";
        System.out.println(cola);
    }
    
    public static void main(String[] args) {
        
        Cola A = new Cola();
        
        A.insertar(5);
        A.insertar(10);
        A.insertar(1);
        A.insertar(7);
        A.insertar(3);
        
        A.mostrar();
        
    }
    
}
