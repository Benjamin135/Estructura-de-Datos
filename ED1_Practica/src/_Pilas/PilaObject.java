package _Pilas;

import java.util.ArrayList;

public class PilaObject {
    
    private ArrayList<Object> pila = new ArrayList<>();
    
    public void push(Object elemento) {
        pila.add(elemento);
    }
    
    public Object pop() {
        if (!pila.isEmpty()) {
            Object tmp = pila.get(pila.size() - 1);
            pila.remove(pila.size() - 1);
            return tmp;
        } else {
            return null;
        }
    }
    
    public void mostrar() {
        String S = "";
        while(!pila.isEmpty()) {
            S = S + pop() +"\n";
        }
        System.out.println(S);
    }
    
    public static void main(String[] args) {

        PilaObject A = new PilaObject();
        
        A.push(10);
        A.push("hola");
        A.push(2.5);
        A.push(true);
        A.pop();
        
        A.mostrar();
        
    }
    
}
