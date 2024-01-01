import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {


		public static void main(String[] args) {
			  ArrayList<StudentGrade> gradeList = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nGrade Management System");
		            System.out.println("1. Add Grade");
		            System.out.println("2. Delete Grade");
		            System.out.println("3. Update Grade");
		            System.out.println("4. View Grades");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter student name: ");
		                    String name = scanner.nextLine();
		                    System.out.print("Enter grade: ");
		                    double grade = scanner.nextDouble();
		                    gradeList.add(new StudentGrade(name, grade));
		                    System.out.println("Grade added successfully!");
		                    break;

		                case 2:
		                    System.out.print("Enter index to delete: ");
		                    int index = scanner.nextInt();
		                    if (index >= 0 && index < gradeList.size()) {
		                        gradeList.remove(index);
		                        System.out.println("Grade deleted successfully!");
		                    } else {
		                        System.out.println("Invalid index!");
		                    }
		                    break;

		                case 3:
		                    System.out.print("Enter index to update: ");
		                    int updateIndex = scanner.nextInt();
		                    scanner.nextLine(); // Consume newline character
		                    if (updateIndex >= 0 && updateIndex < gradeList.size()) {
		                        System.out.print("Enter new grade: ");
		                        double newGrade = scanner.nextDouble();
		                        gradeList.get(updateIndex).setGrade(newGrade);
		                        System.out.println("Grade updated successfully!");
		                    } else {
		                        System.out.println("Invalid index!");
		                    }
		                    break;

		                case 4:
		                    if (gradeList.isEmpty()) {
		                        System.out.println("No grades available!");
		                    } else {
		                        System.out.println("List of Grades:");
		                        for (int i = 0; i < gradeList.size(); i++) {
		                            System.out.println(i + ". " + gradeList.get(i).getStudentName() +
		                                    ": " + gradeList.get(i).getGrade());
		                        }
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exiting Grade Management System. Goodbye!");
		                    scanner.close();
		                    System.exit(0);
		                    break;

		                default:
		                    System.out.println("Invalid choice! Please enter a valid option.");
		                    break;
		            }
		        }
		    
	


	}

}
