/**
 * Homework 4 . Calculatin average value of array elements
 *
 * @author Enn Ennuste
 */

public class Homework4 {
    public static void main(String[] args) {

        int[] Array = {1, 7, 3, 10, 9};
         int sum = 0;

         for (int num: Array){
             sum = sum + num;
         }
         int average = sum / Array.length;
        System.out.println("The average is" + average);



    }
}
