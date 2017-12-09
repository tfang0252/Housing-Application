import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AccountScreen extends MainScreen{
	
	private JTextField userID;
	private JPasswordField PW;
	private JTextField fNameField;
	private JTextField rNameField;
	private JTextField gradYear;
	private JTextField DOB;
	private JCheckBox male;
	private JCheckBox female;
	private JComboBox<String> race;
	private JComboBox<String> dorm;
	private JButton confirm;
	
	private JLabel userIDLabel;
	private JLabel PWLabel;
	private JLabel fNameFieldLabel;
	private JLabel rNameFieldLabel;
	private JLabel gradYearLabel;
	private JLabel DOBLabel;
	private JLabel genderLabel;
	private JLabel raceLabel;
	private JLabel dormLabel;
	private JLabel profile;


	
	public AccountScreen(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		profile = new JLabel("Account Page");
		profile.setFont(new Font("Arial", Font.BOLD, 35));
		profile.setForeground(Color.WHITE);
		profile.setBounds(500, 105, 320, 35);
		
		
		userIDLabel = new JLabel("User ID:________________________________");
		userIDLabel.setFont(new Font("Arial", 15, 20));
		userIDLabel.setForeground(Color.WHITE);
		userIDLabel.setBounds(300, 185, 320, 35);
		
		userID = new JTextField(currentID);
		userID.setBounds(600, 190, 320, 25);
		
		
		PWLabel = new JLabel("Password:___________________________________");
		PWLabel.setFont(new Font("Arial", 15, 20));
		PWLabel.setForeground(Color.WHITE);
		PWLabel.setBounds(300, 225, 320, 35);
		
		PW = new JPasswordField();
		PW.setBounds(600, 230, 320, 25);
		
		
		fNameFieldLabel = new JLabel("First Name:_____________________________________");
		fNameFieldLabel.setFont(new Font("Arial", 15, 20));
		fNameFieldLabel.setForeground(Color.WHITE);
		fNameFieldLabel.setBounds(300, 265, 320, 35);
		
		fNameField = new JTextField();	
		fNameField.setBounds(600, 270, 320, 25);
		
		
		rNameFieldLabel = new JLabel("Last Name:___________________________________________");
		rNameFieldLabel.setFont(new Font("Arial", 15, 20));
		rNameFieldLabel.setForeground(Color.WHITE);
		rNameFieldLabel.setBounds(300, 305, 320, 35);
		
		rNameField = new JTextField();
		rNameField.setBounds(600, 310, 320, 25);
		
		
		DOBLabel = new JLabel("Date of Birth:__________________________________________");
		DOBLabel.setFont(new Font("Arial", 15, 20));
		DOBLabel.setForeground(Color.WHITE);
		DOBLabel.setBounds(300, 345, 320, 35);
		
		DOB = new JTextField();
		DOB.setBounds(600, 350, 320, 25);
		
		
		gradYearLabel = new JLabel("Graduation Year:_____________________________________");
		gradYearLabel.setFont(new Font("Arial", 15, 20));
		gradYearLabel.setForeground(Color.WHITE);
		gradYearLabel.setBounds(300, 385, 320, 35);
		
		gradYear = new JTextField();
		gradYear.setBounds(600, 390, 320, 25);
		
		
		male = new JCheckBox("Male");
		male.setBounds(600, 430, 100, 25);
		
		genderLabel = new JLabel("Gender:_______________________________________");
		genderLabel.setFont(new Font("Arial", 15, 20));
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setBounds(300, 425, 320, 35);
				
		female = new JCheckBox("Female");
		female.setBounds(730, 430, 100, 25);
		
		
		dormLabel = new JLabel("Dorm:________________________________");
		dormLabel.setFont(new Font("Arial", 15, 20));
		dormLabel.setForeground(Color.WHITE);
		dormLabel.setBounds(300, 465, 320, 35);
		
		dorm = new JComboBox<String>();
		dorm.setBounds(600, 470, 100, 25);
		dorm.addItem("North Lake Village");
		dorm.addItem("South Lake Village");
		dorm.addItem("West Lake Village");
		
		confirm = new JButton("Update");
		confirm.setBounds(560, 610, 100, 25);		
		
		
		
		
		add(profile);
		add(userID);
		add(userIDLabel);
		add(PW);
		add(PWLabel);
		add(fNameField);
		add(fNameFieldLabel);
		add(rNameField);
		add(rNameFieldLabel);
		add(DOB);
		add(DOBLabel);
		add(gradYear);
		add(gradYearLabel);
		add(male);
		add(female);
		add(genderLabel);
		add(dorm);
		add(dormLabel);
		add(confirm);
		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		this.add(blueBackground);
		
		readFile();
		Set set = studentData.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			if(currentID.equals(entry.getKey())){
				Student tempStud = (Student) entry.getValue();
				fNameField.setText(tempStud.getFirstName());
				rNameField.setText(tempStud.getLastName());
				PW.setText(tempStud.getPW());
				DOB.setText(tempStud.getDOB());
				gradYear.setText(String.valueOf(tempStud.getGradYear()));
				String gender = tempStud.getGender();
				if(gender.equals("Male")){
					male.setSelected(true);
				}
				else{
					female.setSelected(true);
				}
				dorm.setSelectedItem(tempStud.getDorm());
			}
			
		}
		
		revalidate();
	}

	public void readFile(){
		String line = "";
		StringTokenizer uData;
		
		try{
			input=new Scanner(new File("StudentData.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening file..");
			System.exit(1);
		}
		try{
			while((line=input.nextLine())!=null){			
				uData= new StringTokenizer(line, ":");
				String tempUser = uData.nextToken();
				String tempPW = uData.nextToken();
				String tempFName = uData.nextToken();
				String tempLName = uData.nextToken();
				String tempDOB = uData.nextToken();
				int tempGradYear = Integer.valueOf(uData.nextToken());
				String tempGender = uData.nextToken();
				String tempDorm = uData.nextToken();
				Student tempStud = new Student(tempUser,tempPW,tempFName,tempLName,
						tempDOB,tempGradYear,tempGender,tempDorm);
				studentData.put(tempUser, tempStud);					
			}			
		}
		catch(NoSuchElementException e){		
		}
	}
}