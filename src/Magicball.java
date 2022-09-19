import java.util.Random;
import java.util.Scanner;

public class Magicball {
    public static void main(String[] args) {
        System.out.println("Sisesta oma küsimus ja saa teada huvitavaid asju:");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();
        int r = rand.nextInt(5);

        if(r == 0) {
            System.out.println("ma arvan jah");
        } else if(r == 1) {
            System.out.println("See on täitsa võimalik");
        } else if(r == 2) {
            System.out.println("Ma ei usu");
        } else if(r == 3) {
            System.out.println("ma pole kindel");
        } else if(r == 4) {
            System.out.println("kõik on võimalik");
      }
    }
    }