import java.util.Scanner;

public class application {

	int num = 5;
   static StudentRoster roster = new StudentRoster(5);
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		 
	     
	        displayMenu(scnr);
	        
	      
	        
	        
	    }
	public static void addstudents (int count,Student s) {
		     ++count; 
	        roster.addStudent(count, s);
	        
	      
	        roster.printStudent(count);
	        
	        
	}
	
	  public static void displayMenu(Scanner scnr) {
	    	 System.out.println("Menu:");
	         System.out.println("1. Enter student information for new students");
	         System.out.println("2. Print the student roster");
	         System.out.println("3. Enter a student name and search for and print information for a particular student");
	         System.out.println("4. Save the student roster to disk");
	         System.out.println("5. Read the student roster from disk");
	         System.out.println("6. Exit the program");

	         System.out.print("Enter your choice: ");
	         int count = 0;
	         double gpa;
	         String firstname;
	         String lastname;
	         String currentAddress;
	         String homeAddress;
	         String phoneNumber;
			int choice = scnr.nextInt();
	         
			while (choice !=6) {
	         switch (choice) {
             case 1:
            	 System.out.println("enter the gpa");
            	 gpa = scnr.nextDouble();
            	 System.out.println("Enter the firstname");
            	 firstname = scnr.next();
            	 System.out.println("Enter the lastname");
            	 lastname = scnr.next();
            	 System.out.println("Enter the currentAddress");
            	 currentAddress = scnr.next();
            	 System.out.println("Enter the homeAddress");
            	 homeAddress = scnr.next();
            	 System.out.println("Enter the phoneNumber");
                 phoneNumber = scnr.next();
                 Student st = new Student(gpa,firstname,lastname,currentAddress,homeAddress,phoneNumber);
                 roster.addStudent(count, st);
                 ++count;
                 break;
             case 2:
                 System.out.println("Fetching the roster");
                 roster.printStudent(count);
                 break;
             case 3:
            	 
                 roster.searchStudent();
        
                 break;
             case 4:
                 
                 roster.saveToDisk();
                 break;
             case 5:
                
                 roster.readFromDisk();
                 break;
             default:
                 System.out.println("Invalid choice. Please enter a number between 0 and 4.");
                 
	         }
	         
	         System.out.println("Menu:");
	         System.out.println("1. Enter student information for new students");
	         System.out.println("2. Print the student roster");
	         System.out.println("3. Enter a student name and search for and print information for a particular student");
	         System.out.println("4. Save the student roster to disk");
	         System.out.println("5. Read the student roster from disk");
	         System.out.println("6. Exit the program");

	         System.out.print("Enter your choice: ");
	         
	          choice = scnr.nextInt(); 
         }
			
			System.out.println("exited the program");
     }
	  
	    }
	  

