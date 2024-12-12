import java.util.Scanner;

public class SSCPRogessDetailed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.println("Enter the student's name: ");
        String studentName = scanner.nextLine();

        System.out.println("Enter marks for English: ");
        int englishMarks = scanner.nextInt();

        System.out.println("Enter marks for Math: ");
        int mathMarks = scanner.nextInt();

        System.out.println("Enter marks for Science: ");
        int scienceMarks = scanner.nextInt();

        System.out.println("Enter marks for Social Studies: ");
        int socialStudiesMarks = scanner.nextInt();

        System.out.println("Enter marks for Hindi: ");
        int hindiMarks = scanner.nextInt();

       // Total and percentage calculation
        int totalMarks = englishMarks + mathMarks + scienceMarks + socialStudiesMarks + hindiMarks;
        double percentage = (double) totalMarks / 5;

        System.out.println("\n----- Student Progress Report -----");
        System.out.println("Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Pass/Fail status using if-else
        if (englishMarks < 35 || mathMarks < 35 || scienceMarks < 35 || socialStudiesMarks < 35 || hindiMarks < 35) {
            System.out.println("Status: Fail (Failed in one or more subjects)");
        } else {
            System.out.println("Status: Pass");
        }

        // Grade using if-else-if
        String grade;
        if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 55) {
            grade = "B";
        } else if (percentage >= 40) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade: " + grade);

        // Feedback using switch
        System.out.print("Feedback: ");
        switch (grade) {
            case "A+":
                System.out.println("Excellent performance! Keep it up.");
                break;
            case "A":
                System.out.println("Great job! Aim for the top.");
                break;
            case "B":
                System.out.println("Good work, but there's more for improvement.");
                break;
            case "C":
                System.out.println("Needs improvement. Focus on studies.");
                break;
            case "D":
                System.out.println("Poor performance. Work harder.");
                break;
        }

        scanner.close();
    }
}