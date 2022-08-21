package Test;

import Negocio1.Alumno;
import Negocio1.Libro;
import Negocio2.ListaDobleG;

public class TestListaDobleG {

    public static void main(String[] args) {

//        ListaDobleG LE = new ListaDobleG<Integer>();
//
//        LE.Insertar(4);
//        LE.Insertar(10);
//        LE.Insertar(8);
//        LE.Insertar(16);
//        LE.Insertar(1);
//
//        System.out.println(LE.toString());
//        
//        LE.Eliminar(5);
//        LE.Eliminar(10);
//        LE.Eliminar(16);
//        LE.Eliminar(4);
//        
//        System.out.println(LE.toString());

//        ListaDobleG LF = new ListaDobleG<Float>();
//
//        LF.Insertar(10.5);
//        LF.Insertar(5.0);
//        LF.Insertar(7.8);
//        LF.Insertar(51.7);
//        LF.Insertar(9.5);
//
//        System.out.println(LF.toString());
//        
//        LF.Eliminar(10.5);
//        LF.Eliminar(5.0);
//        LF.Eliminar(7.8);
//
//        System.out.println(LF.toString());
        
//        ListaDobleG LS = new ListaDobleG<String>();
//
//        LS.Insertar("Benjamin");
//        LS.Insertar("Santiago");
//        LS.Insertar("Lizeth");
//        LS.Insertar("Antonio");
//        LS.Insertar("Ezequiel");
//
//        System.out.println(LS.toString());
//        
//        LS.Eliminar("Santiago");
//        LS.Eliminar("Antonio");
//        LS.Eliminar("Ezequiel");
//        
//        System.out.println(LS.toString());

//        Alumno A = new Alumno(8873925, 220104099, "Benjamin", true, 20);
//        Alumno B = new Alumno(8637241, 201701141, "Lizeth", false, 21);
//        Alumno C = new Alumno(8913455, 220045181, "Marcos", true, 45);
//        Alumno D = new Alumno(8713125, 210143241, "Carlos", true, 30);
//
//        ListaDobleG LA = new ListaDobleG<Alumno>();
//
//        LA.Insertar(A);
//        LA.Insertar(B);
//        LA.Insertar(C);
//        LA.Insertar(D);
//
//        System.out.println(LA.Mostrar());

        Libro M = new Libro(105, "Informatica Basica", "Pedro Garron", 1, 2020, "Santillana", 250);
        Libro N = new Libro(103, "Informatica I", "Alberto Suarez", 2, 2021, "La Hoguera", 150);
        Libro O = new Libro(101, "Estructura de datos", "Luis Joyanes", 4, 2018, "Mc Graw", 550);
        Libro P = new Libro(107, "Sistemas Operativos I", "Felix Ortuste", 2, 2015, "La Estrella", 450);
        Libro Q = new Libro(103, "Sistemas Operativos II", "Felix Ortuste", 3, 2017, "La Estrella", 450);

        ListaDobleG LL = new ListaDobleG<Libro>();

        LL.Insertar(M);
        LL.Insertar(N);
        LL.Insertar(O);
        LL.Insertar(P);
        LL.Insertar(Q);

        System.out.println(LL.Mostrar());

    }

}
