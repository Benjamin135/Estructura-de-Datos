
package Test;

import Negocio.FormularioCovid;

public class TestFormularioCovid {
    
    public static void main(String[] args) {
        
        FormularioCovid A = new FormularioCovid();
        
        A.insertar("Benjamin", 20, 1, 70, 8, 1, 1, 0, 1, 0, 0, 1, 0, 0);
        A.insertar("Sebastian", 45, 1, 120, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        A.insertar("Carla", 25, 0, 53, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        
        System.out.println(A);
        
    }
    
}
