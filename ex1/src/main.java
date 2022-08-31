import java.util.Scanner;

// fonctionnement d'une classe en general

class etudiant{
    private Integer matricule_;

    private int[] tab = null;

    private String nom_;

    public etudiant(Integer x, String y){
        this.matricule_ = x;
        this.nom_ = y;
    }
    public void sePresenter(){
        System.out.println("Je m'appelle " + this.nom_ + " et mon matricule est " + this.matricule_.toString());
    }

    public void setNom_(String nom_) {
        this.nom_ = nom_;
    }

    public void setMatricule_(Integer matricule_) {
        this.matricule_ = matricule_;
    }
}
// utilisation d'une interface
interface Animal{
    public void makeSound();
}

class Lion implements Animal{
    public String sound;
    public Lion(String sound){
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound + "!!!!!!");
    }
}



class Infos {
    public static Scanner myScan = new Scanner(System.in);

    public etudiant makeStudent(){
        System.out.println("Veuillez entrer votre nom: ");
        String nom = myScan.nextLine();
        System.out.println("Veuillez entrer votre matricule: ");
        Integer mtr = Integer.parseInt(myScan.nextLine());
        return new etudiant(mtr, nom);
    }

}



// main du programme
public class main {
    // Initialisation de Variables
    static etudiant Yejin = new etudiant(2088988, "Yejin Kim");
    static Lion myLion = new Lion("Roar");



    // Appels des fonctions depuis le main
    public static void main (String[] args){
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }

}

