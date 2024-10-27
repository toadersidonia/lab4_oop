public class Main {
    public static void main(String[] args) {
        Carte ion = new Carte("Ion", "Liviu Rebreanu", "interbelic", 1920, true, 0);

        Client c1 = new Client("Gigel", 1116, ion, 0);
        c1.imprumutareCarte(20);

        System.out.println(c1.toString());

        Carte enigmaOtiliei = new Carte("Enigma Otiliei", "George Calinescu", "balzacian", 1930, true, 0);
        Client c2 = new Client("Ana", 1117, enigmaOtiliei, 0);
        c2.imprumutareCarte(25);
        c2.prelungireImprumut(7);
        c2.penalizareDepasireIm();

        System.out.println(c2.toString());




    }

}
