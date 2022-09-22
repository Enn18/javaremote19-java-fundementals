package examples;

/**
 * Examples for Java operators
 *
 * @author Enn Ennuste
 */
public class Operator {

    public static void main(String[] args) {

        //UNARY operatos
        //post- increment
        int i = 0;
        System.out.println(i);
        System.out.println(i++);   //0
        i++;  // i + 1  it means 0 + 1  ( incremented value plus another increment) ++ means like plus 1
        System.out.println(i);

        //post decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        //pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);  // -- means like miinus 1 kymnest

        // brackets are the highest priority
        int x = i + (-j); // x = i - j;  2-9    pracket() is the first one  where java goes
        System.out.println(x);

        //BINARY operators (operator with 2 variables)
        //artimtic operators
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b; // * will be done first than +
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x;   // firstly is calculated (-j) bec its unary

        /*
        1. Z = i * a + (c /b) + j % x;
         */

        System.out.println(z);

        float divide = (float) 40 / 7;  // quotient(answer) value
        System.out.println(divide);

        int modulo = 40 % 7; //reminder value
        System.out.println(modulo);

        //7 * 5 = 35, 7* 6 = 42  // java will pick the least number before 40 ehk votab numbri mis koige lahemal 40le ehk 35
               // 40

        int module2 = 30 % 4;
        System.out.println(module2);

        // Comparison operators ( ==, !=, >
        boolean result = divide == modulo; // 8==5 pole samad ehk false
        System.out.println(result);

        boolean result2 = divide !=modulo;  // != thanedab kas pole erinevad. divide and modulo on samad?
        System.out.println(result2);

        boolean lesscheck = divide < modulo; // 8<5
        System.out.println(lesscheck);

        boolean greatercheck = divide > modulo; // 8>5 // 8 >= 5 //true      8>= 8 is true  ehk 8 on suurem voi võrdne 8st
        System.out.println(greatercheck);

        //less than or equals
        boolean lessEquals = divide <= modulo;
        System.out.println(lessEquals);

        boolean wrongCompare = lessEquals == lesscheck; // you can type different data types
        System.out.println(wrongCompare);

        //logical operator ( &&, ||)
        /*
        true && false = false
        false && true = false
        false  && false = false
        true  && true = false
         */
        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
         true || true = true
         false || false = false
         true || false = true
         false || true = true
         */
        boolean orCheck = (8 < 9) || (10 >4);
        System.out.println(orCheck);
        /*
        0 = 00000000;
        1 = 00000001;
        2 = 00000010;
        3 = 00000011;
        4 = 00000100;
        5 = 00000101;
        6 = 00000110;
        7 = 00000111;
        8 = 00001000;

        0 = false
        1 = true

        true ^ false = true
        false ^ true = true
        true ^ true = false
        false ^ false = false
       */
        //xand, Xor

        float expo = 12 ^ 25; // 12 = 00001100 25= 0011001
        System.out.println(expo);

        //Assigment operators
        x = x + y; // bot are same
        x += y;
        x /=y;
        x *=y;


        //TERNARY operator (?, :)    , it means you work with three veribles
        String ternary = (x > y) ? "cat" : "Dog";
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lesscheck ? 9 : 10;
        System.out.println(check2);

        //Number comparison
        boolean checkNumber = 9 == 9.0;   // int == float
        System.out.println(checkNumber);


        // mostly used operator are
        // ++, --
        // ==, !=
        // &&, ||
        // ?, :
    }
}
