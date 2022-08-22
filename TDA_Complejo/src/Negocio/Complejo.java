package Negocio;

public class Complejo {
    
    // Atributos
    public double real;
    public double imaginario;
    
    // Constructor vacio
    public Complejo() {
        
    }
    
    // Constructor con argumentos
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    // Operaciones o Metodos
    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return this.imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
   
    public Complejo sumar(Complejo C1, Complejo C2) {
        Complejo C3 = new Complejo();
        C3.real = C1.real + C2.real;
        C3.real = Math.round(C3.real * 100.0) / 100.0; 
        C3.imaginario = C1.imaginario + C2.imaginario;
        C3.imaginario = Math.round(C3.imaginario * 100.0) / 100.0;
        return C3;
    }
    
    public Complejo restar(Complejo C1, Complejo C2) {
        Complejo C3 = new Complejo();
        C3.real = C1.real - C2.real;
        C3.real = Math.round(C3.real * 100.0) / 100.0; 
        C3.imaginario = C1.imaginario - C2.imaginario;
        C3.imaginario = Math.round(C3.imaginario * 100.0) / 100.0;
        return C3;
    }
    
    public Complejo multiplicar(Complejo C1, Complejo C2) {
        Complejo C3 = new Complejo();
        C3.real = (C1.real * C2.real) - (C1.imaginario * C2.imaginario);
        C3.real = Math.round(C3.real * 100.0) / 100.0; 
        C3.imaginario = (C1.real * C2.imaginario) + (C1.imaginario * C2.real);
        C3.imaginario = Math.round(C3.imaginario * 100.0) / 100.0;
        return C3;
    }

    @Override
    public String toString() {
        if (this.imaginario < 0) {
            return real + " " + imaginario + "i";
        } else {
            return real + " + " + imaginario + "i";
        }
    }
    
    
    
}
