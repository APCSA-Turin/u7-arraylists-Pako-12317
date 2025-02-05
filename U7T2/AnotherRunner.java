package U7T2;

import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known values
    Car[] carsArray = {new Car("Mustang", 12500), new Car("Camry", 8400), new Car("Ram", 17200), new Car("Accent", 1980), new Car("Cruiser", 10500)};

    // use the Arrays.asList utility method to convert the array to a list "inline"
    ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
    System.out.println(carList);
    }
}
