

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.Date;


public class ProfileScreen extends MainScreen{
	
	Date now = new Date();
	private int year = now.getYear();
	
	private JTextField userID;
	private JPasswordField PW;
	private JTextField fNameField;
	private JTextField rNameField;
	private JTextField gradYear;
	private JLabel DOB;
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
	private JLabel profileBorder;
	private JLabel profileP;
	private JLabel ageLabel;
	private JLabel  profilePicBorder;
	private String imageURL;

	
	public ProfileScreen(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		
		readFile();
		Set set = studentData.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			if(currentID.equals(entry.getKey())){
				Student tempStud = (Student) entry.getValue();
				fNameFieldLabel = new JLabel(tempStud.getFirstName());
				rNameFieldLabel = new JLabel(tempStud.getLastName());
				//PW.setText(tempStud.getPW());
				DOB = new JLabel("Date of Birth: "+tempStud.getDOB());
				String age = tempStud.getDOB().substring(tempStud.getDOB().length()-4);
				System.out.print(age);
				int ageInt = 2017 - Integer.parseInt(age);
				System.out.print("ageInt:" + ageInt);
				ageLabel= new JLabel("Age: " + Integer.toString(ageInt));
				gradYearLabel = new JLabel("Graduation Year: " + tempStud.getGradYear());
				genderLabel = new JLabel("Gender: " + tempStud.getGender());
				dormLabel = new JLabel("Dorm: " + tempStud.getDorm());
				imageURL = tempStud.getURL();
			}
			
		}
		
		revalidate();
		
		fNameFieldLabel.setBounds(480,100,200,30);
		fNameFieldLabel.setFont(new Font("Segoe UI", Font.BOLD, 23));
		add(fNameFieldLabel);
		
		rNameFieldLabel.setBounds(480,130,200,30);
		rNameFieldLabel.setFont(new Font("Segoe UI", Font.BOLD, 23));
		add(rNameFieldLabel);
		
		
		profileP = new JLabel("");
		profileP.setBounds(295,90,150, 150);
		
		
		
		
		 try {
             String path = imageURL;
             System.out.println("Get Image from " + path);
             URL url = new URL(path);
             BufferedImage image = ImageIO.read(url);
             System.out.println("Load image into frame...");
             profileP.setIcon(new ImageIcon(image));
             revalidate();
             
         } catch (Exception exp) {
             exp.printStackTrace();
         }
		 add(profileP);
		 
		 
		 profilePicBorder = new JLabel("");
		 profilePicBorder.setIcon(new ImageIcon("Images/profilePicBorder.png"));
		 profilePicBorder.setBounds(292,88,155,155);
		 add(profilePicBorder);
		 
		dormLabel.setBounds(295,555,250,40);
		dormLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(dormLabel);
		
		
		ageLabel.setBounds(295,400,250,40);
		ageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(ageLabel);
		
		DOB.setBounds(295,260,250,40);
		DOB.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(DOB);
		
		genderLabel.setBounds(295,335,250,40);
		genderLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(genderLabel);
		
		gradYearLabel.setBounds(295,480,250,40);
		gradYearLabel.setFont(new Font("Segoe UI",Font.PLAIN, 20));
		add(gradYearLabel);
		
		profileBorder = new JLabel("");
		profileBorder.setBounds(270, 70, 715, 580);
		profileBorder.setIcon(new ImageIcon("Images/profileBorder.png"));
		add(profileBorder);
		
	
		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
		add(blueBackground);
	}



	private void readFile() {
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
				uData= new StringTokenizer(line, ";");
				String tempUser = uData.nextToken();
				String tempPW = uData.nextToken();
				String tempFName = uData.nextToken();
				String tempLName = uData.nextToken();
				String tempDOB = uData.nextToken();
				String tempGradYear = uData.nextToken();
				String tempGender = uData.nextToken();
				String tempDorm = uData.nextToken();
				String temptURL = uData.nextToken();
				Student tempStud = new Student(tempUser,tempPW,tempFName,tempLName,
						tempDOB,tempGradYear,tempGender,tempDorm,temptURL);
				studentData.put(tempUser, tempStud);					
			}			
		}
		catch(NoSuchElementException e){		
		}
		
	}
	
	
}
