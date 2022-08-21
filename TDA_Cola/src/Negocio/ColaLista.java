package Negocio;

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

    /* ==================================================================================
       INVERTIR UNA COLA 
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5]
       RESULTADO   --> COLA = [5, 4, 3, 2, 1]
       ================================================================================== */
    
    public int longitud() {
        return cant;
    }

    public void invertir() {
        int longitud = longitud() - 1;
        while (longitud > 0) {
            int pivote = Decolar();
            for (int j = longitud; j > 0; j--) {
                Encolar(Decolar());
            }
            Encolar(pivote);
            for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                Encolar(Decolar());
            }
            longitud--;
        }
    }

    /* ==================================================================================
       INTERCAMBIAR EXTREMOS DE UNA COLA 
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5]
       RESULTADO   --> COLA = [5, 2, 3, 4, 1]
       ================================================================================== */
    
    public void intercambiarExtremos() {
        if (!vacia()) {
            int longitud = longitud() - 1;
            int pivote = Decolar();
            for (int j = longitud; j > 1; j--) {
                Encolar(Decolar());
            }
            Encolar(pivote);
        }
    }

    /* ==================================================================================
       INTERCAMBIAR ELEMENTOS ENTRE DOS COLAS 
    
       ENTRADA     --> COLA A = [1, 2, 3, 4, 5]
       ENTRADA     --> COLA B = [6, 7, 8, 9, 10]
    
       RESULTADO   --> COLA A = [6, 7, 8, 9, 10]
       RESULTADO   --> COLA B = [1, 2, 3, 4, 5]
       ================================================================================== */
    
    public void intercambiarColas(ColaLista q) {
        int longitud = longitud();
        while (!q.vacia()) {
            Encolar(q.Decolar());
        }
        for (int i = 0; i < longitud; i++) {
            q.Encolar(Decolar());
        }
    }
    
    /* ==================================================================================
       INVERTIR EXTREMOS ENTRE DOS COLAS 
    
       ENTRADA     --> COLA A = [1, 2, 3, 4, 5]
       ENTRADA     --> COLA B = [6, 7, 8, 9, 10]
    
       RESULTADO   --> COLA A = [10, 2, 3, 4, 6]
       RESULTADO   --> COLA B = [5, 7, 8, 9, 1]
       ================================================================================== */
    
    public void invertirExtremosColas(ColaLista q) {
        if (longitud() > 1 && q.longitud() > 1) {
            int a = Decolar();
            int b = q.Decolar();
            for (int i = 0; i < longitud() - 1; i++) {
                Encolar(Decolar());
            }
            for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            int c = Decolar();
            int d = q.Decolar();
            Encolar(d);
            q.Encolar(c);
            for (int i = 0; i < longitud() - 1; i++) {
                Encolar(Decolar());
            }
            for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            Encolar(b);
            q.Encolar(a);
        }
    }
    
    /* ==================================================================================
       INVERTIR MITADES DE UNA COLA
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5, 6]
       RESULTADO   --> COLA = [3, 2, 1, 6, 5, 4]
       ================================================================================== */
    
    public void invertirMitades() {
        int x = longitud() / 2;
        if (longitud() % 2 == 0) {
            int longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
            longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                for (int i = 0; i < (longitud() / 2); i++) {
                    Encolar(Decolar());
                }
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                for (int i = 0; i < (longitud() / 2); i++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
        } else {
            int longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
            for (int i = 0; i <= x; i++) {
                Encolar(Decolar());
            }
            longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
            for (int i = 0; i < x; i++) {
                Encolar(Decolar());
            }
        }
    }
    
    /* ==================================================================================
       INVERTIR INTERCAMBIAR DE UNA COLA
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5, 6]
       RESULTADO   --> COLA = [4, 5, 6, 1, 2, 3]
       ================================================================================== */
    
    public void intercambiarMitades() {
        int x = longitud() / 2;
        if (longitud() % 2 == 0) {
            for (int i = 0; i < x; i++) {
                Encolar(Decolar());
            }
        } else {
            for (int i = 0; i < x; i++) {
                Encolar(Decolar());
            }
            int y = Decolar();
            for (int i = 0; i < x; i++) {
                Encolar(Decolar());
            }
            Encolar(y);
            for (int i = 0; i < x; i++) {
                Encolar(Decolar());
            }
        }
    }

    /* ==================================================================================
       INVERTIR LA PRIMERA MITAD DE UNA COLA (SI LA LONGITUD ES PAR)
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5, 6]
       RESULTADO   --> COLA = [3, 2, 1, 4, 5, 6]
       ================================================================================== */
    
    public void invertir1Mitad() {
        if (longitud() % 2 == 0) {
            int longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
        } else {
            System.out.println("La longitud es impar");
        }
    }
    
    /* ==================================================================================
       INVERTIR LA SEGUNDA MITAD DE UNA COLA (SI LA LONGITUD ES PAR)
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5, 6]
       RESULTADO   --> COLA = [1, 2, 3, 6, 5, 4]
       ================================================================================== */
    
    public void invertir2Mitad() {
        if (longitud() % 2 == 0) {
            int longitud = (longitud() / 2) - 1;
            while (longitud > 0) {
                for (int i = 0; i < (longitud() / 2); i++) {
                    Encolar(Decolar());
                }
                int pivote = Decolar();
                for (int j = longitud; j > 0; j--) {
                    Encolar(Decolar());
                }
                Encolar(pivote);
                for (int j = 0; j < (longitud() - 1) - longitud; j++) {
                    Encolar(Decolar());
                }
                for (int i = 0; i < (longitud() / 2); i++) {
                    Encolar(Decolar());
                }
                longitud--;
            }
        } else {
            System.out.println("La longitud es impar");
        }
    }
    
    /* ==================================================================================
       ELIMINAR REPETIDOS DE UNA COLA 
    
       ENTRADA     --> COLA = [1, 1, 2, 3, 2, 4, 4, 5]
       RESULTADO   --> COLA = [3, 5]
       ================================================================================== */
    
    public void eliminarRepetidos() {
        int longitud = longitud();
        int frec = 0;
        for (int j = 0; j < longitud; j++) {
            int pivote = Decolar();
            int l = longitud();
//            boolean b = false;
            for (int i = 0; i < l; i++) {
                int x = Decolar();
                if (pivote != x) {
                    Encolar(x);
                } else  {
                    frec++;
//                    b = true;
                    longitud--;
                }
            }
            if (frec == 0) {
                Encolar(pivote);
            }
            frec = 0;
//            if (b == false) {
//                Encolar(pivote);
//            }
        }
    }
    
    public void eliminarRepetidosAux() {  // Realizado por el aux
        int aux = 1;
        int cant = longitud();
        while(aux <= cant) {
            int x = Decolar();
            int y = 1;
            int z = longitud();
            boolean sw = false;
            while (y <= z) {
                int num = Decolar();
                if (x != num) {
                    Encolar(num);
                } else {
                    sw = true;
                    cant--;
                }
                y++;
            }
            if (sw == false) {
                Encolar(x);
            }
            aux++;
        }
    }
    
    /* ==================================================================================
       ELIMINAR REPETIDOS DE UNA COLA 
    
       ENTRADA     --> COLA = [1, 1, 2, 3, 2, 4, 4, 5]
       RESULTADO   --> COLA = [1, 2, 3, 4, 5]
       ================================================================================== */
    
    public void eliminarRepetidos2() {
        int longitud = longitud();
        for (int j = 0; j < longitud; j++) {
            int pivote = Decolar();
            int l = longitud();
            for (int i = 0; i < l; i++) {
                int x = Decolar();
                if (pivote != x) {
                    Encolar(x);
                } else  {
                    longitud--;
                }
            }
            Encolar(pivote);
        }
    }
    
    /* ==================================================================================
       ELIMINAR ELEMENTOS UNICOS DE UNA COLA 
    
       ENTRADA     --> COLA = [1, 1, 2, 3, 2, 4, 4, 5]
       RESULTADO   --> COLA = [1, 1, 2, 2, 4, 4]
       ================================================================================== */
    
    public void eliminarUnicos() {
        int longitud = longitud();
        int frec = 0;
        for (int j = 0; j < longitud; j++) {
            int pivote = Decolar();
            int l = longitud();
            for (int i = 0; i < l; i++) {
                int x = Decolar();
                if (x == pivote) {
                    frec++;
                } 
                Encolar(x);
            }
            if (frec > 0) {
                Encolar(pivote);
            } 
            frec = 0;
        }
    }
    
    /* ==================================================================================
       ELIMINAR EXTREMOS DE UNA COLA 
    
       ENTRADA     --> COLA = [1, 2, 3, 4, 5]
       RESULTADO   --> COLA = [2, 3, 4]
       ================================================================================== */
    
    public void eliminarExtremos() {
        if (longitud() > 0) {
            Decolar();
            for (int i = 1; i < longitud(); i++) {
                Encolar(Decolar());
            }
            if (!vacia()) {
                Decolar();
            }
        }
    }
    
    
    
    // ====================================================
    // ====================================================
    
    public int Get() {
        return (Frente.getDato());
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

}
