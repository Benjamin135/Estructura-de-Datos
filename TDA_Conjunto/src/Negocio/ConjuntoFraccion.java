package Negocio;

public class ConjuntoFraccion {
    
    int vNum[];
    int vDen[];
    char vSign[];
    int dim;
    
    public ConjuntoFraccion() {
        this.vNum = new int[10];
        this.vDen = new int[10];
        this.vSign = new char[10];
        this.dim = -1;
    }
    
    public int getDim() {
        return this.dim;
    }
    
    public boolean esVacia() {
        return (this.dim == -1);
    }
    
    public void insertar(int num, int den) {
        char signo = (num * den > 0)? '+': '-';
        if (esVacia()) {
            dim++;
            vNum[dim] = Math.abs(num);
            vDen[dim] = Math.abs(den);
            vSign[dim] = signo;
        } else {
            if (!pertenece(num, den)) {
                redimensionar();
                dim++;
                vNum[dim] = Math.abs(num);
                vDen[dim] = Math.abs(den);
                vSign[dim] = signo;
            }
        }
    }
    
    public void eliminar(int num, int den) {
        if (pertenece(num, den)) {
            int pos = 0;
            char signo = (num * den > 0)? '+': '-';
            for (int i = 0; i < dim; i++) {
                if(vNum[i] == num && vDen[i] == den && vSign[i] == signo) {
                    pos = i;
                }
            }
            
                for (int j = pos; j < dim; j++) {
                    vNum[j] = vNum[j + 1];
                    vDen[j] = vDen[j + 1];
                    vSign[j] = vSign[j + 1];
                }
                dim--;
        }
    }
    
    public boolean pertenece(int num, int den) {
        char s = (num * den > 0)? '+': '-';
        num = Math.abs(num);
        den = Math.abs(den);
        for (int i = 0; i <= dim; i++) {
            if (num == vNum[i] && den == vDen[i] && s == vSign[i]) {
                return true;
            }
        }
        return false;
    }
    
//    public boolean pertenece1(int elemento) {
//        int i = 0;
//        while (i <= dim && C[i] != elemento) {
//            i++;
//        }
//        return (i<=dim);
//    }
    
    public void redimensionar() {
        if (dim == vNum.length -1) {
            int vNum1[] = new int[vNum.length];
            int vDen1[] = new int[vDen.length];
            char vSign1[] = new char[vSign.length];
            System.arraycopy(vNum, 0, vNum1, 0, vNum.length);
            System.arraycopy(vDen, 0, vDen1, 0, vDen.length);
            System.arraycopy(vSign, 0, vSign1, 0, vSign.length);
            vNum = new int[vNum1.length + 10];
            vDen = new int[vDen1.length + 10];
            vSign = new char[vSign1.length + 10];
            System.arraycopy(vNum1, 0, vNum, 0, vNum1.length);
            System.arraycopy(vDen1, 0, vDen, 0, vDen1.length);
            System.arraycopy(vSign1, 0, vSign, 0, vSign1.length);
        }
    }
    
//    public void union(ConjuntoFraccion A, ConjuntoFraccion B) {
//        for (int i = 0; i <= A.dim; i++) {
//            insertar(A.C[i]);
//        }
//        for (int j = 0; j <= B.dim; j++) {
//            insertar(B.C[j]);
//        }
//    }
//    
//    public void interseccion(ConjuntoFraccion A, ConjuntoFraccion B) {
//        for (int i = 0; i <= A.dim; i++) {
//            if (B.pertenece(A.C[i])) {
//                insertar(A.C[i]);
//            }
//        }
//    }
//    
//    public void diferencia(ConjuntoFraccion A, ConjuntoFraccion B) {
//        for (int i = 0; i <= A.dim; i++) {
//            if (!B.pertenece(A.C[i])) {
//                insertar(A.C[i]);
//            }
//        }
//    }
//    
//    public void diferenciaSimetrica(ConjuntoFraccion A, ConjuntoFraccion B) {
//        for (int i = 0; i <= A.dim; i++) {
//            if (!B.pertenece(A.C[i])) {
//                insertar(A.C[i]);
//            }
//        }
//        for (int i = 0; i <= B.dim; i++) {
//            if (!A.pertenece(B.C[i])) {
//                insertar(B.C[i]);
//            }
//        }
//    }
//    
//    private int cantElementos(ConjuntoFraccion A) {
//        int cant = 0;
//        for (int i = 0; i <= A.dim; i++) {
//            cant++;
//        }
//        return cant;
//    }
//    
//    public boolean subconjunto(ConjuntoFraccion A, ConjuntoFraccion B) {
//        ConjuntoFraccion D = new ConjuntoFraccion();
//        for (int i = 0; i <= A.dim; i++) {
//            if (B.pertenece(A.C[i])) {
//                D.insertar(A.C[i]);
//            }
//        }
//        return (cantElementos(A) == cantElementos(D));
//    }
//    
//    public boolean SubConjunto(ConjuntoFraccion A, ConjuntoFraccion B) {
//        int i = 0;
//        while (i <= A.dim && B.pertenece(A.C[i])) {
//            i++;
//        }
//        return (i == A.dim + 1);
//    }
    
    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 0; i <= dim; i++) {
            S = S + vSign[i] + vNum[i] + "/" + vDen[i] + ", ";
        }
        if (!esVacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;  
    }
    
    public static void main(String[] args) {
        
        ConjuntoFraccion A = new ConjuntoFraccion();
        
        A.insertar(-2, 4);
        A.insertar(-1, -7);
        A.insertar(-3, -2);
        A.insertar(-1, -7);
        A.insertar(8, -12);
        A.insertar(3, 2);
        
        System.out.println(A);
        
        A.eliminar(3, 2);
        A.insertar(-13, 5);
        A.insertar(-3, 4);
        A.insertar(5, 4);
        A.eliminar(1, -7);
        A.insertar(1, -7);
        A.eliminar(1, 7);
        
        System.out.println(A);
        
    }
    
}
