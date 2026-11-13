import java.util.*;
public class TestVoiture{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("entrez votre puissance");
        int p=input.nextInt();
        Moteur mt=new Moteur(p);
        Roue roueS=new Roue(205,16);
        Roue[] wheels = {
            new Roue(205, 16), new Roue(205, 16),
            new Roue(205, 16), new Roue(205, 16)
        };
        Voiture bmw=new Voiture(p,roueS,wheels);
        System.out.print(bmw.deQuellePuissance());
        
        
    }
}
