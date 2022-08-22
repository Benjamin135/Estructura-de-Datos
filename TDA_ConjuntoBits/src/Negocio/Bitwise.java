package Negocio;

public class Bitwise {
    
    int V; // V tiene 32 bits
    
    public Bitwise() {
        this.V = 0; // los 32 bits estan en 0
    }
    
    public void encenderBit(int pos) {
        int mask = 1;
        mask = mask << (pos - 1);
        V = V | mask;
    }
    
    public void apagarBit(int pos) {
       int mask = 1;
       mask = mask << (pos - 1);
       mask = ~mask;
       V = V & mask;
    }
    
    public int getBit(int pos) {
        int mask = 1;
        mask = mask << (pos - 1);
        mask = mask & V;
        mask = mask >>> (pos - 1);
        return mask;
    }
    
    @Override
    public String toString() {
        String S = "[";
        for (int i = 32; i >= 1; i--) {
            S = S + getBit(i) + " ";
        }
        S = S.substring(0, S.length() - 1);
        S = S + "]";
        return S;
    }
    
}
