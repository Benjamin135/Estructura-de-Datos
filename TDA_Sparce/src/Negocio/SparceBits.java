package Negocio;

public class SparceBits {
    
    VectorBitsG VFC;      // Vector de fila y columna
    float VD[];     // Vector de datos
    float EP;       // Elemento predominante
    int Nfil;       // Numero de columnas
    int Ncol;       // Numero de filas
    int dim;
    
    public SparceBits(int Nfil, int Ncol, float EP) {
        this.Nfil = Nfil;
        this.Ncol = Ncol;
        this.EP = EP;
        int x  = calcularBits(Nfil * Ncol);
        this.VFC = new VectorBitsG(10, x);
        this.VD = new float[10];
        this.dim = -1;
    }
    
    public boolean vacia() {
        return (dim == -1);
    }
    
    private int calcularBits(int cant) {
        int i = 1;
        while(Math.pow(2, i) <= cant) {
            i++;
        }
        return i;
    }
    
    public void insertar(int fila, int columna, float dato) {
        if (fila > Nfil || columna > Ncol) {
            System.out.println("Error::Insertar:Fila y Columna fuera de rango");
            System.exit(1);
        } else {
            int FC = (fila - 1) * Ncol + columna;
            if (vacia()){
                if (dato != EP) {
                    dim++;
                    VD[dim] = dato;
                    VFC.insertar(FC, dim + 1);
                }
            } else {
                int x = buscarFC(fila, columna);
                if (x == -1) {
                    redimensionar();
                    dim++;
                    VD[dim] = dato;
                    VFC.insertar(FC, dim + 1);
                } else {
                    if (dato != EP) {
                        VD[x] = dato;
                    } else {
                        for (int i = x; i < dim; i++) {
                            VFC.insertar(VFC.sacar(i + 2), i + 1);
                            VD[i] = VD[i + 1];
                        }
                        dim--;
                    }
                }
            } 
        }
    }
    
    private int buscarFC(int fila, int columna) {
        int FC = (fila - 1) * Ncol + columna;
        int i = 0;
        while(i <= dim && VFC.sacar(i + 1) != FC) {
            i++;
        }
        if (i <= dim) {
            return i;
        } else {
            return -1;
        }
    }
    
    private void redimensionar() {
//        if (dim == VFC.V.length) {
//            int x  = calcularBits(Nfil * Ncol);
//            VectorBitsG VFC1 = new VectorBitsG(VFC.V.length, x);
//            int numEnt = (dim * x) / 32;
//            if ((dim * x) % 32 != 0) {
//                numEnt++;
//            }
//            VFC1.V = new int [numEnt];
//            float VD1[] = new float[VD.length];
//            System.arraycopy(VD, 0, VD1, 0, VD.length);
//            System.arraycopy(VFC.V, 0, VFC1.V, 0, VFC.V.length);
//            VFC = new VectorBitsG(VFC1.V.length + 10, x);
//            VFC.V = new int [numEnt];
//            VD = new float[VD1.length + 10];
//            System.arraycopy(VFC1.V, 0, VFC.V, 0, VFC1.V.length);
//            System.arraycopy(VD1, 0, VD, 0, VD1.length);
//        }
    }
    
    public float sacar(int fila, int columna) {
        int x = buscarFC(fila, columna);
        if (x != -1) {
            return (VD[x]);
        } else {
            return EP;
        }
    }
    
    @Override
    public String toString() {
        String s = "M = [ \n";
        for (int i = 1; i <= Nfil; i++) {
            for (int j = 1; j <= Ncol; j++) {
                s = s + sacar(i, j) + "  ,  ";
            }
            s = s + "\n";
        }
        s = s + " ]";
        return s;
    }
    
}
