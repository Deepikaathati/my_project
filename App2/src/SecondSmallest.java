public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {23, 45, 32, 22, 20, 96};  // Sample input array

        // Ensure the array has at least two elements
       /* if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }*/

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the array to find the second smallest
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Output the result
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
