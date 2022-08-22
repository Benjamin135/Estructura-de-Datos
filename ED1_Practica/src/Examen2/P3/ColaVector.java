package Examen2.P3;

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
    
    public int Get() {
        return Cola[Frente];
    }
    
    public void eliminarRepetidos() {
        
    }
    
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
    
    public static void main(String[] args) {
        
        ColaVector A = new ColaVector(10);

        A.Encolar(10);
        A.Encolar(5);
        A.Encolar(15);
        A.Encolar(1);
        A.Encolar(13);
        A.Encolar(7);
        A.Encolar(39);
        A.Encolar(3);
        A.Encolar(11);
        
        System.out.println(A);
        
    }

}
