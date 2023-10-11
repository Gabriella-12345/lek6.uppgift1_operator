 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        /*Uppgift A */
        
        System.out.println("Välkommen till systembolaget!");

        int tal1 = 18;
        System.out.print("Hur gammmal är du?" + "\n");
        int tal2 = tb.nextInt();

        System.out.println("18 år gammal:" + (tal1==tal2) + "\n");

        System.out.println("Yngre än 18 år:" + (tal1>=tal2) + "\n");

        System.out.println("Över 18 år:" + (tal1<=tal2) + "\n");

        /*Uppgift B */
        
        
        int[] fält1 = new int[3];
        
        fält1[0]=4;
        fält1[1]=5;
        fält1[2]=2;
       
        System.out.println("Är fyra mindre än 5:" + (fält1[0] <= fält1[1]));
        System.out.println("Är fyra mer än 5:" + (fält1[0] <= fält1[1]));
        System.out.println("Är fyra lika med 5:" + (fält1[0] == fält1[1]) + "\n\n");

        System.out.println("Är fyra mindre än 2:" + (fält1[0] <= fält1[2]));
        System.out.println("Är fyra mer än 2:" + (fält1[0] <= fält1[2]));
        System.out.println("Är fyra lika med 2:" + (fält1[0] == fält1[2]) + "\n\n");

        // System.out.println("Stämmer påståenden åvan?");
        // String svar;
        // svar = tb.nextLine();
        // System.out.println(svar + "Perfekt!");

        /*Uppgift C */
        System.out.println("Skriv ett positivt heltal:" );
        int x = tb.nextInt();
        x += 7;
        
        x = x*2;
       
        x -= 6;
        
        x /= 2;
        
        x += 3;
        System.out.println(x);
        x -= x;
        System.out.println("7 =" + x);

    }
}
