package Negocio;

public class Monomio {

    // Atributos
    int coeficiente; // signo y coeficiente
    int exponente;

    // Costructor vacio
    public Monomio() {
        this.coeficiente = 0;
        this.exponente = 1;
    }

    // Constructor con argumentos
    public Monomio(char signo, int coeficiente, int exponente) {
        if (signo == '+') {
            this.coeficiente = +Math.abs(coeficiente);
        } else {
            this.coeficiente = -Math.abs(coeficiente);
        }
        this.exponente = exponente;
    }

    // Operaciones o metodos
    public int getCoeficiente() {
        return Math.abs(this.coeficiente);
    }

    public void setCoeficiente(int coeficiente) {
        if (coeficiente == 0) {
            System.out.println("Error::Monomio:SetCoeficiente:Coeficiente igaul a 0");
            System.exit(1);
        } else {
            if (coeficiente >= 0) {
                this.coeficiente = +Math.abs(coeficiente);
            } else {
                this.coeficiente = -Math.abs(coeficiente);
            }
        }
    }

    public int getExponente() {
        return this.exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    public char getSigno() {
        if (this.coeficiente >= 0) {
            return '+';
        } else {
            return '-'; 
        }
    }
    
    public void setSigno(char signo) {
        if (signo == '+') {
            this.coeficiente = +Math.abs(this.coeficiente);
        } else {
            this.coeficiente = -Math.abs(this.coeficiente);
        }
    }

    @Override
    public String toString() {
        String S = "" + getSigno();
        if (getExponente() == 0) {
            S = S + getCoeficiente();
        } else if (getCoeficiente() != 1) {
            S = S + getCoeficiente();
        }
        
        if (getExponente() == 1) {
            S = S + "x";
        } else if (getExponente() != 0) {
            S = S + "x^" + getExponente();
        }
        return S;
    }
    
    public static void main(String[] args) {
        
        Monomio A = new Monomio('+', 2, 5);
        Monomio B = new Monomio('-', 1, 0);
        Monomio C = new Monomio('-', 0, 1);
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
    }
    
}
