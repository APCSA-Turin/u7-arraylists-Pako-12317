package U7T2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        // Create an empty ArrayList to hold Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add int values using autoboxing
        numbers.add(10); // Autoboxing from int to Integer
        numbers.add(5);
        numbers.add(24);
        
        // Print the ArrayList
        System.out.println(numbers);
    }
}
