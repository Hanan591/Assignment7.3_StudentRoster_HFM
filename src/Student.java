
public class Student {
   
	private double gpa;
	private String firstname;  
	private String lastname; 
	private String homeAddress;
	private String currentAddress;
	private String phoneNumber;
		
	public Student(double gpa, String firstname, String lastname, String currentAddress, String homeAddress, String phoneNumber) {
        this.gpa = gpa;
        this.currentAddress = currentAddress;
        this.firstname = firstname;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.lastname = lastname;
        
}
	 public String getFirstName() {
	        return firstname;
	    }

	    public void setFirstName(String firstName) {
	        this.firstname = firstName;
	    }

	    public String getLastName() {
	        return lastname;
	    }

	    public void setLastName(String lastName) {
	        this.lastname = lastName;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    public String getCurrentAddress() {
	        return currentAddress;
	  
	    }

	    public void setCurrentAddress(String currentAddress) {
	        this.currentAddress = currentAddress;
	    }

	    public String getHomeAddress() {
	        return homeAddress;
	    }

	    public void setHomeAddress(String homeAddress) {
	        this.homeAddress = homeAddress;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    
	    public String toString() {
	        return "Student: " + firstname + " " + lastname + ", GPA: " + gpa + 
	               ", Current Address: " + currentAddress + ", Home Address: " + homeAddress +
	               ", Phone Number: " + phoneNumber;
	    }

	
    public Student() {
    	  
	 gpa = 0.0;
	 homeAddress = "";
	 lastname = "";
	 firstname ="";
	 currentAddress = "";
	 phoneNumber = "";
		 
 }
   

}
