public class ReverseInt {
	public static void main(String[] args) {
		int number = 123;
		int reversedNumber = 0, sum = 0, count = 0;
		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			sum += digit;
			count++;
			number /= 10;
		}
		System.out.println("Reversed number: " + reversedNumber);
		System.out.println("Sum of digits: " + sum);
		System.out.println("Count of digits: " + count);
	}
}
