package Test;

import Negocio.Conjunto;

public class TestConjunto {
    
    public static void main(String[] args) {
        
        Conjunto A = new Conjunto();
        Conjunto B = new Conjunto();
        Conjunto C = new Conjunto();
        Conjunto D = new Conjunto();
        
        A.insertar(10);
        A.insertar(5);
        A.insertar(7);
        A.insertar(3);
        A.insertar(20);
        A.insertar(18);
        A.insertar(26);
        A.eliminar(10);
        
        System.out.println("A = " + A);
        
        B.insertar(1);
        B.insertar(3);
        B.insertar(20);
        B.insertar(18);
        B.insertar(5);
        B.insertar(7);
        B.insertar(26);
        B.insertar(10);
        
        System.out.println("B = " + B);
        
        boolean b = false;
        b = C.SubConjunto(A, B);
        if (b) {
            System.out.println("A es subconjunto de B");
        } else {
            System.out.println("A no es subconjunto de B");
        }
        
        C.union(A, B);
        System.out.println("A U B = " + C);
        
        D.interseccion(A, B); 
        System.out.println("A ∩ B = " + D);
        
    }
            
}
