import java.awt.*;

public class Main {
    public static void main(String args[]){
        Sofer marcel = new Sofer();
        Autovehicul bmw = new Autovehicul();
        Rezervor rezervorInox = new Rezervor();
        Autovehicul mercedes = new Autovehicul("Mercedes", Color.YELLOW , 100, 400, 6, 6, marcel, rezervorInox);
        System.out.println(mercedes); // atunci cand ii dai sa afiseze, calculaoturl foloseste direct toString singur, nu mai trebuie sa l scriem noi explicit a.toString()

        System.out.println("Accelerare: ");
        for(int i = 0; i <= 10; i++){
            mercedes.setAccelerare(i);
            System.out.println(mercedes.getVitezaCurenta());
        }

        System.out.println("Decelerare: ");
        for(int i = 0; i <= 10; i++){
            mercedes.setDecelerare(i);
            mercedes.oprire();
            System.out.println(mercedes.getVitezaCurenta());
            System.out.println(mercedes.getTreaptaVitezaCurenta());
        }

        System.out.println("Umplere rezervor: ");
        for(int i = 2; i <= 5; i++){
            rezervorInox.umplereRezevor(i);
        }
        System.out.println("Nivel umplere: " + rezervorInox.getNivelCurentUmplere());

    }
}