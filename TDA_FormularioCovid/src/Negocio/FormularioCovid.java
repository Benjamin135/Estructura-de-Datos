package Negocio;

public class FormularioCovid {

    String nombres[];
    VectorBitsG V;
    public int dim;
    public int cant = 100;

    public FormularioCovid() {
        this.dim = 0;
        V = new VectorBitsG(cant, 28);
        nombres = new String[cant];
    }

    public void insertar(String nombre, int edad, int sexo, int pesoEnt, int pesoDec,
            int fiebre, int tos, int garganta, int cabeza, int respiracion, int diarrea,
            int muscular, int olfato, int gusto) {
        this.dim++;
        int mask = edad;
        sexo = sexo << 7;
        mask = mask | sexo;
        pesoEnt = pesoEnt << 8;
        mask = mask | pesoEnt;
        pesoDec = pesoDec << 15;
        mask = mask | pesoDec;
        fiebre = fiebre << 19;
        mask = mask | fiebre;
        tos = tos << 20;
        mask = mask | tos;
        garganta = garganta << 21;
        mask = mask | garganta;
        cabeza = cabeza << 22;
        mask = mask | cabeza;
        respiracion = respiracion << 23;
        mask = mask | respiracion;
        diarrea = diarrea << 24;
        mask = mask | diarrea;
        muscular = muscular << 25;
        mask = mask | muscular;
        olfato = olfato << 26;
        mask = mask | olfato;
        gusto = gusto << 27;
        mask = mask | gusto;
        V.insertar(mask, dim);
        nombres[dim] = nombre;
    }

    public String getNombre(int pos) {
        return nombres[pos];
    }

    public int getEdad(int pos) {
        int x = V.sacar(pos);
        x = x << 25;
        x = x >>> 25;
        return x;
    }

    public int getSexo(int pos) {
        int x = V.sacar(pos);
        x = x << 24;
        x = x >>> 31;
        return x;
    }

    public int getPesoEnt(int pos) {
        int x = V.sacar(pos);
        x = x << 17;
        x = x >>> 25;
        return x;
    }

    public int getPesoDec(int pos) {
        int x = V.sacar(pos);
        x = x << 13;
        x = x >>> 28;
        return x;
    }

    public int getFiebre(int pos) {
        int x = V.sacar(pos);
        x = x << 12;
        x = x >>> 31;
        return x;
    }

    public int getTos(int pos) {
        int x = V.sacar(pos);
        x = x << 11;
        x = x >>> 31;
        return x;
    }

    public int getGarganta(int pos) {
        int x = V.sacar(pos);
        x = x << 10;
        x = x >>> 31;
        return x;
    }

    public int getCabeza(int pos) {
        int x = V.sacar(pos);
        x = x << 9;
        x = x >>> 31;
        return x;
    }

    public int getRespiracion(int pos) {
        int x = V.sacar(pos);
        x = x << 8;
        x = x >>> 31;
        return x;
    }

    public int getDiarrea(int pos) {
        int x = V.sacar(pos);
        x = x << 7;
        x = x >>> 31;
        return x;
    }

    public int getMuscular(int pos) {
        int x = V.sacar(pos);
        x = x << 6;
        x = x >>> 31;
        return x;
    }

    public int getOlfato(int pos) {
        int x = V.sacar(pos);
        x = x << 5;
        x = x >>> 31;
        return x;
    }

    public int getGusto(int pos) {
        int x = V.sacar(pos);
        x = x << 4;
        x = x >>> 31;
        return x;
    }

    public void setNombre(int pos, String nombre) {
        nombres[pos] = nombre;
    }

    public void setEdad(int pos, int edad) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 7) - 1);
        mask = ~mask;
        x = x & mask;
        x = x | edad;
        V.insertar(x, pos);
    }

    public void setSexo(int pos, int sexo) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 7;
        mask = ~mask;
        x = x & mask;
        sexo = sexo << 7;
        x = x | sexo;
        V.insertar(x, pos);
    }

    public void setPesoEnt(int pos, int pesoEnt) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 7) - 1);
        mask = mask << 8;
        mask = ~mask;
        x = x & mask;
        pesoEnt = pesoEnt << 8;
        x = x | pesoEnt;
        V.insertar(x, pos);
    }

    public void setPesoDec(int pos, int pesoDec) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 4) - 1);
        mask = mask << 15;
        mask = ~mask;
        x = x & mask;
        pesoDec = pesoDec << 15;
        x = x | pesoDec;
        V.insertar(x, pos);
    }

    public void setFiebre(int pos, int fiebre) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 19;
        mask = ~mask;
        x = x & mask;
        fiebre = fiebre << 19;
        x = x | fiebre;
        V.insertar(x, pos);
    }

    public void setTos(int pos, int tos) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 20;
        mask = ~mask;
        x = x & mask;
        tos = tos << 20;
        x = x | tos;
        V.insertar(x, pos);
    }

    public void setGarganta(int pos, int garganta) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 21;
        mask = ~mask;
        x = x & mask;
        garganta = garganta << 21;
        x = x | garganta;
        V.insertar(x, pos);
    }

    public void setCabeza(int pos, int cabeza) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 22;
        mask = ~mask;
        x = x & mask;
        cabeza = cabeza << 22;
        x = x | cabeza;
        V.insertar(x, pos);
    }

    public void setRespiracion(int pos, int respiracion) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 23;
        mask = ~mask;
        x = x & mask;
        respiracion = respiracion << 23;
        x = x | respiracion;
        V.insertar(x, pos);
    }

    public void setDiarrea(int pos, int diarrea) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 24;
        mask = ~mask;
        x = x & mask;
        diarrea = diarrea << 24;
        x = x | diarrea;
        V.insertar(x, pos);
    }

    public void setMuscular(int pos, int muscular) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 25;
        mask = ~mask;
        x = x & mask;
        muscular = muscular << 25;
        x = x | muscular;
        V.insertar(x, pos);
    }

    public void setOlfato(int pos, int olfato) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 26;
        mask = ~mask;
        x = x & mask;
        olfato = olfato << 26;
        x = x | olfato;
        V.insertar(x, pos);
    }

    public void setGusto(int pos, int gusto) {
        int x = V.sacar(pos);
        int mask = (int) (Math.pow(2, 1) - 1);
        mask = mask << 27;
        mask = ~mask;
        x = x & mask;
        gusto = gusto << 27;
        x = x | gusto;
        V.insertar(x, pos);
    }
    
    public String mostrarFormulario(int num) {
        String s = "N° " + num + "\nNombre: " + getNombre(num) + "\nEdad: "
        + getEdad(num) + "\nSexo: ";
        s = (getSexo(num) == 1)? s + "Masculino": s + "Femenino";
        s = s + "\nPeso: " + getPesoEnt(num) + "." + getPesoDec(num) + "\nSintomas: ";
        s = (getFiebre(num) == 1)? s + "\n - Fiebre": s + "";
        s = (getTos(num) == 1)? s + "\n - Tos": s;
        s = (getGarganta(num) == 1)? s + "\n - Dolor de garganta": s;
        s = (getCabeza(num) == 1)? s + "\n - Dolor de cabeza": s;
        s = (getRespiracion(num) == 1)? s + " \n - Falta de respiracion": s;
        s = (getDiarrea(num) == 1)? s + "\n - Diarrea": s;
        s = (getMuscular(num) == 1)? s + "\n - Dolor muscular": s;
        s = (getOlfato(num) == 1)? s + "\n - Perdida de olfato": s;
        s = (getGusto(num) == 1)? s + "\n - Perdida del gusto": s;
        s = (getFiebre(num) == 0 && getTos(num) == 0 && getGarganta(num) == 0 && 
                getCabeza(num) == 0 && getRespiracion(num) == 0 && getDiarrea(num) == 0 && 
                getMuscular(num) == 0 && getOlfato(num) == 0 && getGusto(num) == 0)? 
                s + "\n - No tiene ningun sintoma": s;
        return s;
    }
    
    
    @Override
    public String toString() {
        String s = "FORMULARIO DE ANALISIS DE COVID \n------------------------------------------\n";
        for (int i = 1; i <= dim; i++) {
            s = s + mostrarFormulario(i) + "\n------------------------------------------\n";
        }
        return s;
    }

}
