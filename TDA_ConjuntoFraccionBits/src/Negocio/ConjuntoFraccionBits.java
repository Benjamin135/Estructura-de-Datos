package Negocio;

public class ConjuntoFraccionBits {

    VectorBitsG V;
    int dim;
    
    public ConjuntoFraccionBits() {
        this.dim = 0;
        V = new VectorBitsG(100, 9);
    }
    
    public void insertar(int numerador, int denominador) {
        int signo = (numerador * denominador >= 0)? 1: 0;
        numerador = Math.abs(numerador);
        denominador = Math.abs(denominador);
        if (numerador >= 0 && numerador <= 9 && denominador > 0 && denominador <= 9) {
            int mask = signo;
            mask = mask | (numerador << 1);
            mask = mask | (denominador << 5);
            if (!pertenece(mask)) {
                this.dim++;
                //System.out.println("mask = " + mask + "  " + Integer.toBinaryString(mask));
                V.insertar(mask, dim);
                //System.out.println(V.toString());
            }
        }
    }
    
    public void eliminar(int numerador , int denominador) {
        int signo = (numerador * denominador >= 0)? 1: 0;
        numerador = Math.abs(numerador);
        denominador = Math.abs(denominador);
        if (numerador >= 0 && numerador <= 9 && denominador > 0 && denominador <= 9) {
            int mask = signo;
            mask = mask | (numerador << 1);
            mask = mask | (denominador << 5);
            if (pertenece(mask)) {
                int pos = obtenerPosicion(mask);
                for (int i = pos; i <= dim; i++) {
                    int x = V.sacar(i + 1);
                    V.insertar(x, i);
                }
                dim--;
            }
        }
    }
    
    private int obtenerPosicion(int elemento) {
        int pos = 0;
        for (int i = 1; i <= dim; i++) {
            if (V.sacar(i) == elemento) {
                pos = i;
            }
        }
        return pos;
    }
    
    public boolean pertenece(int elemento) {
        boolean b = false;
        for (int i = 1; i <= dim; i++) {
            int elemento1 = V.sacar(i);
            if (elemento1 == elemento) {
                b = true;
            }
        }
        return b;
    }
    
    public char getSigno(int pos) {
        int x = V.sacar(pos);
        x = x << 31;
        x = x >>> 31;
        return (x == 1)? '+': '-';
    }
    
    public int getNumerador(int pos) {
        int x = V.sacar(pos);
        x = x << 27;
        x = x >>> 28;
        return x;
    }
    
    public int getDenominador(int pos) {
        int x = V.sacar(pos);
        x = x << 23;
        x = x >>> 28;
        return x;
    }
    
    @Override
    public String toString() {
        String s = "[ ";
        for (int i = 1; i <= dim; i++) {
            s = s + getSigno(i) + getNumerador(i) + "/" + getDenominador(i) + ", ";
        }
        s = s.substring(0, s.length() - 2);
        s = s + " ]";
        if (dim <= 0) {
            s = "";
        }
        return s;
    }
    
    
}
