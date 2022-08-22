package _Pilas;

public class Pila {
    
    private Nodo ultimo;
    int cant;
    
    public Pila() {
        this.ultimo = null;
        this.cant = 0;
    }
    
    public boolean vacia(){
        return (ultimo == null);
    }
    
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        cant++;
    }
    
    public int pop() {
        int tmp = ultimo.dato;
        ultimo = ultimo.siguiente;
        cant--;
        return tmp;
    }
    
    public int peek() {
        return ultimo.dato;
    }
    
    public int size() {
        return cant;
    }
    
    public void clear() {
        while (!vacia()) {
            pop();
        }
    }
    
    public void mostrar() {
        String pila = "";
        while(!vacia()) {
            pila = pila + pop() +"\n";
        }
        System.out.println(pila);
    }
    
    public static void main(String[] args) {
        
        Pila A = new Pila();
        
        A.push(5);
        A.push(2);
        A.push(7);
        A.push(10);
        A.push(6);
        A.pop();
        A.pop();
        
        A.mostrar();
        
    }
    
}
