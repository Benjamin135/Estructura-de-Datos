package Negocio;

public class Conjunto {
    
    int C[];
    int dim;
    
    public Conjunto() {
        this.C = new int[10];
        this.dim = -1;
    }
    
    public int getDim() {
        return this.dim;
    }
    
    public boolean esVacia() {
        return (this.dim == -1);
    }
    
    public void insertar(int elemento) {
        if (esVacia()) {
            dim++;
            C[dim] = elemento;
        } else {
            if (!pertenece1(elemento)) {
                redimensionar();
                dim++;
                C[dim] = elemento;
            }
        }
    }
    
    public void eliminar(int elemento) {
        if (!esVacia()) {
            int i = 0;
            while(i <= dim && C[i] != elemento) {
                i++;
            }
            if (i <= dim) {
                for (int j = i; j < dim; j++) {
                    C[j] = C[j + 1];
                }
                dim--;
            }
        }
    }
    
    public boolean pertenece(int elemento) {
        boolean b = false;
        int i= 0;
        while (i <= dim && b == false) {
            if (C[i] == elemento) {
                b = true;
            }
            i++;
        }
        return b;
    }
    
    public boolean pertenece1(int elemento) {
        int i = 0;
        while (i <= dim && C[i] != elemento) {
            i++;
        }
        return (i<=dim);
    }
    
    public void redimensionar() {
        if (dim == C.length -1) {
            int Copia[] = new int[C.length];
            System.arraycopy(C, 0, Copia, 0, C.length);
            C = new int[Copia.length + 10];
            System.arraycopy(Copia, 0, C, 0, Copia.length);
        }
    }
    
    public void union(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            insertar(A.C[i]);
        }
        for (int j = 0; j <= B.dim; j++) {
            insertar(B.C[j]);
        }
    }
    
    public void interseccion(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            if (B.pertenece(A.C[i])) {
                insertar(A.C[i]);
            }
        }
    }
    
    public void diferencia(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            if (!B.pertenece(A.C[i])) {
                insertar(A.C[i]);
            }
        }
    }
    
    public void diferenciaSimetrica(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            if (!B.pertenece(A.C[i])) {
                insertar(A.C[i]);
            }
        }
        for (int i = 0; i <= B.dim; i++) {
            if (!A.pertenece(B.C[i])) {
                insertar(B.C[i]);
            }
        }
    }
    
    private int cantElementos(Conjunto A) {
        int cant = 0;
        for (int i = 0; i <= A.dim; i++) {
            cant++;
        }
        return cant;
    }
    
    public boolean subconjunto(Conjunto A, Conjunto B) {
        Conjunto D = new Conjunto();
        for (int i = 0; i <= A.dim; i++) {
            if (B.pertenece(A.C[i])) {
                D.insertar(A.C[i]);
            }
        }
        return (cantElementos(A) == cantElementos(D));
    }
    
    public boolean SubConjunto(Conjunto A, Conjunto B) {
        int i = 0;
        while (i <= A.dim && B.pertenece(A.C[i])) {
            i++;
        }
        return (i == A.dim + 1);
    }
    
    @Override
    public String toString() {
        String S = "[ ";
        for (int i = 0; i <= dim; i++) {
            S = S + C[i] + ", ";
        }
        if (!esVacia()) {
            S = S.substring(0, S.length() - 2);
        }
        S = S + " ]";
        return S;  
    }
    
}
