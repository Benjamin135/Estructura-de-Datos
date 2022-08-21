package Negocio;

public class Biblioteca {
    
    VectorBitsG V;
    String Autores[];
    String Editoriales[];
    int cant;
    
    public Biblioteca(int cant) {
        this.V = new VectorBitsG(cant, 15);
        this.Autores = new String[cant];
        this.Editoriales = new String[cant];
        this.cant = 0;
    }
    
    public void insertar(String autor, int edicion, int numPag, String editorial, int año) {
        int dato = edicion;
        dato = dato | (numPag << 2);
        año = año - 1980;
        dato = dato | (año << 9);
        Autores[cant] = autor;
        Editoriales[cant] = editorial;
        cant++;
        V.insertar(dato, cant);
    }
    
    public String getAutor(int pos) {
        return Autores[pos - 1];
    }
    
    public String getEditorial(int pos) {
        return Editoriales[pos - 1];
    }
    
    public int getEdicion(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 30;
        dato = dato >>> 30;
        return dato;
    }
    
    public int getNumPag(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 23;
        dato = dato >>> 25;
        return dato;
    }
    
    public int getAño(int pos) {
        int dato = V.sacar(pos);
        dato = dato << 17;
        dato = dato >>> 26;
        return dato + 1980;
    }
    
    public String mostrarBiblioteca(int pos) {
        String s = "N° Codigo ";
        s = s + pos + "\nAutor: " + getAutor(pos) + "\nEdición: "; 
        int edicion = getEdicion(pos);
        switch(edicion) {
            case 1 -> s = s + "1° Edición";
            case 2 -> s = s + "2° Edición";
            case 3 -> s = s + "3° Edición";
        }     
        s = s + "\nNúmero de Paginas: " + getNumPag(pos) + "\nEditorial: " + getEditorial(pos)
              + "\nAño: " + getAño(pos);
        return s;
    }
    
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 1; i <= cant; i++) {
            s = s + mostrarBiblioteca(i) + "\n\n";
        }
        return s;
    }
    
}
