
import java.util.Scanner;

    public class EmployeeTest {

	public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
		System.out.println("please enter employee Id: ");    
		int employeeId= in.nextInt();

		System.out.println("please enter employee Name: ");
        String employeeName= in.next();

		System.out.println("please enter employee Salary: ");
        double employeeSalary= in.nextDouble();


		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);
}
	
}