public class Carte {
    private String titlu;
    private String autor;
    private String gen;
    private int anPublicare;
    private boolean disponibilitate;

    public Carte(){
        titlu = "";
        autor = "";
        gen = "";
        anPublicare = 0;
        disponibilitate = false;

    }

    public Carte(String titlu, String autor, String gen, int anPublicare, boolean disponibila, int nrZileImprumut){
        this.titlu = titlu;
        this.autor = autor;
        this.gen = gen;
        this.anPublicare = anPublicare;
        this.disponibilitate = disponibilitate;

    }

    public String getTitlu(){
        return titlu;
    }

    public void setTitlu(String titlu){
        this.titlu = titlu;
    }

    public String getAtuor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGen(){
        return gen;
    }

    public void setGen(String gen){
        this.gen = gen;
    }

    public int getAnPublicare(){
        return anPublicare;
    }

    public void setAnPublicare(int anPublicare){
        this.anPublicare = anPublicare;
    }

    public Boolean getDisponibilitate(){
        return disponibilitate;
    }

    public void setDisponibilitate(boolean dispoinibilitate){
        this.disponibilitate = disponibilitate;
    }

    public String toString() {
        return "Titlu: " + titlu + '\n'
                + "Autor: " + autor + '\n'
                + "Gen: " + gen + '\n'
                + "An publicare: " + anPublicare + '\n'
                + "Disponibilitate: " + disponibilitate + '\n';
    }



}

