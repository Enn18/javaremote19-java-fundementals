/**
 * Write a java program to print all odd numbers from an array
 *
 * @author Enn Ennuste
 */

public class Homework5 {

    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9,};

        //Extrating even number

        System.out.println("Odd numbers in array are   ");
        for (int i = 0; i < array.length; i++)   //this tells java how many times run the loop (4 times)
        {
            if (array[i] % 2 != 0)     //!= means not equal to 0
                System.out.println(array[i]);
        }
        System.out.println("Even numbers in array are   ");
        for (int i = 0; i < array.length; i++)   //this tells java how many times run the loop (4 times)
        {
            if (array[i] % 2 == 0)     //== means reminder is 0
                System.out.println(array[i]);
        }
    }
}
