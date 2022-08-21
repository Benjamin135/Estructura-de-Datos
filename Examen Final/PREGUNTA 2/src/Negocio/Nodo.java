package Negocio;

public class Nodo {
    
    int datoIzq;
    int datoDer;
    Nodo enlaceIzq;
    Nodo enlaceDer;
    
    public Nodo() {
        this.enlaceIzq = null;
        this.enlaceDer = null;
    }
    
    public Nodo(int datoIzq, int datoDer) {
        this.datoIzq = datoIzq;
        this.datoDer = datoDer;
        this.enlaceIzq = null;
        this.enlaceDer = null;
    }

    public int getDatoIzq() {
        return datoIzq;
    }

    public void setDatoIzq(int datoIzq) {
        this.datoIzq = datoIzq;
    }

    public int getDatoDer() {
        return datoDer;
    }

    public void setDatoDer(int datoDer) {
        this.datoDer = datoDer;
    }
    
    public Nodo getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(Nodo enlace) {
        this.enlaceIzq = enlace;
    }
    
    public Nodo getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(Nodo enlace) {
        this.enlaceDer = enlace;
    }

    @Override
    public String toString() {
        return "[" + getDatoIzq() + "|" + getDatoDer() + "]";
    }
    
    
    // ===============================================================
    // =========================== PRUEBAS ===========================
    // ===============================================================
    
    public static void main(String[] args) {
        
        Nodo A = new Nodo(3, 5);
        Nodo B = new Nodo(1, 3);
        
        System.out.println(A);
        System.out.println(B);
        
    }

    
    
}
