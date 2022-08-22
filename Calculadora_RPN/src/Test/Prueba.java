package Test;

import Negocio.Calculadora;

public class Prueba {
    
    public static void main(String[] args) {
        
//        String expresion = "((3+5)×45/8-12×2+(100-5×20))";
//        String expresion = "(25-10)/2×14+31×5-7+(10×8/2)";
        String expresion = "5+((1+2)×4)-3";
        
        Calculadora A = new Calculadora(expresion);
        
        A.resolucion();
        
        System.out.println(A);
        
    }
    
}
