package Test;

import Negocio.FichaVacuna;

public class TestFichaVacuna {
    
    public static void main(String[] args) {
        
        FichaVacuna A = new FichaVacuna(5);
        
        A.insertar("Benjamin", "Condori Vasquez", 5, 6, 2021, 1, 19);
        A.insertar("Lizeth", "Castro Yovio", 8, 9, 2021, 0, 20);
        //String fichaA = A.mostrarFicha(1);
        System.out.println(A);
        
        A.setNombre(2, "Santiago");
        A.setApellido(2, "Lopez Perez");
        A.setGenero(2, 1);
        A.setAño(2, 2022);
        A.setEdad(2, 21);
        System.out.println(A);
        
    }
    
}
