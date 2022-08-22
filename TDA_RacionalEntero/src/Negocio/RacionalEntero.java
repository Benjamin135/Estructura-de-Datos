
package Negocio;

public class RacionalEntero {
    
    int entero;
    int numerador; // representa el numerador y el signo
    int denominador;

    // Constructor por defecto
    public RacionalEntero() {
        this.entero = 0;
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor sobrecargado
    public RacionalEntero(char signo, int entero, int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("Error::Racional:Denominador debe ser diferente de 0");
            System.exit(1);
        } else {
            if (signo == '+') {
                this.entero = +Math.abs(entero);
            } else {
                this.entero = -Math.abs(entero);
            }
            this.numerador = Math.abs(numerador);
            this.denominador = Math.abs(denominador);
        }
    }

    // Modifica el entero del racional
    public void setEntero(int entero) {
        if (this.entero >= 0) {
            this.entero = +Math.abs(entero);
        } else {
            this.entero = -Math.abs(entero);
        }
    }
    
    // Modifica el numerador del racional
    public void setNumerador(int numerador) {
        this.numerador = +Math.abs(numerador);
    }

    // Modifica el denominador del racional
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            System.out.println("Error::SetDenominador:Denominador debe ser diferente de 0");
            System.exit(1);
        } else {
            this.denominador = Math.abs(denominador);
        }
    }

    // Modifica el signo del racional
    public void setSigno(char signo) {
        if (getEntero() != 0) {
           if (signo == '+') {
                this.entero = +Math.abs(entero);
            } else {
                this.entero = -Math.abs(entero);
            } 
        } else {
            if (signo == '+') {
                this.numerador = +Math.abs(numerador);
            } else {
                this.numerador = -Math.abs(numerador);
            } 
        }
    }

    // Devuelve el entero del racional
    public int getEntero() {
        return Math.abs(entero);
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
        if (getEntero() != 0) {
            if (this.entero >= 0) {
                return '+';
            } else {
                return '-';
            }  
        } else {
            if (this.numerador >= 0) {
                return '+';
            } else {
                return '-';
            } 
        }
    }
    
    // Convierte a RacionalEntero a un Racional
    public Racional convertirRacional(RacionalEntero A) {
        Racional B = new Racional();
        int num; int den;
        num = A.getDenominador() * A.getEntero() + A.getNumerador();
        den = A.getDenominador();
        B.setNumerador(num);
        B.setDenominador(den);
        B.setSigno(A.getSigno());
        return B;
    }
    
    // Convierte un Racional  a un RacionalEntero 
    public RacionalEntero convertirRacionalEntero(Racional A) {
        RacionalEntero B = new RacionalEntero();
        int num, den, ent;
        if (A.getNumerador() > A.getDenominador()) {
            num = A.getNumerador() % A.getDenominador();
            den = A.getDenominador();
            ent = A.getNumerador() / A.getDenominador(); 
        } else {
            num = A.getNumerador();
            den = A.getDenominador();
            ent = 0;
        }
        B.setEntero(ent);
        B.setNumerador(num);
        B.setDenominador(den);
        B.setSigno(A.getSigno());
        return B;
    }
    
    // Suma de racionales enteros
    public RacionalEntero sumar(RacionalEntero A, RacionalEntero B) {
        Racional A1 = new Racional();
        Racional B1 = new Racional();
        Racional C1 = new Racional();
        RacionalEntero C = new RacionalEntero();
        A1 = A.convertirRacional(A);
        B1 = B.convertirRacional(B);
        C1.Suma(A1, B1);
        C = C.convertirRacionalEntero(C1);
        return C;
    }
    
    public RacionalEntero restar(RacionalEntero A, RacionalEntero B){
        Racional A1 = new Racional();
        Racional B1 = new Racional();
        Racional C1 = new Racional();
        RacionalEntero C = new RacionalEntero();
        A1 = A.convertirRacional(A);
        B1 = B.convertirRacional(B);
        C1.Resta(A1, B1);
        C = C.convertirRacionalEntero(C1);
        return C;
    }
    
     public RacionalEntero multiplicar(RacionalEntero A, RacionalEntero B){
        Racional A1 = new Racional();
        Racional B1 = new Racional();
        Racional C1 = new Racional();
        RacionalEntero C = new RacionalEntero();
        A1 = A.convertirRacional(A);
        B1 = B.convertirRacional(B);
        C1.Multiplicacion(A1, B1);
        C = C.convertirRacionalEntero(C1);
        return C;
    }
     
    public RacionalEntero dividir(RacionalEntero A, RacionalEntero B){
        Racional A1 = new Racional();
        Racional B1 = new Racional();
        Racional C1 = new Racional();
        RacionalEntero C = new RacionalEntero();
        A1 = A.convertirRacional(A);
        B1 = B.convertirRacional(B);
        C1.Division(A1, B1);
        C = C.convertirRacionalEntero(C1);
        return C;
    }
    
    @Override
    public String toString() {
        String S = "";
        S = "   " + getNumerador() + "\n" + S 
                 + getSigno() + getEntero()  + "----" + "\n   " 
                 + getDenominador();
        return S;
    }
    
    public static void main(String[] args) {
        
        RacionalEntero A = new RacionalEntero('-', 12, 3, 5);
        RacionalEntero B = new RacionalEntero('+', 78, 1, 9);
        RacionalEntero R = new RacionalEntero();
        RacionalEntero C = new RacionalEntero();
        
        C = A.dividir(A, B);
        
        System.out.println(C);
        
    }
    
}
