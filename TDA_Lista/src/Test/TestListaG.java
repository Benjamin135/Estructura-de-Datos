package Test;

import Negocio1.Alumno;
import Negocio1.Libro;
import Negocio1.ListaG;

public class TestListaG {
    
    public static void main(String[] args) {

        ListaG LE = new ListaG<Integer>();

        LE.Insertar(4);
        LE.Insertar(10);
        LE.Insertar(8);
        LE.Insertar(16);
        LE.Insertar(1);
        
        System.out.println(LE.Mostrar());
        
        ListaG LF = new ListaG<Float>();
        
        LF.Insertar(10.5);
        LF.Insertar(5.0);
        LF.Insertar(7.8);
        LF.Insertar(51.7);
        LF.Insertar(9.5);
        
        System.out.println(LF.Mostrar());
        
        ListaG LS = new ListaG<String>();
        
        LS.Insertar("Benjamin");
        LS.Insertar("Santiago");
        LS.Insertar("Lizeth");
        LS.Insertar("Antonio");
        LS.Insertar("Ezequiel");
        
        System.out.println(LS.Mostrar());
        
        Alumno A = new Alumno(8873925, 220104099, "Benjamin", true, 20);
        Alumno B = new Alumno(8637241, 220045181, "Lizeth", false, 21);
        Alumno C = new Alumno(8913455, 201701141, "Marcos", true, 45);
        
        ListaG LA = new ListaG<Alumno>();
        
        LA.Insertar(A);
        LA.Insertar(B);
        LA.Insertar(C);
        
        System.out.println("");
        System.out.println(LA.toString());
        
        Libro M = new Libro(105, "Informatica Basica", "Pedro Garron",1 , 2020, "Santillana", 250);
        Libro N = new Libro(103, "Informatica I", "Alberto Suarez",2 , 2021, "La Hoguera", 150);
        Libro O = new Libro(101, "Estructura de datos", "Luis Joyanes",4 , 2018, "Mc Graw", 550);
        Libro P = new Libro(107, "Sistemas Operativos I", "Felix Ortuste",2 , 2015, "La Estrella", 450);
        Libro Q = new Libro(103, "Sistemas Operativos II", "Felix Ortuste",3 , 2017, "La Estrella", 450);
        
        ListaG LL = new ListaG<Libro>();
        
        LL.Insertar(M);
        LL.Insertar(N);
        LL.Insertar(O);
        LL.Insertar(P);
        LL.Insertar(Q);
        
//        for (int i = 1; i <= LL.getCant(); i++) {
//            Libro x = (Libro)LL.GetDato(i);
//            System.out.println(x);
//        }
        
        System.out.println("");
        System.out.println(LL.toString());
        
    }
    
}
