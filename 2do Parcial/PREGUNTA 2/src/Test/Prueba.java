package Test;

import Negocio.ColaLista;
import Negocio.PilaLista;

public class Prueba {
    
    public static void main(String[] args) {

        PilaLista A = new PilaLista();
        ColaLista B = new ColaLista();
        
        A.push(1);
        A.push(2);
        A.push(3);
        A.push(4);
        A.push(5);
        A.push(6);
        
//        B.Encolar(5);
        B.Encolar(6);
        B.Encolar(7);
        B.Encolar(8);
        B.Encolar(9);
        B.Encolar(10);
        B.Encolar(11);
        
        System.out.println(A);
        System.out.println(B);
        
        A.IntercambiarExtremos(B);
        
        System.out.println(A);
        System.out.println(B);
        
    }
    
}
