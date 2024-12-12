 //represent a group fixed size of similar data elements
public class Arraysdemo {

	public static void main(String[] args) {
		String[] employees = new String[] {"Wills", "Smith", "Jones", "Alex", "Anna"};

		System.out.println("Array traversal using for loop");
		for(int i=0; i<employees.length; i++) {
		System.out.println(employees[i]);
		}

		System.out.println("Array traversal using for each loop");
		for(String employee : employees) {
		System.out.println(employee);
		}

		int[] subjectMarks = {55, 44, 99, 77, 88, 66};
		int totalMarks = 0;
		for(int marks : subjectMarks) {
		totalMarks += marks;
		}


		System.out.println("Total subject marks = "+totalMarks);
		System.out.println("Average subject marks = "+(totalMarks/subjectMarks.length));

		// min element in an array
		int min = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(min > marks) {
		min = marks;
		}
		}
		System.out.println("Minimum marks : "+min);

		// max element in an array
		int max = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(max < marks) {
		max = marks;
		}
		}
		System.out.println("Maximum marks = "+max);

		// searching an element
		int search = 50;
		for(int i=0; i<subjectMarks.length; i++) {
		if(subjectMarks[i] == search) {
		System.out.println("Element found at "+i);
		System.exit(0);
		}
		}
		System.out.println("Element not found");
	}
	
	Object[] objArray = {10, "jones", 45000.0, true};
	int element1 = (int) objArray[0];
	String element2 = (String) objArray[1];
	double element3 = (double) objArray[2];
	System.out.println(element1);
	System.out.println(element2);
	System.out.println(element3);
}
