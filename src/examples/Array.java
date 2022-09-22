package examples;

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

        //Multi-dimensional array:
        int[][] array2d = new int [3][3];  // also you can leave it empty if you dont know how many number there are
        //Row-1
        array2d[0][0] = 1;           // 1   0   1
        array2d[0][1] = 0;           // 2   10   9
        array2d[0][2]= 1;            // 4   9    8

        //row-2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;

        //Row-3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int [][] array2dver2 = {{1, 0, 1}, {2, 10, 9}, {4, 9, 8}};

        for(int x = 0; x < 3; x++ ) {
            for(int y = 0; y < 3; y++) {
                System.out.print(array2d[x][y] +  " ");
            }
            System.out.println();
        }

    //3D array = 1D + 2D array
    // 1D => number of tables
    // 2d array => array with rows and columns
    int[][][] array3d = new int[3][3][3];// [ how many sets of 2d array u want] [how many rows of each 2darray] [number of columns 2d array]
    //TABLE- 1
    //Row-1
    array3d[0][0][0] = 1;
    array3d[0][0][1] = 0;
    array3d[0][0][2] = 1;


    int[][][] array3dVer2 = {
            {{1, 0, 1}, {1, 8, 0}, {2, 5, 7}},
            {{9, 8, 7}, {5, 8, 9}, {3, 5, 0}},
            {{5, 6, 2}, {4, 5, 7}, {2, 6, 8}},
            };

    for(int x = 0; x < 3; x++) {
        for(int y = 0; y < 3; y++) {
        for(int z  = 0; z < 3; z++) {
            System.out.print(array3dVer2[x][y][z]);
        }
            System.out.println();
          }
        System.out.println("\n");
    }
  }
}