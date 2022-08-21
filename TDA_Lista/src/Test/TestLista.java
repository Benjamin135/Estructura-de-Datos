package Test;

import Negocio1.Lista;

public class TestLista {

    public static void main(String[] args) {

        Lista A = new Lista();

//        A.insertar(1);
//        A.insertar(2);
//        A.insertar(3);
//        A.insertar(4);
//        A.insertar(5);
//        A.insertar(6);
        
        A.insertarRepetidos(1);
        A.insertarRepetidos(1);
        A.insertarRepetidos(2);
        A.insertarRepetidos(3);
        A.insertarRepetidos(3);
        A.insertarRepetidos(4);
        A.insertarRepetidos(5);
        A.insertarRepetidos(5);
        A.insertarRepetidos(7);

        System.out.println(A);
        
//        A.intercalar();
//        A.intercalar2();
//        A.eliminarUnicos();
        
        System.out.println(A);

    }

}
