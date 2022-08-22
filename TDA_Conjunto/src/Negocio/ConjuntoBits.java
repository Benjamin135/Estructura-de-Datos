package Negocio;

public class ConjuntoBits {

    Bitwise C[];
    int cant;

    public ConjuntoBits() {
        int numElemento = 200;
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

    public void insertar(int elemento) {
        redimensionar(elemento);
        int numBit = calcularNumBit(elemento);
        int numBitwise = calcularNumBitwise(elemento);
        C[numBitwise].encenderBit(numBit);
    }

    public void eliminar(int elemento) {
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
                insertar(i);
            }
        }
        for (int j = 1; j <= B.cant; j++) {
            if (B.pertenece(j)) {
                insertar(j);
            }
        }
    }

    public void Union(ConjuntoBits A, ConjuntoBits B) {
        Dimensionar(A, B);
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V | B.C[i].V;
        }
    }

    public void Interseccion(ConjuntoBits A, ConjuntoBits B) {
        Dimensionar(A, B);
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
        Dimensionar(A, B);
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
        Dimensionar(A, B);
        int numBitwiseA = numBitwise(A);
        for (int i = 0; i < numBitwiseA; i++) {
            this.C[i].V = A.C[i].V & ~B.C[i].V;
        }
    }

    public void diferenciaSimetrica(ConjuntoBits A, ConjuntoBits B) {
        Dimensionar(A, B);
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

    public void redimensionarBitwise(ConjuntoBits A, ConjuntoBits B) {
        ConjuntoBits Copia = new ConjuntoBits();
        if (A.cant > B.cant) {
            Copia.C = new Bitwise[B.C.length];
            System.arraycopy(B.C, 0, Copia.C, 0, B.C.length);
            int numBitwise = A.cant / 32;
            if (numBitwise % 32 != 0) {
                numBitwise++;
            }
            B.C = new Bitwise[numBitwise];
            for (int i = 0; i < B.C.length; i++) {
                B.C[i] = new Bitwise();
            }
            System.arraycopy(Copia.C, 0, B.C, 0, Copia.C.length);
            this.redimensionar(A.cant);
        }
    }

    public void Dimensionar(ConjuntoBits A, ConjuntoBits B) {
        if (A.cant > B.cant) {
            redimensionarBitwise(A, B);
            B.cant = A.cant;
        } else if (B.cant > A.cant) {
            redimensionarBitwise(B, A);
            A.cant = B.cant;
        } else {
            if (A.cant == B.cant) {
                this.redimensionar(A.cant);
                cant = A.cant;
            }
        }
    }
    
    public void redimensionar(int newLimt) {
        if (newLimt > cant) {
            ConjuntoBits Copia = new ConjuntoBits();
            Dimensionar(Copia, this);
            System.arraycopy(C, 0, Copia.C, 0, C.length);
            int numBitwise = newLimt / 32;
            if (numBitwise % 32 != 0) {
                numBitwise++;
            }
            C = new Bitwise[numBitwise];
            for (int i = 0; i < C.length; i++) {
                C[i] = new Bitwise();
            }
            System.arraycopy(Copia.C, 0, C, 0, Copia.C.length);
            cant = newLimt;
        }
    }

    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 1; i <= cant; i++) {
            if (pertenece(i)) {
                S = S + i + ", ";
            }
        }
        if (!vacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;
    }

}
