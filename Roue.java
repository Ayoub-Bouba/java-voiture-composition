public class Roue {
    private int largeur;
    private int diametreJante;
    public Roue() {
        this(200,15);
    }
    public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }
    int getLargeur(){
        return largeur;
    }
    void setLargeur(int largeur){
        this.largeur=largeur;
    }
    int getDiametreJante(){
        return diametreJante;
    }
    void setDiametreJante(int largeur){
        this.diametreJante=diametreJante;
    }
}

