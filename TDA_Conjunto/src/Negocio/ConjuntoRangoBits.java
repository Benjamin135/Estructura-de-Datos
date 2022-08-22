package Negocio;

public class ConjuntoRangoBits {

    Bitwise C[];
    int inicio;
    int fin;

    public ConjuntoRangoBits(int inicio, int fin) {
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
    }

    public void Insertar(int elemento) {
        //redimensionar(elemento);
        if (elemento >= inicio && elemento <= fin) {
            elemento = elemento - inicio + 1;
            int numBit = calcularNumBit(elemento);
            int numBitwise = calcularNumBitwise(elemento);
            C[numBitwise].encenderBit(numBit);
        } else {
            //System.err.println("Elemento fuera de rango");
        }
    }

    public void Eliminar(int elemento) {
        if (elemento >= inicio && elemento <= fin) {
            elemento = elemento - inicio + 1;
            int numBit = calcularNumBit(elemento);
            int numBitwise = calcularNumBitwise(elemento);
            C[numBitwise].apagarBit(numBit);
        }
    }

    public boolean pertenece(int elemento) {
        elemento = elemento - inicio + 1;
        int numBit = calcularNumBit(elemento);
        int numBitwise = calcularNumBitwise(elemento);
        return (C[numBitwise].getBit(numBit) == 1);
    }

    private int calcularNumBit(int pos) {
        return ((pos - 1) % 32) + 1;
    }

    private int calcularNumBitwise(int pos) {
        return ((pos - 1) / 32);
    }

    @Override
    public String toString() {
        String S = "[ ";
        for (int i = this.inicio; i <= this.fin; i++) {
            if (pertenece(i)) {
                S = S + i + ", ";
            }
        }
        if (S.length() > 2) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;
    }

}
