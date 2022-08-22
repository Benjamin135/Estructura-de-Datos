package Test;

import Negocio.ConjuntoBits;

public class TestConjuntoRangoBits {
    
    public static void main(String[] args) {
        
        ConjuntoBits A = new ConjuntoBits(10, 20);        
        ConjuntoBits B = new ConjuntoBits(5, 15);        
        ConjuntoBits C = new ConjuntoBits(10, 20);        
               
        A.Insertar(10);
        A.Insertar(20);
        A.Insertar(15);
        A.Insertar(1);
        A.Insertar(12);
        A.Insertar(5);
        A.Insertar(7);
        A.Insertar(17);
        A.Insertar(27);
        
        B.Insertar(12);
        B.Insertar(5);
        B.Insertar(7);
        B.Insertar(17);
        B.Insertar(27);
        B.Insertar(10);
        B.Insertar(9);
        B.Insertar(25);
              
        C.Union(A, B);
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        
    }
    
}
