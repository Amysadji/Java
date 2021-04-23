//saisir deux entier puis les comparer//
import java.util.Scanner;
class Comparaison{
  public static void main (String[] args){
    Scanner comp= new Scanner(System.in);
        System.out.print("Entrer le premier nombre : ");
        int nbre1=comp.nextInt();
        System.out.print("Entrer le deuxieme nombre : ");
        int nbre2=comp.nextInt();
        if (nbre1==nbre2) {
            System.out.println("Les deux nombres sont egaux !");
        }else if (nbre1 > nbre2) {
            System.out.println(nbre1+" est plus grand que "+nbre2+" !");
        }else{
            System.out.println(nbre2+" est plus grand que "+nbre1+ " !");
    }
 }
}