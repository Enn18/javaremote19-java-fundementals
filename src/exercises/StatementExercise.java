package exercises;

public class StatementExercise {
    public static void main(String[] args) {

        // if
        //Write A java program to find if the person is adult. (minimum adult age is 18)


        int myAge = 21;

        if (myAge >= 18) {
            System.out.println("The person is an adult");
        } else {
            System.out.println("The person is not an adult");
        }

        //if-else
        //Write a Java program to print if the given is odd or even
        int number = 2020;

        if (number % 2 == 0) {
            System.out.println("This is a even number");
        } else {
            System.out.println("This is a odd number");
        }


        // if, else-if, else
        // Write a Java program to print if the string is empty, if the length is greater than 20 and if the string is null
        String test = "";

        if (test == "") {
            System.out.println("The given string is empty");
        } else if (test.length() > 20) {
            System.out.println("The given String is so long");
        } else if(test.length() < 20) {
            System.out.println("The given string is too short");
        } else if (test == null) {
            System.out.println("The string cannot be null");
        }

        //Switch
        // Write a Java program to match the given alphabet
        char test2 = 'K';

        switch (test2) {
            case'A':
                System.out.println("The given alphabet is A");
                break;
            case'B' :
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");
        }

        //Write a Java program to print all the odd numbers from 1 to while while or for loop( if inside for
         // for example
        int l = 1;

        for(; l <= 50; l++) {
            if (l % 2 !=0  ) {
                System.out.println(l + " is an odd number");
            }
        }

    }



}
