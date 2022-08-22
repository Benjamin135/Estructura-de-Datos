package Negocio;

public class ConjuntoBits {

    Bitwise C[];
    int inicio;
    int fin;
    int cant;

    public ConjuntoBits(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        int numElemento = fin - inicio + 1;
        int numBitwise = numElemento / 32;
        if (numElemento % 32 != 0) {
            numBitwise++;
        }
        this.C = new Bitwise[numBitwise];
        for (int i = 0; i < numBitwise; i++) {
            C[i] = new Bitwise();
        }
        this.cant = numElemento;
    }

    public boolean esVacia() {
        return (cant == 0);
    }

    public void Insertar(int elemento) {
        //redimensionar(elemento);
        if (elemento >= inicio && elemento <= fin) {
            //int numBit = calcularNumBit(elemento);
            int numBit = calcularNumBit(elemento - inicio + 1);
            int numBitwise = calcularNumBitwise(elemento);
            C[numBitwise].encenderBit(numBit);
        } else {
            System.out.println("Elemento fuera de rango");
        }
    }

    public void Eliminar(int elemento) {
        int numBit = calcularNumBit(elemento);
        int numBitwise = calcularNumBitwise(elemento);
        C[numBitwise].apagarBit(numBit);
    }

    public boolean pertenece(int elemento) {
        int numBit = calcularNumBit(elemento);
        int numBitwise = calcularNumBitwise(elemento);
        return (C[numBitwise].getBit(numBit) == 1);
    }

    public void union(ConjuntoBits A, ConjuntoBits B) {
        for (int i = 1; i <= A.cant; i++) {
            if (A.pertenece(i)) {
                Insertar(i);
            }
        }
        for (int j = 1; j <= B.cant; j++) {
            if (B.pertenece(j)) {
                Insertar(j);
            }
        }
    }

    public void Union(ConjuntoBits A, ConjuntoBits B) {
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V | B.C[i].V;
        }
    }

    public void Interseccion(ConjuntoBits A, ConjuntoBits B) {
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V & B.C[i].V;
        }
    }

    private int numBitwise(ConjuntoBits A) {
        int numBitwise = A.cant / 32;
        if (A.cant % 32 != 0) {
            numBitwise++;
        }
        return numBitwise;
    }

    public boolean subconjunto(ConjuntoBits A, ConjuntoBits B) {
        boolean b = true;
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V & B.C[i].V;
        }
        for (int i = 0; i < numBitwiseA; i++) {
            if (this.C[i].V != A.C[i].V) {
                b = false;
            }
        }
        return b;
    }

    public void diferencia(ConjuntoBits A, ConjuntoBits B) {
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V & ~B.C[i].V;
        }
    }

    public void diferenciaSimetrica(ConjuntoBits A, ConjuntoBits B) {
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V ^ B.C[i].V;
        }
    }

    private int calcularNumBit(int pos) {
        return ((pos - 1) % 32) + 1;
    }

    private int calcularNumBitwise(int pos) {
        return ((pos - 1) / 32);
    }

    private boolean vacia() {
        boolean b = true;
        int numBitwise = numBitwise(this);
        for (int i = 0; i < numBitwise; i++) {
            if (C[i].V != 0) {
                b = false;
            }
        }
        return b;
    }

    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 1; i <= cant; i++) {
            if (pertenece(i)) {
                S = S + (i + inicio - 1) + ", ";
            }
        }
        if (!vacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;
    }

}
