public class DoctorTest {
	public static void main(String[] args) {

		Doctor d1 = new Doctor("Dr.Ramesh", "Cardiology", "Yashoda Hospital");
		d1.displayDoctorDetails();
		System.out.println("**********");
		Doctor d2 = new Doctor("Dr.Suresh", "Gastroenterologist", "KIMS Hospital");
		d2.displayDoctorDetails();

		System.out.println("**********");

		Doctor d3 = new Doctor("Dr.Suresh", "Neurologist", "Osmania General Hospital");
		d2.displayDoctorDetails();
	}
}
