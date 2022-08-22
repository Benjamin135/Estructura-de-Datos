package Negocio;

public class Calculadora {
    
    String expresionInfija;
    String expresionPostfija;
    String error;
    Double resultado;
    PilaListaG<Double> pila;
    PilaListaG<Character> pilaOp;
    
    public Calculadora(String expresion) {
        this.expresionInfija = expresion;
        this.pila = new PilaListaG<>();
        this.pilaOp = new PilaListaG<>();
    }
    
    public Double resolucion() {
        expresionPostfija = conversionPostfijo();
        String[] cadena = expresionPostfija.split(" ");  
        for (String car : cadena) {
            if (jerarquia(car) > 0) {  // Es un operador
                double op1 = pila.pop();
                double op2 = pila.pop();
                double aux = operacion(op1, op2, car);
                pila.push(aux);
            } else { // Es un operando
                pila.push(Double.parseDouble(car));
            }
        }
        resultado = pila.pop();
        return resultado;
    }
    
    private Double operacion(double op1, double op2, String operador) {
        double result = 0.0;
        switch (operador) {
            case "+" -> result = op1 + op2;
            case "-" -> result = op2 - op1;
            case "×" -> result = op1 * op2;
            case "/" -> result = op2 / op1;
        }
        return result;
    }
    
    // Convierte la expresion infija a postfija
    
    private String conversionPostfijo() {
        String postfija = "";
        char[] cadena = expresionInfija.toCharArray();
        for (int i = 0; i < cadena.length; i++) {
            char car = cadena[i];
            if (jerarquia(String.valueOf(car)) > 0) {  // Es un operador
                while (!pilaOp.vacia() && jerarquia(String.valueOf(pilaOp.peek())) >= jerarquia(String.valueOf(car))) {
                    postfija += " " + pilaOp.pop();
                }
                pilaOp.push(car);
            } else if (car == ')') { // Si es parentesis de cierre saca todo hasta encontrar un parentesis de abertura
                char aux = pilaOp.pop();
                while (aux != '(') {
                    postfija += " " + aux;
                    aux = pilaOp.pop();
                }
            } else if (car == '(') {
                pilaOp.push(car);
            } else if (Character.isDigit(cadena[i])) { // Es un operando
                postfija += " " + car;
                i++;
                while (i < cadena.length) {
                    if (Character.isDigit(cadena[i])) {
                        postfija += cadena[i];
                    } else {
                        i--;
                        break;
                    }
                    i++;
                }
            }
        }
        while (!pilaOp.vacia()) {
            postfija += " " + pilaOp.pop();
        }
        return postfija.trim();
    }
    
    private int jerarquia(String operador) {
        int jerarquia = 0;
        if (operador.equals("×") || operador.equals("/")) {
            jerarquia = 2;
        } 
        if (operador.equals("+") || operador.equals("-")) {
            jerarquia = 1;
        }
        return jerarquia;
    }
    
    public String getExpresionInfija() {
        return expresionInfija;
    }

    public String getExpresionPostfija() {
        return expresionPostfija;
    }

    public String getError() {
        return error;
    }

    public Double getResultado() {
        return resultado;
    }
    
    public boolean verificarExpresionValida() {
        Validacion A = new Validacion(expresionInfija);
        if (expresionInfija.equals("")) {
            error = "NO PUEDE SER VACIA LA EXPRESIÓN INFIJA";
            return false;
        }
        if (!A.validarParentesis()) {
            error = "PARENTESIS INVALIDOS";
            return false;
        }
        if (A.empiezaConOperador()) {
            error = "NO PUEDE EMPEZAR CON UN OPERADOR";
            return false;
        }
        if (A.terminaConOperador()) {
            error = "NO PUEDE TERMINAR CON UN OPERADOR";
            return false;
        }
        if (!A.evaluarAlternaciones()) {
            error = ("ORDEN DE EXPRESIÓN INCORRECTA");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expresión Infija = " + getExpresionInfija() + "\nExpresión Postfija = " 
                + getExpresionPostfija() + "\nResultado = " + getResultado();
    }
    
}
