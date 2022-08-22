package Negocio;

public class Sparce {
    
    int VFC[];      // Vector de fila y columna
    float VD[];     // Vector de datos
    float EP;       // Elemento predominante
    int Nfil;       // Numero de columnas
    int Ncol;       // Numero de filas
    int dim;
    
    public Sparce(int Nfil, int Ncol, float EP) {
        this.Nfil = Nfil;
        this.Ncol = Ncol;
        this.EP = EP;
        this.VFC = new int[10];
        this.VD = new float[10];
        this.dim = -1;
    }
    
    public boolean vacia() {
        return (dim == -1);
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
                    VFC[dim] = FC;
                }
            } else {
                int x = buscarFC(fila, columna);
                if (x == -1) {
                    redimensionar();
                    dim++;
                    VD[dim] = dato;
                    VFC[dim] = FC;
                } else {
                    if (dato != EP) {
                        VD[x] = dato;
                    } else {
                        for (int i = x; i < dim; i++) {
                            VFC[i] = VFC[i + 1];
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
        while(i <= dim && VFC[i] != FC) {
            i++;
        }
        if (i <= dim) {
            return i;
        } else {
            return -1;
        }
    }
    
    private void redimensionar() {
        if (dim == VFC.length - 1) {
            int VFC1[] = new int[VFC.length];
            float VD1[] = new float[VD.length];
            System.arraycopy(VFC, 0, VFC1, 0, VFC.length);
            System.arraycopy(VD, 0, VD1, 0, VD.length);
            VFC = new int[VFC1.length + 10];
            VD = new float[VD1.length + 10];
            System.arraycopy(VFC1, 0, VFC, 0, VFC1.length);
            System.arraycopy(VD1, 0, VD, 0, VD1.length);
        }
    }
    
    public float sacar(int fila, int columna) {
        int x = buscarFC(fila, columna);
        if (x != -1) {
            return VD[x];
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
