
public class Patient{
	String name;
	String healthIssue;
    int age; 

	public Patient(String name, String healthIssue, int age) {
		System.out.println("patient list");
		this.name = name;
		this.healthIssue = healthIssue;
		this.age = age;
	}

	public void displayPatientDetails() {
		System.out.println("patient Name: " + name);
		System.out.println("HealthIssue: " + healthIssue);
		System.out.println("Age: " + age);
	}
}
