
package Test;

import Negocio.Lista;

public class TestLista {
    
    public static void main(String[] args) {
        
        Lista A = new Lista();
        
        A.insertar(1);
        A.insertar(2);
        A.insertar(3);
        A.insertar(4);
        A.insertar(5);
        A.insertar(6);
        
        System.out.println(A);
        
        A.volcar2();
        
        System.out.println(A);
        
    }
    
}
