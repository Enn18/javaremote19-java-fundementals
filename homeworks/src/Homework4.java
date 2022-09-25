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
             sum = sum + num; // this means sum sum = 0+1, then sum= 1+7, sum = 8+3, sum= 11 +10, sum =21+9
         }
         int average = sum / Array.length;    // here the 30 is devided with how many numbers are in array.
        System.out.println("The average is  " + average);



    }
}
