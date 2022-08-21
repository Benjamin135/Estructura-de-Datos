package Negocio;

public class ColaVector {

    int Cola[];
    int Frente;
    int Atras;

    public ColaVector(int cant) {
        this.Cola = new int[cant];
        this.Frente = -1;
        this.Atras = -1;
    }

    public boolean vacia() {
        return (Frente == -1);
    }

    public boolean llena() {
        return ((Atras + 1) % Cola.length == Frente);
    }

    public void Encolar(int elemento) {
        if (vacia()) {
            Frente = 0;
            Atras = 0;
            Cola[Atras] = elemento;
        } else {
            if (!llena()) {
                Atras = (Atras + 1) % Cola.length;
                Cola[Atras] = elemento;
            }
        }
    }

    public int Decolar() {
        int x = Cola[Frente];
        if (Frente == Atras) {
            Frente = -1;
            Atras = -1;
        } else {
            Frente = (Frente + 1) % Cola.length;
        }
        return x;
    }
    
    public int longitud() {
        int b = 0;
        if (Atras >= Frente) {
            b = (Atras - Frente + 1);
        } else {
            b = (Cola.length - Frente + (Atras + 1));
        }
        return b;
    }
    
    public int Get() {
        return Cola[Frente];
    }
    
    // ==================================================================================
    // ==============================  METODOS RECURSIVOS  ==============================
    // ==================================================================================
    
    public void invertir() {
        if (vacia()) { // caso base
            
        } else {    
            if (Atras == Frente) {
                // nada
            } else {  // caso general
                int x = Decolar();
                invertir();
                Encolar(x);
            }
        }
    }
    
    public int Menor() {
        int menor;
        if (Atras == Frente) {
            menor = Cola[Frente];
        } else {
            int x = Decolar();
            menor = Menor();
            Encolar(x);
            if (x < menor) {
                menor = x;
            }
        }
        return menor;
    }
    
    // ==================================================================================
    // ==================================================================================
    
    
    @Override
    public String toString() {
        String s = "[ ";
        int aux = Frente;
        while (aux != Atras) {
            s = s + Cola[aux] + ", ";
            aux = (aux + 1) % Cola.length;
        }
        s = s + Cola[aux] + " ]";
        return s;
    }

}
