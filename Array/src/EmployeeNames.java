public class EmployeeNames {
    public static void main(String[] args) {
        String[] employeeNames = {"Wills", "Smith", "Jones", "Alex", "Anna"};

        // Using for loop
        System.out.println("Employee Names (Using for loop):");
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println(employeeNames[i]);
        }

        // Using forEach loop
        System.out.println("Employee Names (Using forEach loop):");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
