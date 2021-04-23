import java.util.Scanner;
class Exercice5{
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int a;
        System.out.println("Entrez un Jour");
        a=clavier.nextInt();
        while(a>31 || (a==0)){
            System.out.println("Erreur");
          break;

        }
        
        
        
       
        Scanner clavier1=new Scanner(System.in);
        int mois ;

        System.out.println("Entrez un Mois");
        mois=clavier1.nextInt();
        while(mois>12 || (mois==0)){
            System.out.println("Erreur");
          break;
        }
      

       
        Scanner clavier2=new Scanner(System.in);
        int annee ;
        System.out.println("Entrez une ANNE");
        annee=clavier2.nextInt();
        while(annee<1000){
            System.out.println("Erreur");
            break;   
        }
        if  (annee % 4 == 0 && (annee% 100 != 0) ||(annee%400==0)) {
            System.out.println(+annee + "est une annee bissextile");
            if (mois==2){

                while(a>29 || (a==0)){
                    System.out.println("Erreur cette date n existe pas");
                    break;
                }
            }  
    
        } else {
            System.out.println(+a + "n\'est pas une annee bissextile");
            while(a>28 || (a==0)){
                System.out.println("Erreur cette date n existe pas"); 
                break; 
            }    
                
        }
        System.out.println( +a +"/" +mois+ "/" +annee );  

    }
}