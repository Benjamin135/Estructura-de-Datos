package Test;

import Negocio.Vector7Bits;
import Negocio.VectorBitsG;

public class TestVectorBitsG {
    
    public static void main(String[] args) {
        
        Vector7Bits V = new Vector7Bits(10);
        VectorBitsG A = new VectorBitsG(10, 7);
        
        V.insertar(15, 1);
        V.insertar(55, 5);
        V.insertar(1, 8);
        V.insertar(110, 9);
        V.insertar(94, 3);

        System.out.println("V = " + V);
        
        A.insertar(15, 1);
        A.insertar(55, 5);
        A.insertar(1, 8);
        A.insertar(110, 9);
        A.insertar(94, 3);
        
        System.out.println("A = " + A);
        
    }
    
}
