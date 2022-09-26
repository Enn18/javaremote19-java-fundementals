package examples.objects;

import java.sql.SQLOutput;

/**
 * Default Constructor example
 *
 * @author Enn Ennuste
 */
public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7";   // garbage collection

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name ="Ferrari FF";

        car.name = "Toyota RAV4";                  // if u have two car.name then java will pick the latest one

        Car car4 = new Car();
        car4 = car2;

        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);



    }
}
