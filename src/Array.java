/**
 * Examples of Arrays
 *
 * @author Enn Ennuste
 */
public class Array {
    public static void main(String[] args) {
        int a = 9;

        //single-dimensional array
        //note: array index always starts with 0
       //int array
        int[] b = {9, 27, 40, 20, 839, 11000};

        //string array
        String[] fruits = {"apple","orange", "mango","banana"};

        System.out.println(fruits[0]);         //apple is 0. orange is 1 .mango is 2 .and so on
        System.out.println(b[4]);
        System.out.println(fruits[3]);        //Array index out of bond

        //array index out of bond
        System.out.println(b.length);        // return the number of values in the array
        System.out.println(b.length - 1);    //returns arrays last index

        //Defined array
        int[] veggies = new int[5];       // if there is 5, you can only add 5 arrays

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[3]);             // vaata vihikusse, seal joonistatud seletus.

        String[] veggies2 = new String[5];
                veggies2[3] = "potato";
                veggies2[4] = "carrot";
        System.out.println(veggies2 [3]);


        String[] food = new String[]{"cake", "porridge", "Rice"};

        int[] ageArray = new int[3];

        //processing array
        //conventional for-loop
        for(int i=0; i < fruits.length; i++){     //i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest or maximum element in array
        //Brute-force method
        int result = b[0]; // answer is 9
        for (int x: b){
            if(x > result){
                result = x;

            }
        }
        System.out.println(result);

        //homework4
        //To find smallest in the array (b)
    }
}
