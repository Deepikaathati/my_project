
public class Test {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.move();
		b.stop();
		b.noOfWheels();

		Car c = new Car();
		c.start();
		c.move();
		c.stop();
		c.noOfWheels();

		Auto a = new Auto();
		a.start();
		a.move();
		a.stop();
		a.noOfWheels();

	}
}
