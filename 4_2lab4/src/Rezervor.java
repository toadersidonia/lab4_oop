public class Rezervor {
    private int capacitateMaxima;
    private int nivelCurentUmplere;

    public Rezervor(){
        capacitateMaxima = 30;
        nivelCurentUmplere = 0;
    }

    public Rezervor(int capacitateMaxima, int nivelCurentUmplere){
        this.capacitateMaxima = capacitateMaxima;
        this.nivelCurentUmplere = nivelCurentUmplere;
    }

    public int getCapacitateMaxima(){
        return capacitateMaxima;
    }
    public void setCapacitateMaxima(int capacitateMaxima){
        this.capacitateMaxima = capacitateMaxima;
    }
    public int getNivelCurentUmplere(){
        return nivelCurentUmplere;
    }
    public void setNivelCurentUmplere(){
        this.nivelCurentUmplere = nivelCurentUmplere;
    }
    public void umplereRezevor(int cantCombustibil){
        if(nivelCurentUmplere + cantCombustibil <= capacitateMaxima){
            nivelCurentUmplere += cantCombustibil;
        }else{
            nivelCurentUmplere = capacitateMaxima;
        }
    }
    public void golireRezevor(int cantCombustibil){
        if(nivelCurentUmplere - cantCombustibil >= 0){
            nivelCurentUmplere -= cantCombustibil;
        }else{
            nivelCurentUmplere = 0;
        }
    }
    public void supraincarcare(int capacitateMaxima, int nivelUmplere){
        if(nivelUmplere > capacitateMaxima){
            this.nivelCurentUmplere = capacitateMaxima;
        }else{
            this.nivelCurentUmplere = nivelUmplere;
        }
    }
    public void supraincarcare(int capacitateMaxima, byte nivelUmplere){
        if(nivelUmplere > capacitateMaxima){
            this.nivelCurentUmplere = capacitateMaxima;
        }else{
            this.nivelCurentUmplere = nivelUmplere;
        }
    }

    public String toString(){
        return "Capacitate maxima rezervor: " + capacitateMaxima + '\n'
                + "Nivel umplere curent: " + nivelCurentUmplere;
    }
}
