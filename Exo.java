//saisir un entier puis lister son signe//
import java.util.Scanner;
 class Exo {
        
    public static void main(String[] args){
        Scanner clavier =new Scanner(System.in);
        System.out.println("Veuillez saisir un entier :");
        int nbre=clavier.nextInt();
        if (nbre==0) {
            System.out.println("Ce nombre est nul !");
        }else if (nbre>0){
            System.out.println("Ce nombre est positif !");
        }else{
            System.out.println("Ce nombre est negatif !");
        }
    }
}

        

    
