package Negocio;

public class Polinomio {

    Monomio P[];
    int dim;

    public Polinomio() {
        this.P = new Monomio[5];
        this.dim = -1;
    }

    public void Insertar(Monomio A) {
        if (vacia()) {
            dim++;
            P[dim] = A;
        } else {
            int aux = 0;
            while ((aux <= dim) && (P[aux].getExponente() > A.getExponente())) {
                aux++;
            }
            if (aux <= dim) {
                if (P[aux].getExponente() != A.getExponente()) {
                    Redimensionar();
                    for (int i = dim; i >= aux; i--) {
                        P[i + 1] = P[i];
                    }
                    P[aux] = A;
                    dim++;
                } else {
                    int suma = A.coeficiente + P[aux].coeficiente;
                    if (suma != 0) {
                        P[aux].coeficiente = suma;
                    } else {
                        for (int j = aux; j < dim; j++) {
                            P[j] = P[j + 1];
                        }
                        dim--;
                    }
                } 
            } else {
                Redimensionar();
                dim++;
                P[dim] = A;
            }
        }
    }

    private boolean vacia() {
        return (dim == -1);
    }
    
    private void Redimensionar() {
        if (P.length - 1 == dim) {
            Monomio Copia[] = new Monomio[P.length];
            System.arraycopy(P, 0, Copia, 0, P.length);
            P = new Monomio[P.length + 10];
            System.arraycopy(Copia, 0, P, 0, Copia.length);
        }
    }
    
    public void Eliminar(int exp){
        if (!vacia()){
            int i = 0;
            while ((i <= dim) && (exp != P[i].getExponente())) {
                i++;
            }
            if (i < dim){
                for (int j = i; j < dim; j++){
                    P[j] = P[j+1];
                }
                dim--;
            } else if (i == dim){
                this.P[i] = null;
                dim--;
            }
        }
    }
    
    public double Evaluar(int x){
        double suma = 0;
        for (int i = 0; i <= dim; i++){
            suma = suma + P[i].coeficiente * Math.pow(x, P[i].getExponente());
        }
        return suma;
    }
    
    public Monomio getMonomio(int Exp) {
        int i = 0;
        while (P[i].getExponente() != Exp) {
            i++;
        }
        return P[i];
    }
    
    public int[] getExponentes(){
        int exps[] = new int[dim + 1];
        for (int i = 0; i <= dim; i++){
            exps[i] = P[i].getExponente();
        }
        return exps;
    }

    public void Sumar(Polinomio A, Polinomio B){
        for (int i = 0; i <= A.dim; i++){
            this.Insertar(A.P[i]);
        }
        for (int i = 0; i <= B.dim; i++){
            this.Insertar(B.P[i]);
        }
    }
    
    public void Restar(Polinomio A, Polinomio B){
        Polinomio aux = new Polinomio();
        for (int i = 0; i <= B.dim; i++){
            aux.Insertar(B.P[i]);
            aux.P[i].coeficiente = -aux.P[i].coeficiente;
        }
        this.Sumar(A, aux);
    }
        
    public void Multiplicar(Polinomio A, Polinomio B){                                                            
        Monomio M = new Monomio();
        for (int i = 0; i <= A.dim; i++){ 
            for (int j = 0; j <= B.dim; j++){
                M.coeficiente = A.P[i].coeficiente * B.P[j].coeficiente;
                M.exponente = A.P[i].exponente + B.P[j].exponente;
                this.Insertar(M);
            }
        }
    }
    
    @Override
    public String toString() {
        String S = "";
        for (int i = 0; i <= dim; i++) {
            S = S + P[i] + " ";
        }
        return S;
    }
    
    public static void main(String[] args) {
        
        Monomio A = new Monomio('-', 2, 5);
        Monomio B = new Monomio('+', 1, -2);
        
        Polinomio C = new Polinomio();
        
        C.Insertar(A);
        C.Insertar(B);
        
        System.out.println(C);
       
    }

}
