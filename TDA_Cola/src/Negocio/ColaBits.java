package Negocio;

public class ColaBits {
    
    VectorBitsG Cola;
    int Frente;
    int Atras;

    public ColaBits(int cant, int numBits) {
        this.Cola = new VectorBitsG(cant, numBits);
        this.Frente = 0;
        this.Atras = 0;
    }

    public boolean vacia() {
        return (Frente == 0);
    }

    public boolean llena() {
        return ((Atras + 1) % Cola.dim == Frente);
    }

    public void Encolar(int elemento) {
        if (vacia()) {
            Frente = 1;
            Atras = 1;
            Cola.insertar(elemento, Atras);
        } else {
            if (!llena()) {
                Atras = (Atras + 1) % Cola.dim;
                Cola.insertar(elemento, Atras);
            }
        }
    }

    public int Decolar() {
        int x = Cola.sacar(Frente);
        if (Frente == Atras) {
            Frente = 0;
            Atras = 0;
        } else {
            Frente = (Frente + 1) % Cola.dim;
        }
        return x;
    }
    
    public int Get() {
        return Cola.sacar(Frente);
    }
    
    @Override
    public String toString() {
        String s = "[ ";
        int aux = Frente;
        while (aux != Atras) {
            s = s + Cola.sacar(aux) + ", ";
            aux = (aux + 1) % Cola.dim;
        }
        s = s + Cola.sacar(aux) + " ]";
        return s;
    }
    
}
