import java.util.Arrays;
import java.util.Collections;

public class ArrayNumber {
    public static void main(String[] args) {
        // Define a numeric string array
        String[] numbers = {"10", "2", "34", "1", "23"};

        // Sort in ascending order
        Arrays.sort(numbers, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        System.out.println("Ascending Order:");
        for (String num : numbers) {
            System.out.println(num);
        }

        // Sort in descending order
        Arrays.sort(numbers, (a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        System.out.println("\nDescending Order:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}