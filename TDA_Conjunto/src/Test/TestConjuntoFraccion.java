
package Test;

import Negocio.ConjuntoFraccionBits;

public class TestConjuntoFraccion {
    
    public static void main(String[] args) {
        
        ConjuntoFraccionBits A = new ConjuntoFraccionBits();
        
        A.insertar(-9, 5);
        A.insertar(3, 2);
        A.insertar(-37, -9);
        A.insertar(-8, 5);
        A.insertar(-4, -3);
        A.insertar(-7, 9);
        
        System.out.println(A);
        
        A.insertar(-9, 5);
        A.insertar(3, 2);
        A.insertar(-37, -9);
        A.insertar(-8, 5);
        A.eliminar(-8, 5);
        A.insertar(-4, -3);
        A.insertar(-7, 9);
        A.eliminar(3, 2);
        
        System.out.println(A);
        
    }
    
}
