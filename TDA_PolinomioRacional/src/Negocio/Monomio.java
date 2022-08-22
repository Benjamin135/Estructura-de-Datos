package Negocio;

public class Monomio {

    // Atributos
    Racional coeficiente; // signo y coeficiente
    Racional exponente;

    // Costructor vacio
    public Monomio() {
        this.coeficiente.numerador = 0;
        this.coeficiente.denominador = 1;
        this.exponente.numerador = 0;
        this.exponente.denominador = 1;
    }

    // Constructor con argumentos
    public Monomio(char signo, Racional coeficiente, Racional exponente) {
        if (this.coeficiente.denominador == 0 || this.exponente.denominador == 0) {
            System.out.println("Error::Monomio:Denominador debe ser diferente de 0");
            System.exit(1);
        } else {
            if (signo == '+') {
                this.coeficiente.numerador = +Math.abs(coeficiente.numerador);
            } else {
                this.coeficiente.numerador = -Math.abs(coeficiente.numerador);
            }
            this.coeficiente.denominador = +Math.abs(coeficiente.denominador);
            this.exponente.numerador = exponente.numerador;
            this.exponente.denominador = exponente.denominador;
        }
    }

    // Operaciones o metodos
    public Racional getCoeficiente() {
//        this.coeficiente.numerador = coeficiente.getNumerador();
//        this.coeficiente.denominador = coeficiente.getDenominador();
       return this.coeficiente;
    }

    public void setCoeficiente(Racional coeficiente) {
        if (coeficiente.numerador == 0) {
            System.out.println("Error::Monomio:SetCoeficiente:Coeficiente igaul a 0");
            System.exit(1);
        } else {
            if (coeficiente.numerador >= 0) {
                this.coeficiente.numerador = coeficiente.getNumerador();
            } else {
                this.coeficiente.numerador = -coeficiente.getNumerador();
            }
            this.coeficiente.denominador = coeficiente.getDenominador();
        }
    }

    public Racional getExponente() {
        return this.exponente;
    }

    public void setExponente(Racional exponente) {
        this.exponente = exponente;
    }

    public char getSigno() {
        if (this.coeficiente.numerador >= 0) {
            return '+';
        } else {
            return '-';
        }
    }

    public void setSigno(char signo) {
        if (signo == '+') {
            this.coeficiente.numerador = +Math.abs(this.coeficiente.numerador);
        } else {
            this.coeficiente.numerador = -Math.abs(this.coeficiente.numerador);
        }
    }

    @Override
    public String toString() {
        String S = "" + getSigno();
        if (Integer.parseInt(getExponente().toString()) == 0) {
            S = S + getCoeficiente();
        } else if (Integer.parseInt(getCoeficiente().toString()) != 1) {
            S = S + getCoeficiente();
        }

        if (Integer.parseInt(getExponente().toString()) == 1) {
            S = S + "x";
        } else if (Integer.parseInt(getExponente().toString()) != 0) {
            S = S + "x^" + getExponente();
        }
        return S;
    }

    public static void main(String[] args) {

        Racional A1 = new Racional('+', 2, 3);
        Racional A2 = new Racional('-', 3, 5);
        
        Monomio A = new Monomio('-', A1, A2);

        System.out.println("A = " + A.toString());
        

    }

}
