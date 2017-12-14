
public class Student {
	private String firstName;
	private String lastName;
	private String userID;
	private String PW;
	private String gender;
	private String gradYear;
	private Date DOB;
	private String dBirth;
	private String address;
	private String dorm;
	private String imageURL;
	
	public Student(String user, String pw, String fName, String lName, 
			String dob, String gradY, String gend, String dor, String url){
		firstName = fName;
		lastName = lName;
		dBirth = dob;
		userID = user;
		PW = pw;
		gradYear = gradY;
		gender = gend;
		dorm = dor;
		imageURL = url;
	}
	public String getPW(){
		return PW;
	}
	public  String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getGender(){
		return gender;
	}
	public String getGradYear(){
		return gradYear;
	}
	public String getDOB(){
		return dBirth;
	}
	public String getDorm(){
		return dorm;
	}
	public String getURL() {
		return imageURL;
	}
	public String toString(){
		String studInfo = firstName + " " + lastName + "\n" + 
				dBirth + "\n" + gender +"\n"+ gradYear+"\n"+dorm + "\n" + imageURL;	
		return studInfo;
	}
}


