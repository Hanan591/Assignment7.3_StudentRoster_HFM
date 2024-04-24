import java.util.Scanner;

public class menu {
    private Scanner scanner;

    public menu() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
    	 System.out.println("Menu:");
         System.out.println("1. Enter student information for new students");
         System.out.println("2. Print the student roster");
         System.out.println("3. Enter a student name and search for and print information for a particular student");
         System.out.println("4. Save the student roster to disk");
         System.out.println("5. Read the student roster from disk");
         System.out.println("6. Exit the program");

         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
    }
   
}