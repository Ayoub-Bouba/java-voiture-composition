public class Moteur {
    private String nom;
    private int puissance;
    private Voiture voiture;
    public Moteur() {
        this(80);
    }
    public Moteur(Voiture voiture) {
        this(80);
        this.voiture=voiture;
    }
    public Moteur(int puissance) {
        this.puissance = puissance;
    }
    public Moteur(int puissance,Voiture voiture) {
        this.puissance = puissance;
        this.voiture=voiture;
    }
    String getNom(){
        return nom;
    }
    void setNom(String nom){
        this.nom=nom;
    }
    int getPuissance(){
        return puissance;
    }
    void setPuissance(int largeur){
        this.puissance=puissance;
    }
}
