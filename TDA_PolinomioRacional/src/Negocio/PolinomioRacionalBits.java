package Negocio;

public class PolinomioRacionalBits {

    VectorBitsG V;
    int dim;
    
    public PolinomioRacionalBits(int cantElementos) {
        this.dim = 0;
        V = new VectorBitsG(cantElementos, 13);
    }
    
    public void insertar(char signo, int num, int den, int exp) {
        int sign = (signo == '+')? 1: 0;
        if (num >= 1 && num <= 9 && den >= 1 && den <= 9 && exp >= 0 && exp <= 9) {
            int mask = sign;
            mask = mask | (num << 1);
            mask = mask | (den << 5);
            mask = mask | (exp << 9);
            dim++;
            V.insertar(mask, dim);
        }
    }
    
    public char getSigno(int pos) {
        int x = V.sacar(pos);
        x = x << 31;
        x = x >>> 31;
        return (x == 1)? '+': '-';
    }
    
    public int getNum(int pos) {
        int x = V.sacar(pos);
        x = x << 27;
        x = x >>> 28;
        return x;
    }
    
    public int getDen(int pos) {
        int x = V.sacar(pos);
        x = x << 23;
        x = x >>> 28;
        return x;
    }
    
    public int getExp(int pos) {
        int x = V.sacar(pos);
        x = x << 19;
        x = x >>> 28;
        return x;
    }
    
    @Override
    public String toString() {
        String s = "P(x) = ";
        for (int i = 1; i <= dim; i++) {
            s = s + getSigno(i) + getNum(i) + "/" + getDen(i) + "x^" + getExp(i) + " ";
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        PolinomioRacionalBits A = new PolinomioRacionalBits(5);
        
        A.insertar('+', 4, 8, 2);
        A.insertar('+', 4, 8, 2);
        A.insertar('-', 8, 2, 1);
        A.insertar('-', 12, 2, 0);
        A.insertar('+', 0, 3, 4);
        A.insertar('+', 0, 13, 3);
        
        System.out.println(A);
        
    }
       
}
