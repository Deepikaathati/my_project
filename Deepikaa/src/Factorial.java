 import java.util.Scanner;
 
public class Factorial {

	public static void main(String[] args) {
	 int number;
	 System.out.println("enter the number :");
	 Scanner sc = new Scanner(System.in);
	 number = sc.nextInt();
	int answer = Factorial(number);
	System.out.println("factorial of "  + number +  " is " + answer);
}
	 static int Factorial(int n) {
		if(n == 1)
			return 1;
		
		return n * Factorial(n-1);
	}

}
