package Test;

import Negocio.Sparce;
import Negocio.SparceBits;

public class TestSparse {
   
    public static void main(String[] args) {
        
        SparceBits A = new SparceBits(10, 12, 0);
        
        A.insertar(1, 2, 8);
        A.insertar(5, 8, 15);
        A.insertar(1, 9, 18);
        A.insertar(8, 1, 25);
        A.insertar(3, 7, 1);
        A.insertar(10, 3, 35);
        A.insertar(7, 2, 0.5F);
        A.insertar(6, 5, 4);
        
        System.out.println(A);
        
        A.insertar(2, 2, 78);
        A.insertar(1, 2, 25);
        A.insertar(5, 5, 14.8F);
        A.insertar(1, 9, 0);
        
        System.out.println(A);
        
    }
    
}
