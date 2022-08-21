package Negocio;

public class PilaBitsDinamica {
    
    VectorBitsG Pila;
    int cantElementos;
    int cima;
    
    public PilaBitsDinamica(int NumBits) {
        this.cantElementos = 5;
        this.Pila = new VectorBitsG(cantElementos, NumBits);
        this.cima = 0;
    }
    
    public boolean vacia() {
        return (cima == 0);
    }
    
    public boolean llena() {
        return (cima == Pila.cant);
    }
    
    public void push(int elemento) {
        if (cima < cantElementos) {
            cima++;
            Pila.insertar(elemento, cima);
        } else {
            int n = cantElementos;
            cantElementos += 10;
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                int ele = Pila.sacar(i + 1);
                v[i] = ele;
            }
            int cantBits = Pila.numBits;
            Pila = new VectorBitsG(cantElementos, cantBits);
            for (int i = 0; i < n; i++) {
                int ele = v[i];
                Pila.insertar(ele, i + 1);
            }
            cima++;
            Pila.insertar(elemento, cima);
        }  
    }
    
    public int pop() {
        cima--;
        return (Pila.sacar(cima + 1));
    }
    
    public int get() {
        return (Pila.sacar(cima));
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = cima; i >= 1; i--) {
            if (Pila.sacar(i) >= 10 && Pila.sacar(i) < 100) {
                s = s + "|  " + Pila.sacar(i) + " |\n";     
            } else if (Pila.sacar(i) >= 100 && Pila.sacar(i) < 1000) {              
                s = s + "| " + Pila.sacar(i) + " |\n";      
            } else {                                        
                s = s + "|   " + Pila.sacar(i) + " |\n";
            }
        }
        s = s + "¯¯¯¯¯¯¯";
        return s;
    }
    
}
