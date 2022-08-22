
package Negocio;

import java.io.Serializable;

public class NodoG <TipoDato> implements Serializable {
    
    TipoDato dato;
    NodoG<TipoDato> enlace;
    
    public NodoG() {
        this.enlace = null;
    }
    
    public NodoG(TipoDato dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public TipoDato getDato() {
        return this.dato;
    }

    public void setDato(TipoDato dato) {
        this.dato = dato;
    }

    public NodoG<TipoDato> getEnlace() {
        return this.enlace;
    }

    public void setEnlace(NodoG<TipoDato> enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return  (dato + "" + '\n');
    }
    
}
