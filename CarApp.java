import java.util.*;
import java.util.stream.*;

class Car {
    private int id;
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
        		+ "id=" + id + ","
        		+ " brand='" + brand + "', "
        		+ "model='" + model + "',"
   				+ " year=" + year + ""
   						+ "}";
    }
}

public class CarApp {

    private static List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addCar();
                    break;
                case 2:
                    displayAllCars();
                    break;
                case 3:
                    updateCarDetails();
                    break;
                case 4:
                    deleteCar();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nCar Management System");
        System.out.println("1. Add a new car");
        System.out.println("2. Display all cars");
        System.out.println("3. Update car details");
        System.out.println("4. Delete a car");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addCar() {
        System.out.print("Enter car ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        
        Car newCar = new Car(id, brand, model, year);
        carList.add(newCar);
        System.out.println("Car added successfully.");
    }

    private static void displayAllCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars to display.");
        } else {
            System.out.println("\nAll Cars:");
            carList.forEach(car -> System.out.println(car));
        }
    }

    private static void updateCarDetails() {
        System.out.print("Enter the car ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Optional<Car> carOpt = carList.stream()
                                      .filter(car -> car.getId() == id)
                                      .findFirst();

        if (carOpt.isPresent()) {
            Car carToUpdate = carOpt.get();
            System.out.println("Current details: " + carToUpdate);

            System.out.print("Enter new car brand (leave blank to keep current): ");
            String brand = scanner.nextLine();
            if (!brand.isEmpty()) carToUpdate.setBrand(brand);

            System.out.print("Enter new car model (leave blank to keep current): ");
            String model = scanner.nextLine();
            if (!model.isEmpty()) carToUpdate.setModel(model);

            System.out.print("Enter new car year (enter 0 to keep current): ");
            int year = scanner.nextInt();
            if (year != 0) carToUpdate.setYear(year);

            System.out.println("Car details updated.");
        } else {
            System.out.println("Car with ID " + id + " not found.");
        }
    }

    private static void deleteCar() {
        System.out.print("Enter the car ID to delete: ");
        int id = scanner.nextInt();

        boolean removed = carList.removeIf(car -> car.getId() == id);

        if (removed) {
            System.out.println("Car deleted successfully.");
        } else {
            System.out.println("Car with ID " + id + " not found.");
        }
    }
}
  

