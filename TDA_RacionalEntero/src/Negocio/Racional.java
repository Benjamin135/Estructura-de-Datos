package Negocio;

public class Racional {
    
     // Se llama atributos en el modelado
    // Se llama campos en la implemantacion
    int numerador; // representa el numerador y el signo
    int denominador;

    // Constructor por defecto
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor sobrecargado
    public Racional(char signo, int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("Error::Racional:Denominador debe ser diferente de 0");
            System.exit(1);
        } else {
            if (signo == '+') {
                this.numerador = +Math.abs(numerador);
            } else {
                this.numerador = -Math.abs(numerador);
            }
            this.denominador = Math.abs(denominador);
        }
    }

    // Modifica el numerador del racional
    public void setNumerador(int numerador) {
        if (this.numerador >= 0) {
            this.numerador = +Math.abs(numerador);
        } else {
            this.numerador = -Math.abs(numerador);
        }
        Simplificar();
    }

    // Modifica el denominador del racional
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            System.out.println("Error::SetDenominador:Denominador debe ser diferente de 0");
            System.exit(1);
        } else {
            this.denominador = Math.abs(denominador);
        }
        Simplificar();
    }

    // Modifica el signo del racional
    public void setSigno(char signo) {
        if (signo == '+') {
            this.numerador = +Math.abs(numerador);
        } else {
            this.numerador = -Math.abs(numerador);
        }
    }

    // Devuelve el numerador del racional
    public int getNumerador() {
        return Math.abs(numerador);
    }

    // Devuelve el denominador de racional
    public int getDenominador() {
        return this.denominador;
    }

    // Devuelve el signo del racional
    public char getSigno() {
        if (this.numerador >= 0) {
            return '+';
        } else {
            return '-';
        }
    }

    // Sumar racionales
    public void Suma(Racional A, Racional B) {
        this.denominador = A.denominador * B.denominador;
        this.numerador = (A.numerador * B.denominador) + (A.denominador * B.numerador);
        Simplificar();
    }

    // Restar racionales
    public void Resta(Racional A, Racional B) {
        this.denominador = A.denominador * B.denominador;
        this.numerador = (A.numerador * B.denominador) - (A.denominador * B.numerador);
        Simplificar();
    }

    // Multiplicar racionales
    public void Multiplicacion(Racional A, Racional B) {
        this.numerador = A.numerador * B.numerador;
        this.denominador = A.denominador * B.denominador;
        Simplificar();
    }
    
    // Dividir racionales
    public void Division(Racional A, Racional B) {
        this.numerador = A.numerador * B.denominador;
        this.denominador = A.denominador * B.numerador;
        if (this.denominador < 0) {
            this.numerador = this.numerador * -1;
            this.denominador = Math.abs(this.denominador);
        }
        Simplificar();
    }

    //Cálculo del máximo común divisor por el algoritmo de Euclides
    public int mcd() {
        int u = Math.abs(this.numerador); //valor absoluto del numerador
        int v = Math.abs(this.denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    
    // Simplica un racional
    public void Simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        this.numerador = this.numerador / n;
        this.denominador = this.denominador / n;
    }
    
    @Override
    public String toString() {
        return "" + getSigno() + getNumerador() + "/" + getDenominador();
//        String c = " C= ";
//        c = "       " + getNumerador() + "\n" + c + getSigno() + " ---" + "\n       " + getDenominador();
//        return c;
    }
    
    public static void main(String[] args) {
        
       Racional A = new Racional('+', 1, 4);
       Racional B = new Racional('-', 1, 2);
       Racional C = new Racional();
       
       C.Multiplicacion(A, B);
       System.out.println(C);
        
       C.Division(A, B);
       System.out.println(C);
        
    }
    
}
