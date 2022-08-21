package Test;

import Negocio.ColaLista;
import Negocio.Pila;
import Negocio.PilaBits;
import Negocio.PilaBitsDinamica;
import Negocio.PilaLista;

public class TestPila {

    public static void main(String[] args) {

        Pila A = new Pila(20);
        Pila C = new Pila(20);
        ColaLista B = new ColaLista();
        //PilaBits A = new PilaBits(10, 10);
        //PilaBitsDinamica A = new PilaBitsDinamica(10);
        //PilaLista A = new PilaLista();

        A.push(7);
//        A.push(7);
        A.push(1);
        A.push(1);
        A.push(2);
        A.push(2);
        A.push(3);
        A.push(3);
        A.push(4);
        A.push(4);
        A.push(8);
//        A.push(1);

//        A.push(1);
//        A.push(2);
//        A.push(3);
//        A.push(4);
//        A.push(5);
//        A.push(6);
//        A.push(7);
//        A.push(8);
//        A.push(9);
//        A.push(10);

//        C.push(6);
        C.push(7);
        C.push(8);
        C.push(9);
        C.push(10);
        C.push(11);
        C.push(12);

//        B.Encolar(5);
//        B.Encolar(6);
//        B.Encolar(7);
//        B.Encolar(8);
//        B.Encolar(9);
//        B.Encolar(10);
//        B.Encolar(11);
//        B.Encolar(12);
//        B.Encolar(13);

        B.Encolar(1);
        B.Encolar(2);
        B.Encolar(6);
        B.Encolar(2);
//        B.Encolar(3);
        B.Encolar(4);
        B.Encolar(5);
        B.Encolar(5);
        B.Encolar(1);
        B.Encolar(4);
        B.Encolar(6);

        System.out.println(A);
        System.out.println(B + "\n");
//        System.out.println(C);

//        A.eliminarUnicos();
//        A.eliminarRepetidos();
        //A.Invertir2();
//        A.intercalar_3();
        //A.eliminarExtremos();
//        A.cambiarMitad();
//        A.intercambiarExtremos();
        //A.Eliminar(5);
        //A.EliminarPares();
//        A.intercambiarExtremosPilaCola(B);
//        A.intercambiarExtremosPilaCola2(B);
//        A.intercambiarExtremosPilaCola3(B);
//        A.intercambiarElementosPilas(C);
//        A.intercambiarExtremosPilas2(A, C);
//        A.intercambiarElmentosPilaCola(B);
//        A.IntercambiarExtremosPilaCola(B);
//        A.intercambiarExtremosPilas(C);
//        A.intercambiarMitadesAux();
//        A.intercambiarMitades();
//        A.intercambiarMitades2();
//        A.intercambiarMitadPilas(C);
        A.eliminarRepetidosPilaCola(B);
        
        System.out.println(A);
        System.out.println(B + "\n");
//        System.out.println(C);

    }

}
