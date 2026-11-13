import java.util.*;
public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarree;
    private Roue[] les4Roues;
    private Roue roueDeSecours;
    private Moteur moteur;
    public Voiture(int p,Roue roueDeSecours,Roue[] les4Roues){
         this.vitesse=0;
         this.estDemarree=false;
         this.roueDeSecours=roueDeSecours;
         this.moteur=new Moteur(p);
         this.les4Roues=new Roue[4];
         for(int i=0 ;i<4;i++){
            this.les4Roues[i]=les4Roues[i];
         }
    }
    
    public Voiture(){
         this.vitesse=0;
         this.estDemarree=false;
         this.roueDeSecours=null;
         this.moteur=new Moteur(this);
    }
    public void demarre(){
        estDemarree =true ;
    }

    void accelere(double vitesse){
        if(estDemarree){
            this.vitesse = this.vitesse + vitesse;
        }
    }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public double getVitesse() { return vitesse; }
    public boolean isEstDemarree() { return estDemarree; }
    public Roue[] getLes4Roues() { return les4Roues; }
    public Roue getRoueDeSecours() { return roueDeSecours; }
    public void setRoueDeSecours(Roue r) { this.roueDeSecours = r; }
    public Moteur getMoteur() { return moteur; }

    public int deQuellePuissance() {
        return this.moteur.getPuissance();
    }
    

}
