import java.util.Scanner;

public class CarDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Convert speed from km/h to m/s
        double u = 36 * 1000.0 / 3600.0; // Initial speed in m/s
        double a = 5.0;  // Acceleration in m/s^2
        
        // Read time inputs for two cases
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter time in seconds: ");  // Prompt for user input
            int t = scanner.nextInt();  // Read time in seconds
            
            // Calculate the distance using the formula: distance = ut + (1/2)at^2
            double distance = u * t + (a * t * t) / 2;
            System.out.println("Distance traveled: " + (int) distance + " meters");  // Print the distance as an integer
        }

        scanner.close();  // Close the scanner
    }
}