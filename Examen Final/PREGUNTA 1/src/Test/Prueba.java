package Test;

import Negocio.Biblioteca;

public class Prueba {
    
    public static void main(String[] args) {
        
        Biblioteca A = new Biblioteca(10);
        
        A.insertar("Ruben Cabrera", 1, 50, "Santillana", 2020);
        A.insertar("Paulo Cohelo", 2, 63, "La hoguera", 1990);
        A.insertar("Luis Joyanes", 3, 100, "Mc Graw", 2002);
        A.insertar("Felix Ortuste", 2, 100, "La Estrella", 2015);
        
        System.out.println(A);
        
    }
    
}
