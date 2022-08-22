package Examen2.P3;

public class ColaLista {

    Nodo Frente;
    Nodo Atras;
    int cant;

    public ColaLista() {
        this.Frente = null;
        this.Atras = null;
        this.cant = 0;
    }

    public boolean vacia() {
        return (Frente == null);
    }

    public void Encolar(int elemento) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(elemento);
        if (vacia()) {
            Frente = nuevo;
            Atras = nuevo;
            cant++;
        } else {
            Atras.setEnlace(nuevo);
            Atras = nuevo;
            cant++;
        }
    }

    public int Decolar() {
        int x = Frente.getDato();
        if (Frente == Atras) {
            Frente = null;
            Atras = null;
            cant--;
        } else {
            Frente = Frente.getEnlace();
            cant--;
        }
        return x;
    }

    public int Get() {
        return (Frente.getDato());
    }

    public int longitud() {
        return cant;
    }

    /* 
        ELIMINAR TODOS LOS REPETIDOS DE UNA COLA
        COLA = [1, 2, 1, 3, 4, 1, 7, 2, 2, 5]
        RESUTADO COLA = [3, 4, 7, 5]
    */
    
    public void eliminarRepetidos() {
        int size = longitud();
        for (int j = 0; j < size; j++) {
            boolean repetido = false;
            int x = Decolar();
            int size2 = longitud();
            for (int i = 0; i < size2; i++) {
                int elemento = Decolar();
                if (x != elemento) {
                    Encolar(elemento);
                } else {
                    repetido = true;
                }
            }
            if (repetido) {
                size = longitud();
                j--;
            } else {
                Encolar(x);
            }
        }
    }
    
    /* 
        ELIMINAR LOS ELEMENTOS REPETIDOS DE UN ELEMENTO DE UNA COLA
        COLA = [1, 2, 1, 3, 4, 1, 7, 2, 2, 5]
        RESUTADO COLA = [1, 2, 3, 4, 7, 5]
    */
    
    public void eliminarRepetidos2() {
        if (longitud() > 1) {
            int size = longitud();
            int x = 0;
            while (x < size) {
                int pivote = Decolar();
                int size2 = longitud();
                for (int i = 0; i < size2; i++) {
                    int elemento = Decolar();
                    if (pivote != elemento) {
                        Encolar(elemento);
                    } else {
                        size--;
                    }
                }
                Encolar(pivote);
                x++;
            }
        }
    }

    @Override
    public String toString() {
        String lista = "[ ";
        Nodo aux = Frente;
        while (aux != null) {
            lista = lista + aux.getDato() + ", ";
            aux = aux.getEnlace();
        }
        if (lista.length() > 2) {
            lista = lista.substring(0, lista.length() - 2);
        }
        lista = lista + " ]";
        return lista;
    }

    public static void main(String[] args) {

        ColaLista A = new ColaLista();
        
        A.Encolar(1);
        A.Encolar(2);
        A.Encolar(1);
        A.Encolar(3);
        A.Encolar(4);
        A.Encolar(1);
        A.Encolar(7);
        A.Encolar(2);
        A.Encolar(2);
        A.Encolar(5);

        System.out.println(A);

        A.eliminarRepetidos();

        System.out.println(A);

    }

}
