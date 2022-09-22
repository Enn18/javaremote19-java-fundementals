package Homeworks;

/**
 * Operator Homework
 * @author Ennuste Enn
 */
public class Operatorhomework {
    public static void main(String[] args) {
        float i = 9;
        float a = 18;

        float result = i * a + (--i + ++a) + i % a;
        /*
        1.i * a + 27 + i % a
        2.i * a + 27 + 8
        3.152 + 27 + 8
        4.197
         */
        System.out.println(result);

    }
}