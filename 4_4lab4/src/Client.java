public class Client {
    private String nume;
    private int idClient;
    private Carte carte;
    private int nrZileImprumut;

    public void prelungireImprumut(int nrZile){
        nrZileImprumut =nrZileImprumut + nrZile;
    }

    public void penalizareDepasireIm(){
        int zilePenalizare = 0;
        if(nrZileImprumut > 31){
            zilePenalizare = nrZileImprumut - 31;
        }
        if(zilePenalizare == 0){
            System.out.println("Aveti " + zilePenalizare + "de zile de penalizare, va rugam achitati taxa");
        }
    }

    public void imprumutareCarte(int nrZile){
        carte.setDisponibilitate(false);
        setNrZileImprumut(nrZile);
        System.out.println("Carte imprumutata: " + carte.getTitlu());
    }

    public Client(){
        nume = "";
        idClient = 0;
        carte = new Carte();
        nrZileImprumut = 0;
    }

    public Client(String nume, int idClient, Carte carte, int nrZileImprumut){
        this.nume = nume;
        this.idClient = idClient;
        this.carte = carte;
        this.nrZileImprumut = nrZileImprumut;
    }

    public void setNrZileImprumut(int nrZileImprumut){
        this.nrZileImprumut = nrZileImprumut;;
    }

    public int getNrZileImprumut(){
        return nrZileImprumut;
    }

    public String getNume(){
         return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public int getIdClient(){
        return idClient;
    }

    public void setIdClient(int idClient){
        this.idClient = idClient;
    }

    public String toString(){
        return "Nume: " + nume + '\n'
                + "Id: " + idClient + '\n'
                + "Carte: " + carte;
    }

}
