package Test;

import Negocio.ConjuntoRangoBits;

public class TestConjuntoRangoBits {
    
    public static void main(String[] args) {
        
        ConjuntoRangoBits A = new ConjuntoRangoBits(10, 20);        
               
        A.Insertar(10);
        A.Insertar(20);
        A.Insertar(15);
        A.Insertar(1);
        A.Insertar(12);
        A.Insertar(5);
        A.Insertar(7);
        A.Insertar(17);
        A.Insertar(27);
        
        System.out.println(A);
        
        A.Insertar(11);
        A.Insertar(101);
        A.Eliminar(13);
        A.Eliminar(5);
        A.Eliminar(12);
        A.Eliminar(7);
        A.Eliminar(10);
        A.Eliminar(20);
        
        System.out.println(A);
        
        
    }
    
}
