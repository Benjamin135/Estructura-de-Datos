package Examen2.P2;

public class PilaV {

    int Pila[];
    int cima;

    public PilaV(int cant) {
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
        return (cima + 1);
    }
    
    /* 
        INTERCALAR ELEMENTOS DE UNA PILA
        SI ES IMPAR --> PILA = [7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [7, 5, 6, 3, 4, 1, 2]
    
        SI ES PAR   --> PILA = [8, 7, 6, 5, 4, 3, 2, 1]
        RESUTADO    --> PILA = [7, 8, 5, 6, 3, 4, 1, 2]
    */

    public void intercalar() {
        if (longitud() > 1) {
            int x = 0;
            boolean impar = longitud() % 2 == 1;
            if (impar) {
                x = pop();
            }
            int a = pop();
            int b = pop();
            intercalar();
            push(a);
            push(b);
            if (impar) {
                push(x);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = cima; i >= 0; i--) {
            s = s + "| " + Pila[i] + " |\n";
        }
        s = s + "¯¯¯¯¯";
        return s;
    }

    public static void main(String[] args) {

        PilaV A = new PilaV(10);

        A.push(1);
        A.push(2);
        A.push(3);
        A.push(4);
        A.push(5);
        A.push(6);
        A.push(7);
        A.push(8);
        
        System.out.println(A);

        A.intercalar();

        System.out.println(A);

    }

}
