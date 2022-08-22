package Negocio;

public class PolinomioBits {

    VectorBitsG V;
    int dim;
    
    public PolinomioBits(int cantElementos) {
        this.dim = 0;
        V = new VectorBitsG(cantElementos, 9);
    }
    
    public void insertar(char signo, int coef, int exp) {
        int sign = (signo == '+')? 1: 0;
        if (coef >= 1 && coef <= 9 && exp >= 1 && exp <= 9) {
            int mask = sign;
            mask = mask | (coef << 1);
            mask = mask | (exp << 5);
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
    
    public int getCoef(int pos) {
        int x = V.sacar(pos);
        x = x << 27;
        x = x >>> 28;
        return x;
    }
    
    public int getExp(int pos) {
        int x = V.sacar(pos);
        x = x << 23;
        x = x >>> 28;
        return x;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 1; i <= dim; i++) {
            s = s + getSigno(i) + getCoef(i) + "x^" + getExp(i) + " ";
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        PolinomioBits A = new PolinomioBits(5);
        
        A.insertar('+', 4, 8);
        A.insertar('-', 8, 2);
        A.insertar('-', 12, 2);
        A.insertar('+', 7, 3);
        A.insertar('+', 7, 13);
        
        System.out.println(A);
        
    }
       
}
