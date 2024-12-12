package exception;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		{
			System.out.println("Welcome");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				System.out.println("Exception Happened");
			}
			System.out.println("Java");

		}

	}

}
