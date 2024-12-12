
public class Doctor {
	String name;
	String specialization;
	String hospital;

	static String City = "Hyderabad";

	public Doctor(String name, String specialization, String hospital) {
		System.out.println("Hyderabad Doctors list");
		this.name = name;
		this.specialization = specialization;
		this.hospital = hospital;
	}

	public void displayDoctorDetails() {
		System.out.println("Doctor's Name: " + name);
		System.out.println("Specialization: " + specialization);
		System.out.println("Hospital: " + hospital);
	}
}
