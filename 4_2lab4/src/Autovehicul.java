import java.awt.*;

public class Autovehicul {
    private String model;
    private Color color;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private static final int NRTREPTE = 6;
    private int treaptaVitezaCurenta;
    private int treaptaVitezaMaxima;
    private Sofer sofer;
    private Rezervor rezervor;

    public Autovehicul(){
        model = "bmw";
        color = Color.BLACK;
        vitezaCurenta = 0;
        vitezaMaxima = 300;
        treaptaVitezaCurenta = 0;
        treaptaVitezaMaxima = 0;
        sofer = new Sofer();
        rezervor = new Rezervor();
    }

    public Autovehicul(String model, Color color, int vitezaCurenta, int vitezaMaxima, int treaptaVitezaCurenta, int  treaptaVitezaMaxima, Sofer sofer, Rezervor rezervor) {
        this.model = model;
        this.color = color;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
        this.treaptaVitezaMaxima = treaptaVitezaMaxima;
        this.sofer = sofer;
        this.rezervor = rezervor;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getVitezaCurenta() {
        return vitezaCurenta;
    }
    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
    public int getTreaptaVitezaCurenta(){
        return treaptaVitezaCurenta;
    }
    public void setTreaptaVitezaCurenta(){
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public String toString(){
        return "Autovehicul cu marca: " + model + '\n' +
                "Culoarea: " + color + '\n' +
                "Viteza curenta: " + vitezaCurenta + '\n' +
                "Viteza maxima: " + vitezaMaxima + '\n' +
                "Treapta de viteza: " + treaptaVitezaCurenta + '\n' +
                "Numar trepte: " + NRTREPTE;
    }

    public void setAccelerare(int k){
        if(vitezaCurenta + k > vitezaMaxima){
            vitezaCurenta = vitezaMaxima;
        }else{
            vitezaCurenta = vitezaCurenta + k;
        }
    }

    public void setDecelerare(int k){
        if(vitezaCurenta - k < vitezaMaxima){
            vitezaCurenta = vitezaCurenta - k;
        }else{
            vitezaCurenta = vitezaMaxima;
        }
    }

    public void setTreapta(int k){
        if(treaptaVitezaCurenta + k > NRTREPTE){
            treaptaVitezaCurenta = NRTREPTE;
        }else{
            treaptaVitezaCurenta = treaptaVitezaCurenta + k;
        }
    }

    public void oprire(){
        if(vitezaCurenta < 300 && vitezaCurenta > 200){
            treaptaVitezaCurenta = 6;
        }
        if(vitezaCurenta < 150 && vitezaCurenta > 200){
            treaptaVitezaCurenta = 5;
        }
        if(vitezaCurenta < 150 && vitezaCurenta > 100){
            treaptaVitezaCurenta = 4;
        }
        if(vitezaCurenta < 100 && vitezaCurenta > 65){
            treaptaVitezaCurenta = 3;
        }
        if(vitezaCurenta < 30 && vitezaCurenta > 65){
            treaptaVitezaCurenta = 2;
        }
        if(vitezaCurenta < 30 && vitezaCurenta > 0){
            treaptaVitezaCurenta = 1;
        }
        if(vitezaCurenta == 0){
            treaptaVitezaCurenta = 0;
        }
    }
}
