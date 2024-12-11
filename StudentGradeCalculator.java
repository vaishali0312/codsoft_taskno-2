import java.util.Scanner;

 class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        int numberOfSubjects = 5; // You can change this value based on the number of subjects
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        double averagePercentage = 0.0;
        String grade = "";

        // Taking input for marks in each subject
        System.out.println("Enter the marks obtained (out of 100) in each subject:");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Adding the marks to total marks
        }

        // Calculating average percentage
        averagePercentage = (double) totalMarks / numberOfSubjects;

        // Assigning grade based on average percentage
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C+";
        } else if (averagePercentage >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Displaying the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks + " / " + (100 * numberOfSubjects));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
