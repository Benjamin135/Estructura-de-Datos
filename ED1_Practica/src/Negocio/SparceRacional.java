package Negocio;

public class SparceRacional {
    
    int VFC[];      // Vector de fila y columna
    int VDen[];     // Vector de datos (Denominador)
    int VNum[];     // Vector de datos (Numerador)
    char VSig[];     // Vector de datos (Signo)
    int EP;         // Elemento predominante
    int Nfil;       // Numero de columnas
    int Ncol;       // Numero de filas
    int dim;
    
    public SparceRacional(int Nfil, int Ncol, int EP) {
        this.Nfil = Nfil;
        this.Ncol = Ncol;
        this.EP = EP;
        this.VFC = new int[10];
        this.VDen = new int[10];
        this.VNum = new int[10];
        this.VSig = new char[10];
        this.dim = -1;
    }
    
    public boolean vacia() {
        return (dim == -1);
    }
    
    public void insertar(int fila, int columna, char signo, int num, int den) {
        if (fila > Nfil || columna > Ncol) {
            System.out.println("Error::Insertar:Fila y Columna fuera de rango");
            System.exit(1);
        } else {
            int FC = (fila - 1) * Ncol + columna;
            if (vacia()){
                if (num != EP && den != EP) {
                    dim++;
                    VSig[dim] = signo;
                    VDen[dim] = den;
                    VNum[dim] = num;
                    VFC[dim] = FC;
                }
            } else {
                int x = buscarFC(fila, columna);
                if (x == -1) {
                    redimensionar();
                    dim++;
                    VSig[dim] = signo;
                    VDen[dim] = den;
                    VNum[dim] = num;
                    VFC[dim] = FC;
                } else {
                    if (num != EP && den != EP) {
                        VSig[x] = signo;
                        VDen[x] = den;
                        VNum[x] = num;
                    } else {
                        for (int i = x; i < dim; i++) {
                            VFC[i] = VFC[i + 1];
                            VSig[i] = VSig[i + 1];
                            VDen[i] = VDen[i + 1];
                            VNum[i] = VNum[i + 1];
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
            int VD1[] = new int[VDen.length];
            int VD2[] = new int[VNum.length];
            char VD3[] = new char[VSig.length];
            System.arraycopy(VFC, 0, VFC1, 0, VFC.length);
            System.arraycopy(VDen, 0, VD1, 0, VDen.length);
            System.arraycopy(VNum, 0, VD2, 0, VNum.length);
            System.arraycopy(VSig, 0, VD3, 0, VSig.length);
            VFC = new int[VFC1.length + 10];
            VDen = new int[VD1.length + 10];
            VNum = new int[VD2.length + 10];
            VSig = new char[VD3.length + 10];
            System.arraycopy(VFC1, 0, VFC, 0, VFC1.length);
            System.arraycopy(VD1, 0, VDen, 0, VD1.length);
            System.arraycopy(VD2, 0, VNum, 0, VD2.length);
            System.arraycopy(VD3, 0, VSig, 0, VD3.length);
        }
    }
    
    public int sacarDen(int fila, int columna) {
        int x = buscarFC(fila, columna);
        if (x != -1) {
            return VDen[x];
        } else {
            return EP;
        }
    }
    
    public int sacarNum(int fila, int columna) {
        int x = buscarFC(fila, columna);
        if (x != -1) {
            return VNum[x];
        } else {
            return EP;
        }
    }
    
    public char sacarSigno(int fila, int columna) {
        int x = buscarFC(fila, columna);
        if (x != -1) {
            return  VSig[x];
        } else {
            return ' ';
        }
    }
    
    @Override
    public String toString() {
        String s = "M = [ \n";
        for (int i = 1; i <= Nfil; i++) {
            for (int j = 1; j <= Ncol; j++) {
                s = s + sacarSigno(i, j) + sacarNum(i, j) + "/" + sacarDen(i, j) + "  ,  ";
            }
            s = s + "\n";
        }
        s = s + " ]";
        return s;
    }
    
    public static void main(String[] args) {
        
        SparceRacional A = new SparceRacional(5, 5, 0); 
        
        A.insertar(2, 5, '+', 1, 2);
        A.insertar(1, 2, '+', 5, 3);
        A.insertar(3, 3, '-',7, 2);
        A.insertar(2, 2, '+',3, 4);
        A.insertar(4, 4, '-',1, 5);
        
        System.out.println(A);
        
    }
            
    
}
