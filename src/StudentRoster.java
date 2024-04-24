import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentRoster {
    private Student[] roster;
    private int numstudents;
    Scanner scnr = new Scanner(System.in);

    public StudentRoster() {
        numstudents = 0;
        roster = new Student[numstudents]; 
    }

    public StudentRoster(int n) {
        numstudents = n;
        roster = new Student[numstudents];
    }

    public void addStudent(int count, Student student) {
        if (count < roster.length) {
            roster[count] = student;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Student roster is full. Cannot add more students.");
        }
    }

    public void printStudent(int c) {
        for (int i = 0; i < c; ++i) {
            System.out.println(roster[i].toString()); 
        }
    }

    public void readFromDisk() {
    	try {
            File file = new File("roster.txt");
            Scanner scanner = new Scanner(file);
            
         
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                double gpa = Double.parseDouble(parts[0]);
                String currentAddress = parts[1];
                String firstName = parts[2];
                String lastName = parts[3];
                String homeAddress = parts[4];
                String phoneNumber = parts[5];
                
                Student student = new Student(gpa, currentAddress, firstName, lastName, homeAddress, phoneNumber);
                addStudent(numstudents, student); 
                numstudents++; 
            }
            
            scanner.close();
            
            System.out.println("Roster loaded successfully from disk.");
        } catch (FileNotFoundException e) {
            System.out.println("Error reading roster from disk: File not found.");
        }
    }
    

    public void searchStudent() {
        boolean found = false;
        System.out.println("Enter the first name please");
        String searchStudent = scnr.next();
        for (int i = 0; i < numstudents; i++) {
           
            if (roster[i].getFirstName().equals(searchStudent)) {
                System.out.println("Student found: " + roster[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }


    public void saveToDisk() {
    	 try {
    	        File file = new File("roster.txt");
    	        FileWriter writer = new FileWriter(file);

    	        int length = Math.min(numstudents, roster.length);
    	        for (int i = 0; i < length; i++) {
    	            Student student = roster[i];
    	            if (student != null) { 
    	                String line = student.getGpa() + ", " +
    	                              student.getCurrentAddress() + ", " +
    	                              student.getFirstName() + ", " +
    	                              student.getLastName() + ", " +
    	                              student.getHomeAddress() + ", " +
    	                              student.getPhoneNumber() + "\n"; 

    	                writer.write(line);
    	            }
    	        }

    	        writer.close();
    	        System.out.println("Roster saved successfully to disk.");
    	    } catch (IOException e) {
    	        System.out.println("Error saving roster to disk: " + e.getMessage());
    	    }
    	}
}

	   

	


