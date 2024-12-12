
public class VehicleTest {

	public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle auto = new Auto();

        System.out.println("\nBike Operations:");
        bike.start();
        bike.move();
        bike.stop();

        System.out.println("\nCar Operations:");
        car.start();
        car.move();
        car.stop();

        System.out.println("\nAuto Operations:");
        auto.start();
        auto.move();
        auto.stop();
    }
}
