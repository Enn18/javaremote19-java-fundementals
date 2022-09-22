package exercises;

import java.util.Random;

public class SimpleJavaProgrma {

    public static void main(String[] args) {

        Random coolNumber = new Random();
        int x = coolNumber.nextInt(6) + 1;

        System.out.println("You rolled a: " + x);

    }
}
