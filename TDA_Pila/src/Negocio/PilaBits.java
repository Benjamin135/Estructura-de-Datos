package Negocio;

public class PilaBits {
    
    VectorBitsG Pila;
    int cima;
    
    public PilaBits(int cant, int NumBits) {
        this.Pila = new VectorBitsG(cant, NumBits);
        this.cima = 0;
    }
    
    public boolean vacia() {
        return (cima == 0);
    }
    
    public boolean llena() {
        return (cima == Pila.cant);
    }
    
    public void push(int elemento) {
        if (llena()) {
            System.out.println("Error Pila Llena");
            System.exit(1);
        } else {
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
