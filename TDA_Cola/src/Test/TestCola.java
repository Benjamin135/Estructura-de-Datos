package Test;

import Negocio.ColaBits;
import Negocio.ColaLista;
import Negocio.ColaVector;

public class TestCola {

    public static void main(String[] args) {
        
        //ColaVector A = new ColaVector(10);
        //ColaBits A = new ColaBits(10, 6);
        ColaLista A = new ColaLista();
        ColaLista B = new ColaLista();

//        A.Encolar(5);
//        A.Encolar(1);
//        A.Encolar(1);
//        A.Encolar(2);
//        A.Encolar(3);
//        A.Encolar(4);
//        A.Encolar(2);
//        A.Encolar(4);
//        A.Encolar(5);
//        A.Encolar(3);
//        A.Encolar(1);
        
        A.Encolar(1);
        A.Encolar(2);
        A.Encolar(3);
        A.Encolar(4);
        A.Encolar(5);
        A.Encolar(6);
//        A.Encolar(7);
//        A.Encolar(8);
//        A.Encolar(9);
//        A.Encolar(10);
        
        B.Encolar(6);
        B.Encolar(7);
        B.Encolar(8);
        B.Encolar(9);
        B.Encolar(10);

        System.out.println("A = " + A);
//        System.out.println("B = " + B);
        
        //A.invertir();
//        A.intercambiarExtremos();
//        A.invertirExtremosColas(B);
        //A.intercambiarColas(B);
//        A.invertir1Mitad();
//        A.intercambiarMitades();
        A.invertirMitades();
//        A.eliminarRepetidos();
//        A.eliminarRepetidos2();
//        A.eliminarUnicos();
//        A.eliminarExtremos();
//        A.eliminarRepetidosAux();
        
        System.out.println("A = " + A);
//        System.out.println("B = " + B);
        
    }

}
