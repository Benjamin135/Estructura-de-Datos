package Negocio;

public class Pila {

    int Pila[];
    public int cima;

    public Pila(int cant) {
        this.Pila = new int[cant];
        this.cima = -1;
    }

    public boolean vacia() {
        return (cima == -1);
    }

    public boolean llena() {
        return (cima == Pila.length - 1);
    }

    public void push(int elemento) {
        if (llena()) {
            System.out.println("Error Pila Llena");
            System.exit(1);
        } else {
            cima++;
            Pila[cima] = elemento;
        }
    }

    public int pop() {
        cima--;
        return (Pila[cima + 1]);
    }

    public int get() {
        return (Pila[cima]);
    }
    
    public int longitud() {
        return (cima+1);
    }
    
    /* ==================================================================================
       INVERTIR UNA PILA 
    
       ENTRADA     --> PILA = [5, 4, 3, 2, 1]
       RESULTADO   --> PILA = [1, 2, 3, 4, 5]
       ================================================================================== */
    
    public void Invertir1() {
        Pila Q = new Pila(Pila.length);
        while (!vacia()) {
            Q.push(pop());
        }
        Pila = Q.Pila;
        cima = Q.cima;
    }

    public void Invertir2() {
        Pila q = new Pila(cima);
        int i = -1;
        while (i <= cima) {
            int pivote = pop();
            while (cima > i) {
                q.push(pop());
            }
            push(pivote);
            while (!q.vacia()) {
                push(q.pop());
            }
            i++;
        }
    }
    
    public void Invertir3() {
        Pila q = new Pila(cima + 1);
        int cont = 1;
        for (int i = 0; i < q.Pila.length; i++) {
            int x = pop();
            for (int j = cont; j < q.Pila.length; j++) {
                q.push(pop());
            }
            q.push(x);
            for (int j = 0; j < q.Pila.length - cont + 1; j++) {
                push(q.pop());
            }
            cont++;
        }
    }
    
    // Invierte una pila usando una Cola
    public void Invertir4() {
        Cola q = new Cola(Pila.length);
        while (!vacia()) {
            q.Encolar(pop());
        }
        while (!q.vacia()) {
            push(q.Decolar());
        }
    }
    
    /* ==================================================================================
        INTERCALAR ELEMENTOS DE UNA PILA
    
        SI ES IMPAR --> PILA = [7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [6, 7, 4, 5, 2, 3, 1]
    
        SI ES PAR   --> PILA = [8, 7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [7, 8, 5, 6, 3, 4, 1, 2]
       ================================================================================== */
    
    public void intercalar1() {  // recursivo
        if (longitud() > 1) {
            int a = pop();
            int b = pop();
            intercalar1();
            push(a);
            push(b);
        }
    }
    
    public void intercalar2() { // iterativo
        if (longitud() > 1) {
            Pila q = new Pila(Pila.length);
            while (!vacia()) {
                int a = pop();
                if (!vacia()) {
                    int b = pop();
                    q.push(b);
                }
                q.push(a);
            }
            while(!q.vacia()) {
                push(q.pop());
            } 
        }
    }
    
    /* ==================================================================================
        INTERCALAR ELEMENTOS DE UNA PILA
    
        SI ES IMPAR --> PILA = [7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [7, 5, 6, 3, 4, 1, 2]
    
        SI ES PAR   --> PILA = [8, 7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [7, 8, 5, 6, 3, 4, 1, 2]
       ================================================================================== */
    
    public void intercalar_1() { // recursivo
        if (longitud() > 1) {
            int x = 0;
            boolean impar = longitud() % 2 != 0;
            if (impar) {
                x = pop();
            }
            int a = pop();
            int b = pop();
            intercalar_1();
            push(a);
            push(b);
            if (impar) {
                push(x);
            }
        }
    }
    
    public void intercalar_2() { // iterativo
        if (longitud() > 1) {
            Pila q = new Pila(Pila.length);
            boolean impar = longitud() % 2 == 1;
            int x = 0;
            if (impar) {
                x = pop();
            }
            while (!vacia()) {
                int a = pop();
                int b = pop();
                q.push(b);
                q.push(a);
            }
            while (!q.vacia()) {
                push(q.pop());
            }
            if (impar) {
                push(x);
            }   
        }
    }
    
    public void intercalar_3() {  // realizado por el aux
        Pila q = new Pila(cima + 1);
        int pivote;
        while (!vacia()) {
            int x = pop();
            q.push(x);
        }
        while (q.cima > 0) {
            pivote = q.pop();
            push(q.pop());
            push(pivote);
        }
        if (q.cima == 0) {
            push(q.pop());
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS ELEMENTOS ENTRE UNA PILA Y UNA COLA
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    COLA = [6, 7, 8, 9, 10]
        RESUTADO    --> PILA = [10, 9, 8, 7, 6]   COLA = [1, 2, 3, 4, 5]
       ================================================================================== */
    
    public void intercambiarElmentosPilaCola(ColaLista q) {
        int longitud_q = q.longitud();
        int longitud_P = longitud();
        while (!vacia()) {
            q.Encolar(pop());
        }
        for (int i = 0; i < longitud_q; i++) {
            push(q.Decolar());
        }
        while (!q.vacia()) {
            push(q.Decolar());
        }
        for (int i = 0; i < longitud_P; i++) {
            q.Encolar(pop());
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR MITADES ENTRE DOS PILAS
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    PILA2 = [10, 9, 8, 7, 6]
        RESUTADO    --> PILA = [10, 9, 3, 2, 1]   PILA2 = [5, 4, 8, 7, 6]
       ================================================================================== */
    
    public void intercambiarMitadPilas(Pila q) {
        if (longitud() == q.longitud()) {
            int longitud = longitud() / 2;
            boolean esImpar = longitud() % 2 == 1;
            int contador = 1;
            for (int i = 1; i < longitud; i++) {
                int pivote = pop();
                for (int j = contador; j < longitud; j++) {
                    q.push(pop());
                }
                push(pivote);
                for (int j = contador; j < longitud; j++){
                    push(q.pop());
                }
                contador++;
            }
            contador = 1;
            for (int i = 1; i < longitud; i++) {
                int pivote = q.pop();
                for (int j = contador; j < longitud; j++) {
                    push(q.pop());
                }
                q.push(pivote);
                for (int j = contador; j < longitud; j++){
                    q.push(pop());
                }
                contador++;
            }
            for (int i = 0; i < longitud; i++) {
                push(q.pop());
            }
            contador = 0;
            for (int i = 0; i < longitud; i++) {
                int pivote = pop();
                while (!vacia()) {
                    q.push(pop());
                    contador++;
                }
                push(pivote);
                for (int j = 0; j < contador; j++) {
                    push(q.pop());
                }
                contador = 0;
            }
            for (int i = 0; i < longitud; i++) {
                q.push(pop());
            }
            if (esImpar) {
                longitud += 1;
            }
            contador = 0;
            for (int i = 0; i < longitud; i++) {
                int pivote = pop();
                while (!vacia()) {
                    q.push(pop());
                    contador++;
                }
                push(pivote);
                for (int j = 0; j < contador; j++) {
                    push(q.pop());
                }
                contador = 0;
            }
        }
    }
    
    /* ==================================================================================
        CAMBIAR LAS MITADES DE UNA PILA SI ES DE LONGITUD PAR (Con pila auxliar)
    
        SI ES IMPAR --> PILA = [8, 7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [4, 3, 2, 1, 8, 7, 6, 5]
       ================================================================================== */
    
    public void cambiarMitad() {
        Pila q = new Pila(Pila.length);
        for (int i = 0; i < longitud() / 2; i++) {
            int pivote = pop();
            while (!vacia()) {
                q.push(pop());
            }
            push(pivote);
            while (!q.vacia()) {
                push(q.pop());
            }
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR MITADES DE UNA PILA
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    
        RESUTADO    --> PILA = [2, 1, 3, 5, 4]   
       ================================================================================== */
    
    public void intercambiarMitades() {
        Pila q = new Pila(Pila.length);
        int longitud = longitud() / 2;
        boolean esImpar = longitud() % 2 == 1;
        for (int i = 0; i < longitud; i++) {
            q.push(pop());
        }
        int contador = 1;
        for (int i = 1; i < longitud; i++) {
            int pivote = q.pop();
            for (int j = contador; j < longitud; j++) {
                push(q.pop());
            }
            q.push(pivote);
            for (int j = contador; j < longitud; j++) {
                q.push(pop());
            }
            contador++;
        }
        int x = 0;
        if (esImpar) {
            x = pop();
        }
        contador = 1;
        for (int i = 1; i < longitud; i++) {
            int pivote = pop();
            for (int j = contador; j < longitud; j++) {
                q.push(pop());
            }
            push(pivote);
            for (int j = contador; j < longitud; j++) {
                push(q.pop());
            }
            contador++;
        }
        for (int i = 0; i < longitud; i++) {
            q.push(pop());
        }
        contador = 1;
        for (int i = 1; i < longitud * 2; i++) {
            int pivote = q.pop();
            for (int j = contador; j < longitud * 2; j++) {
                push(q.pop());
            }
            q.push(pivote);
            for (int j = contador; j < longitud * 2; j++) {
                q.push(pop());
            }
            contador++;
        }
        for (int i = 0; i < longitud; i++) {
            push(q.pop());
        }
        if (esImpar) {
            push(x);
        }
        for (int i = 0; i < longitud; i++) {
            push(q.pop());
        }
//        System.out.println(q + "\n");
    }
    
    public void intercambiarMitades2() {
        Pila q = new Pila(Pila.length);
        int longitud = longitud() / 2;
        boolean esImpar = longitud() % 2 == 1;
        for (int i = 0; i < longitud; i++) {
            int pivote = pop();
            while (!vacia()) {
                q.push(pop());
            }
            push(pivote);
            while (!q.vacia()) {
                push(q.pop());
            }
        }
        int x = 0;
        if (esImpar) {
            x = pop();
        }
        for (int i = 0; i < longitud; i++) {
            q.push(pop());
        }
        if (esImpar) {
            push(x);
        }
        while (!q.vacia()) {
            push(q.pop());
        }
    }
    
    public void intercambiarMitadesAux() {  /// Realizado por el aux
        Pila aux1 = new Pila(cima+1);
        Pila aux2 = new Pila(cima+1);
        int cont = 0;
        while (cima > cont) {
            aux1.push(pop());
            cont++;
        }
        int x = pop();
        while (!vacia()) {
            aux2.push(pop());
        }
        while (!aux1.vacia()) {
            push(aux1.pop());
        }
        push(x);
        while (!aux2.vacia()) {
            push(aux2.pop());
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS ELEMENTOS ENTRE DOS PILAS
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    PILA2 = [10, 9, 8, 7, 6]
        RESUTADO    --> PILA = [10, 9, 8, 7, 6]   PILA2 = [5, 4, 3, 2, 1]
       ================================================================================== */
    
    public void intercambiarElementosPilas(Pila q) {
        int longitud_P = longitud();
        while (!q.vacia()) {
            push(q.pop());
        }
        int longitud = longitud() - 1;
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            int pivote = pop();
            for (int j = 0; j < longitud - contador; j++) {
                q.push(pop());
            }
            contador++;
            push(pivote);
            while (!q.vacia()) {
                push(q.pop());
            }   
        }
        for (int i = 0; i < longitud_P; i++) {
            q.push(pop());
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS EXTREMOS ENTRE DOS PILAS
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    PILA2 = [10, 9, 8, 7, 6]
        RESUTADO    --> PILA = [6, 4, 3, 2, 10]   PILA2 = [1, 9, 8, 7, 5]
       ================================================================================== */
    
    public void intercambiarExtremosPilas(Pila q) {
        if (longitud() > 1 && q.longitud() > 1) {
            int a = pop();
            int b = q.pop();
            int cont = 0;
            while (longitud() > 1) {
                q.push(pop());
                cont++;
            }
            int c = pop();
            push(b);
            for (int i = 0; i < cont; i++) {
                push(q.pop());
            }
            q.push(c);
            cont = 0;
            while (q.longitud() > 1) {
                push(q.pop());
                cont++;
            } 
            int d = q.pop();
            q.push(a);
            for (int i = 0; i < cont; i++) {
                q.push(pop());
            }
            push(d);
        }
    }
    
    public void intercambiarExtremosPilas2(Pila p, Pila q) { // Realizado por el aux
        int a = p.pop(); int cont = 0;
        int b = q.pop();
        while (!p.vacia()) {
            q.push(p.pop());
        }
        int c = q.pop();
        while (!q.vacia()) {
            p.push(q.pop());
        }
        int d = p.pop();
        // Ordenar
        q.push(c);
        // System.out.println(c);
        int n = p.cima/2;
        for (int i = 0; i <= n; i++) {
            q.push(p.pop());
        }
        q.push(a);
        while (!p.vacia()) {
            q.push(p.pop());
            cont++;
        }
        p.push(d);
        for (int i = 1; i <= cont; i++) {
            p.push(q.pop());
        }
        p.push(b);
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS EXTREMOS DE UNA PILA Y UNA COLA
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    COLA = [6, 7, 8, 9, 10]
        RESUTADO    --> PILA = [1, 4, 3, 2, 5]    COLA = [10, 7, 8, 9, 6]
       ================================================================================== */
    
    public void IntercambiarExtremosPilaCola(ColaLista q) {
        if (longitud() > 1) {
            int a = pop();
            int cont = 0;
            while (longitud() > 1) {
                q.Encolar(pop());
                cont++;
            }
            int b = pop();
            push(a);
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < q.longitud() - 1; j++) {
                    q.Encolar(q.Decolar());
                }
                push(q.Decolar());
            }
            push(b);
        }
        if (!q.vacia()) {
            int c = q.Decolar();
                for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            q.Encolar(c);
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS EXTREMOS ENTRE UNA PILA Y UNA COLA
    
        ENTRADA     --> PILA = [5, 4, 3, 2, 1]    COLA = [6, 7, 8, 9, 10]
        RESUTADO    --> PILA = [6, 4, 3, 2, 10]   COLA = [5, 7, 8, 9, 1]
       ================================================================================== */
    
    public void intercambiarExtremosPilaCola(ColaLista q) {
        if (longitud() > 1 && q.longitud() > 1) {
            int a = q.Decolar();
            int longitud = q.longitud();
            for (int i = 0; i < longitud - 1; i++) {
                q.Encolar(q.Decolar());
            }
            int b = q.Decolar();
            int c = pop();
            int cont = 0;
            while(longitud()>1) {
                q.Encolar(pop());
                cont++;
            }
            int d = pop();
            push(b);
            for (int j = 0; j < cont; j++) {
                longitud = q.longitud();
                for (int i = 0; i < longitud - 1; i++) {
                    q.Encolar(q.Decolar());
                }
                push(q.Decolar());
            }
            push(a);
            q.Encolar(c);
            longitud = q.longitud();
            for (int i = 0; i < longitud - 1; i++) {
                q.Encolar(q.Decolar());
            }
            q.Encolar(d);
        } else {
            System.out.println("La longitud es menor a 2");
        }
    }
    
    public void intercambiarExtremosPilaCola2(ColaLista q) {
        if (longitud() > 1 && q.longitud() > 1) {
            int a = pop();
            int b = q.Decolar();
            for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            int c = q.Decolar();
            int contador = 0;
            while (longitud() > 1) {
                q.Encolar(pop());
                contador++;
            }
            int d = pop();
            push(c);
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < q.longitud() - 1; j++) {
                    q.Encolar(q.Decolar());
                }
                push(q.Decolar());
            }
            push(b);
            q.Encolar(a);
            for (int i = 0; i < q.longitud() - 1; i++) {
                q.Encolar(q.Decolar());
            }
            q.Encolar(d);
        } 
//        else {
//            if (longitud() < 1) {
//                System.out.println("La longitud de la Pila es menor a 2");
//            } else if(longitud() < 2 && q.longitud() < 2) {
//                System.out.println("La longitud de la Pila y la Cola son menor a 2");
//            } else {
//                System.out.println("La longitud de la Cola es menor a 2");
//            }
//        }
    }
    
    public void intercambiarExtremosPilaCola3(ColaLista q) {
        if (longitud() > 1 && q.longitud() > 1) {
            int a = pop();
            int b = q.Decolar();
            int contador = 0;
            while (q.longitud() > 1) {
                push(q.Decolar());
                contador++;
            }
            int c = q.Decolar();
            for (int i = 0; i < contador; i++) {
                q.Encolar(pop());
            }
            q.Encolar(a);
            contador = 0;
            while (longitud() > 1) {
                q.Encolar(pop());
                contador++;
            }
            int d = pop();
            push(c);
            while(!q.vacia()) {
                push(q.Decolar());
            }
            while (longitud() > 1) {
                q.Encolar(pop());
            }
            for (int i = 0; i < contador; i++) {
                push(q.Decolar());
            }
            push(b);
            q.Encolar(d);
        }
    }
    
    /* ==================================================================================
        INTERCAMBIAR LOS EXTREMOS DE UNA PILA
    
        SI ES IMPAR --> PILA = [7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [1, 6, 5, 4, 3, 2, 7]
       ================================================================================== */
    
    public void intercambiarExtremos() {
        if (longitud() > 1) {
            Pila q = new Pila(Pila.length);
            int a = pop();
            while (!vacia()) {
                q.push(pop());
            }
            push(a);
            int b = q.pop();
            while (!q.vacia()) {
                push(q.pop());
            }
            push(b);
        }
    }
    
    /* ==================================================================================
        ELIMINAR LOS EXTREMOS DE UNA PILA (Con pila auxliar)
    
        SI ES IMPAR --> PILA = [7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [6, 5, 4, 3, 2]
       ================================================================================== */
    
    public void eliminarExtremos() {
        if (longitud() > 1) {
            Pila q = new Pila(Pila.length);
            pop();
            while(!vacia()) {
                q.push(pop());
            }
            q.pop();
            while(!q.vacia()) {
                push(q.pop());
            }
        }
    }
    
    /* ==================================================================================
        ELIMINAR REPETIDOS (Con una cola auxiliar)
    
        ENTRADA     --> PILA = [5, 5, 4, 4, 3, 3, 2, 2, 1, 1]
        RESUTADO    --> PILA = [5, 4, 3, 2, 1]
       ================================================================================== */
    
    public void eliminarRepetidos1() {  
        Cola q = new Cola(Pila.length);     // Utilizando una cola
        while (!vacia()) {
            int a = pop();
            if (vacia()) {
                q.Encolar(a);
                break;
            }
            int b = get();
            if (a != b) {
                q.Encolar(a);
            }
        }
        while (!q.vacia()) {
            push(q.Decolar());
        }
        while (!vacia()) {
            q.Encolar(pop());
        }
        while (!q.vacia()) {
            push(q.Decolar());
        }
    }
    
    /* ==================================================================================
        ELIMINAR REPETIDOS (Con una pila auxiliar)
    
        ENTRADA     --> PILA = [5, 5, 4, 4, 3, 3, 2, 2, 1, 1]
        RESUTADO    --> PILA = [5, 4, 3, 2, 1]
       ================================================================================== */
    
    public void eliminarRepetidos() {
        Pila q = new Pila(Pila.length);
        int contador = 0;
        while (cima != contador - 1) {
            int x = pop();
            while (cima != contador - 1) {
                int y = pop();
                if (x != y) {
                    q.push(y);
                }
            }
            push(x);
            while (!q.vacia()) {
                push(q.pop());
            }
            contador++;
        }
    }
    
    /* ==================================================================================
        ELIMINAR UNICOS (Con una pila auxiliar)
    
        ENTRADA     --> PILA = [5, 4, 4, 3, 5, 2, 2, 1]
        RESUTADO    --> PILA = [5, 4, 4, 5, 2, 2]
       ================================================================================== */
    
    public void eliminarUnicos() {
        Pila q = new Pila(Pila.length);
        int cont = 0;
        int i = 0;
        while (cima > cont - 1) {
            int x = pop();
            if (!vacia()) {
                while (cima != -1) {
                    int y = pop();
                    if (x != y) {
                        q.push(y);
                    } else {
                        i++;
                        q.push(y);
                    }
                }
                if (i > 0) {
                    q.push(x);
                    cont++;
                }
                while (!q.vacia()) {
                    push(q.pop());
                }
                i = 0;
            }
        }
    }

    // ==================================================================================
    // ==============================  METODOS RECURSIVOS  ==============================
    // ==================================================================================
    
    public void invertir(Pila q) {
        if (vacia()) { // caso base
            // nada
        } else {  // caso general
            int x = pop();
            q.push(x);
            invertir(q);
            cima = q.cima;
            Pila = q.Pila;
        }
    }

    public int Mayor() {
        int mayor;
        if (cima == 0) {  // caso base
            mayor = Pila[cima];
        } else {  // caso general
            int x = pop();
            mayor = Mayor();
            push(x);
            if (x > mayor) {
                mayor = x;
            }
        }
        return mayor;
    }
    
    /* ==================================================================================
        ELIMINAR UN ELEMENTO (RECURSIVO)
    
        ENTRADA     --> PILA = [7, 6, 5, 4, 3, 2, 1]    Elemento = 5
        RESUTADO    --> PILA = [7, 6, 4, 3, 2, 1]
       ================================================================================== */

    public void Eliminar(int elemento) {
        EliminarR(elemento);
    }

    private void EliminarR(int elemento) {
        if (!vacia()) {
            int x = pop();
            if (x != elemento) {
                EliminarR(elemento);
                push(x);
            }
        }
    }
    
    /* ==================================================================================
        ELIMINAR UN ELEMENTOS PARES DE UNA PILA (RECURSIVO)
    
        ENTRADA     --> PILA = [7, 6, 5, 4, 3, 2, 1]   
        RESUTADO    --> PILA = [7, 5, 3, 1]
       ================================================================================== */
    
    public void EliminarPares() {   
        if (vacia()) {
            //nada
        } else {
            int x = pop();
            EliminarPares();
            if (x % 2 != 0) {
                push(x);
            }
        }
    }
    
    /* ==================================================================================
        ELIMINAR REPETIDOS DE UNA PILA Y UNA COLA
    
        ENTRADA     --> PILA = [4, 4, 3, 2, 1, 1]    COLA = [1, 2, 2, 3, 5, 5]  
        RESUTADO    --> PILA = [4, 4]                COLA = [5, 5]
       ================================================================================== */
    
    public void eliminarRepetidosPilaCola(ColaLista q) {
        Pila aux = new Pila(Pila.length);
        int longitud = longitud();
        int frec = 0;
        for (int i = 0; i < longitud; i++) {
            int pivote = pop();
            int longitud_q = q.longitud();
            for (int j = 0; j < longitud_q; j++) {
                int x = q.Decolar();
                if (x != pivote) {
                    q.Encolar(x);
                } else {
                    frec++;
                }
            }
            if (frec == 0) {
                aux.push(pivote);
            } else {
                longitud--;
            }
            int contador = 0;
            int longitud_1 = longitud();
            for (int j = 0; j < longitud_1; j++) {
                int x = pop();
                if (x != pivote || frec == 0) {
                    aux.push(x);
                    contador++;
                }
            }
            
            for (int j = 0; j < contador; j++) {
                push(aux.pop());
            }
            frec = 0;
        }
        while (!aux.vacia()) {
            push(aux.pop());
        }
    }
    
    // =================================================================================
    // =================================================================================
    
    
    @Override
    public String toString() {
        String s = "";
        for (int i = cima; i >= 0; i--) {
            s = s + "[" + Pila[i] + "]" + "\n";
        }
//        if (vacia()) {
//            s = s + "[  ]\n";
//        }
        return s;
    }

}
