import java.util.Scanner;

public class MyAtmapp {
	static double balance = 30000.0;
	static int originalpin = 6789;

	public static boolean authenticat(int pin) {
		if (pin == originalpin) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int pin=0;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("ATM APPLICATION");
			System.out.println("---------------");
			System.out.println("1.Balance check");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("0.Exit");
			System.out.println("Please select option:");
			option = in.nextInt();

			switch (option) {
			case 1:
				System.out.println("please enter pin:");
				 pin = in.nextInt();
				if (authenticat(pin)) {
					System.out.println("Balance:" + balance);
				} else {
					System.out.println("Invalid pin");
				}
				break;
			case 2:
				System.out.println("please enter deposit amount");
				 pin=in.nextInt();
	           	 if(authenticat(pin)) {

					double depositAmount = in.nextDouble();
					balance = balance + depositAmount;
					System.out.println("Deposit is successful!");
				} else {
					System.out.println("Invalid pin");

				}
				break;
			case 3:
				System.out.println(" please enter Withdraw amount:");
				pin = in.nextInt();
				if (authenticat(pin)) {
					double withdrawAmount = in.nextDouble();
					balance = balance - withdrawAmount;
					System.out.println("Withdraw is Successful!");
				} else {
					System.out.println("Invalid pin");
				}
				break;
			case 0:
				System.out.println("Thankyou for using ATM");
				System.out.println("Have a good day");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
				break;
			} // switch
		} while (option != 0);

	}// main
} // class
