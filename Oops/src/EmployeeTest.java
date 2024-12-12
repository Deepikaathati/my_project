public class EmployeeTest {
	public static void main(String[] args) {
		//  Object Creation or Instantiation
		Employee e1 = new Employee(1001, "Wills", 45000.0);
		
		// Accessing Static properties
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		System.out.println(e1.employeeSalary);
		
		// Accessing Static properties
		System.out.println(e1. employeeOrganization);
		
		//Using Class Name is Recommended
		System.out.println(Employee.employeeOrganization);
		
		//Accessing Instance method
		e1.displayDetails();
		
		Employee e2= new Employee(1002, "krish", 55000.0);
		System.out.println(e1.hashCode());
		System.out.println(Integer.toHexString(e1.hashCode()));
		System.out.println(e1.hashCode());
		System.out.println(Integer.toHexString(e2.hashCode()));
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e2);
		System.out.println(e2.toString());
	}
	
}
