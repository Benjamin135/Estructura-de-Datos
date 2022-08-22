package Negocio;

public class VectorBitsG {
    
    int V[];
    int dim;
    int numBits;
    
    public VectorBitsG(int cant, int cantBits) {
        int numEnt = (cant * cantBits) / 32;
        if ( (cant * cantBits) % 32 != 0) {
            numEnt++;
        }
        this.V = new int [numEnt];
        this.dim = cant;
        this.numBits = cantBits;
    }
    
    public void insertar(int elemento, int pos) {
        int elemento1 = elemento;
        int numBit = calcularNumBit(pos);
        int numEnt = calcularNumEnt(pos);
        int mask = (int) (Math.pow(2, numBits) - 1);
        mask = mask << numBit - 1;
        mask = ~mask;
        V[numEnt] = V[numEnt] & mask;
        elemento = elemento << numBit - 1;
        V[numEnt] = V[numEnt] | elemento;
        if ((numBit - 1) + numBits > 32) {
            int mask1 = (int) (Math.pow(2, numBits) - 1);
            mask1 = mask1 >>> (32 - (numBit - 1));
            mask1 = ~mask1;
            V[numEnt + 1] = V[numEnt + 1] & mask1;
            elemento1 = elemento1 >>> (32 - (numBit - 1));
            V[numEnt + 1] = V[numEnt + 1] | elemento1;
        }
    }
    
    public int sacar(int pos) {
        int numBit = calcularNumBit(pos);
        int numEnt = calcularNumEnt(pos);
        int mask = (int) (Math.pow(2, numBits) - 1);
        mask = mask << numBit - 1;
        mask = mask & V[numEnt];
        mask = mask >>> numBit - 1;
        if ((numBit - 1) + numBits > 32) {
            int mask1 = (int) (Math.pow(2, numBits) - 1);
            mask1 = mask1 >>> (32 - (numBit - 1));
            mask1 = mask1 & V[numEnt + 1];
            mask1 = mask1 << (32 - (numBit - 1));
            mask = mask | mask1;
        }
        return mask;
    }
    
    private boolean vacia() {
        return (dim == 0);
    }
    
    private int calcularNumBit(int pos) {
        return (((pos - 1) * numBits % 32) + 1);
    }
    
    private int calcularNumEnt(int pos) {
        return ((pos - 1) * numBits / 32);
    }
    
    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 1; i <= dim; i++) {
            S = S + sacar(i) + ", ";
        }
        if (!vacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;
    }
    
}
