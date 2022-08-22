package Test;

import Negocio.FechaBits;

public class TestFechaBits {
    
    public static void main(String[] args) {
        
        FechaBits A = new FechaBits();
             
        A.insertar(5, 6, 2002);
        A.insertar(8, 9, 2001);
        A.insertar(27, 5, 2022);

        System.out.println(A);
        
    }
    
}
