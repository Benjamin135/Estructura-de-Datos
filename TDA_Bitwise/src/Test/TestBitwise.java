package Test;

import Negocio.Bitwise;

public class TestBitwise {
    
    public static void main(String[] args) {
        
        Bitwise A = new Bitwise();
        
        System.out.println("V = " + A);
        
        A.encenderBit(10);
        A.encenderBit(30);
        A.encenderBit(5);
        A.encenderBit(25);
        A.encenderBit(7);
        A.encenderBit(1);
        
        System.out.println("V = " + A);
        
        A.apagarBit(25);
        A.apagarBit(2);
        A.apagarBit(7);
        A.apagarBit(1);
        
        System.out.println("V = " + A);
        
    }
    
}
