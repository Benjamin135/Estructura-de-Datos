package Test;

import Negocio.Domino;

public class Prueba {
    
    public static void main(String[] args) {
        
        Domino A = new Domino();
        
        A.insertar(5, 1);
        A.insertar(5, 2);
        A.insertar(3, 2);
        A.insertar(1, 6);
        A.insertar(6, 5);
        A.insertar(2, 5);
        A.insertar(5, 10);
        A.insertar(3, 1);
        A.insertar(7, 1);
        A.insertar(4, 5);
        A.insertar(4, 6);
        
        System.out.println(A);
        
    }
    
}
