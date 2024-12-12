

	public class Bike implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bike is started.");
        }

        @Override
        public void move() {
            System.out.println("Bike is moving.");
        }

        @Override
        public void stop() {
            System.out.println("Bike is stopped.");
        }
    }


