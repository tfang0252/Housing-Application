
public class Student {
	private String firstName;
	private String lastName;
	private String userID;
	private String PW;
	private String gender;
	private int gradYear;
	private Date DOB;
	private String dBirth;
	private String address;
	private String dorm;
	
	public Student(String user, String pw, String fName, String lName, 
			String dob, int gradY, String gend, String dor){
		firstName = fName;
		lastName = lName;
		dBirth = dob;
		userID = user;
		PW = pw;
		gradYear = gradY;
		gender = gend;
		dorm = dor;
	}
	
	public String toString(){
		String studInfo = firstName + " " + lastName + "\n" + 
				dBirth + "\n" + gender +"\n"+ gradYear+"\n"+dorm;
		
		
		
		
		return studInfo;
	}
}


