package Test;

import Negocio2.ListaDoble;

public class TestListaDoble {
    
    public static void main(String[] args) {
        
        ListaDoble A = new ListaDoble();
        ListaDoble B = new ListaDoble();

        A.Insertar(10);
        A.Insertar(5);
        A.Insertar(1);
        A.Insertar(1);
        A.Insertar(8);
        A.Insertar(18);
        A.Insertar(10);
        A.Insertar(25); 
        
        System.out.println(A.toString());
//        System.out.println("" + A.getCant());
        
        A.Eliminar(1);
        A.Eliminar(10);
        A.Eliminar(27);
        A.Eliminar(14);
        A.Eliminar(25);
//        A.Eliminar(5);
//        A.Eliminar(18);
//        A.Eliminar(8);
        
        System.out.println(A.toString());
//        System.out.println("" + A.getCant());
//        System.out.println(A.Existe(5));
        
//        A.InsertarInicio(3);
//        A.InsertarInicio(1);
        A.InsertarInicio(10);
        A.InsertarInicio(18);
        
        System.out.println(A.toString());
//        System.out.println("" + A.getCant());

        A.InsertarFin(30);
        A.InsertarFin(5);
        A.InsertarFin(7);
        A.InsertarFin(100);
        
        System.out.println(A.toString());
//        System.out.println("" + A.getCant());
        
        B.InsertarPorFin(5);
        B.InsertarPorFin(10);
        B.InsertarPorFin(1);
        B.InsertarPorFin(15);
        B.InsertarPorFin(3);
        B.InsertarPorFin(5);
        B.InsertarPorFin(2);
        B.InsertarPorFin(25);
        B.InsertarPorFin(17);
        
        System.out.println(B.toString());

    }
    
}
