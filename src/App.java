 import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        /*Uppgift A */
        
        System.out.println("Välkommen till systembolaget!" + "\n");

        int tal1 = 18;
        System.out.print("Hur gammmal är du?");
        int tal2 = tb.nextInt();

        System.out.println("Du är välkommen att fortsätta att handla:" + (tal1==tal2) + "\n");

        System.out.println("Tyvärr får du inte handla här än:" + (tal1<=tal2) + "\n");

        System.out.println("Du är välkommen att fortsätta att handla:" + (tal1>=tal2) + "\n");

        /*Uppgift B */
        
        int[] talen = {4,5,2};
        System.out.println(talen);


    }
}
