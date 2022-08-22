package Test;

import Negocio.ConjuntoBits;

public class TestConjuntoBits {
    
    public static void main(String[] args) {
        
        ConjuntoBits A = new ConjuntoBits();
        ConjuntoBits B = new ConjuntoBits();
        ConjuntoBits C = new ConjuntoBits();
        ConjuntoBits D = new ConjuntoBits();
    
        A.insertar(10);
        A.insertar(5);
        A.insertar(1);
        A.insertar(8);
        A.insertar(15);
        A.insertar(250);
        A.insertar(450);
        A.insertar(950);
        
        System.out.println("A = " + A);
        
//        A.eliminar(10);
//        A.eliminar(250);
//        A.eliminar(5);
//        A.insertar(18);
//        A.insertar(83);
//        A.insertar(179);
//        A.eliminar(950);
//        
//        System.out.println("A = " + A);
        
        B.insertar(5);
        B.insertar(15);
        B.insertar(8);
        B.insertar(7);
        B.insertar(71);
        B.insertar(25);
        B.insertar(250);
        B.insertar(270);
        B.insertar(450);
//        B.insertar(750);
        
        System.out.println("B = " + B);
        
        C.Union(A, B);
        System.out.println("A U B = " + C);
        
        C.Interseccion(A, B);
        System.out.println("A ∩ B = " + C);
        
        C.diferencia(A, B);
        System.out.println("A - B = " + C);
        
        C.diferencia(B, A);
        System.out.println("B - A = " + C);

        C.diferenciaSimetrica(A, B);
        System.out.println("A \u2206 B = " + C);
        
        boolean b = D.subconjunto(A, B);
        if (b) {
            System.out.println("A es subconjunto de B");
        } else {
            System.out.println("A no es subconjunto de B");
        }
        
    }
    
}
