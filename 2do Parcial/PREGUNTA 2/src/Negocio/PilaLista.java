package Negocio;

public class PilaLista {
    
    Nodo Cima;
    int cant;
    
    public PilaLista() {
        this.Cima = null;
        this.cant = 0;
    }
    
    public boolean vacia() {
        return (Cima == null);
    }
    
    public void push(int elemento) {
        Nodo Pila = new Nodo();
        Pila.setDato(elemento);
        Pila.setEnlace(Cima);
        Cima = Pila;
        cant++;
    }
    
    public int pop() {
        int x = Cima.getDato();
        Cima = Cima.getEnlace();
        cant--;
        return x;
    }
    
    public int get() {
        return (Cima.getDato());
    }
    
    public int longitud() {
        return cant;
    }
    
    public void IntercambiarExtremos(ColaLista q) {
        if (longitud() > 1) {
            int a = pop();
            int cont = 0;
            while (longitud() > 1) {
                q.Encolar(pop());
                cont++;
            }
            int b = pop();
            push(a);
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < q.longitud() - 1; j++) {
                    q.Encolar(q.Decolar());
                }
                push(q.Decolar());
            }
            push(b);
        }
        if (!q.vacia()) {
            int c = q.Decolar();
            for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            q.Encolar(c);
        }
    }
    
    @Override
    public String toString() {
        Nodo aux = Cima;
        String s = "";
        while (aux != null) {
            s = s + "[" + aux.getDato() + "]" + "\n";
            aux = aux.getEnlace();
        }
        return s;
    }
    
}
