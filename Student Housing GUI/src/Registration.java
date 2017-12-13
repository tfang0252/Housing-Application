import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
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


public class Registration extends MainScreen{
	
	private String gend;
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
	private JLabel registration;


	
	public Registration(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		registration = new JLabel("Registration Page");
		registration.setFont(new Font("Arial", Font.BOLD, 35));
		registration.setForeground(Color.WHITE);
		registration.setBounds(450, 105, 320, 35);
		
		
		userIDLabel = new JLabel("User ID:");
		userIDLabel.setFont(new Font("Arial", 15, 20));
		userIDLabel.setForeground(Color.BLACK);
		userIDLabel.setBounds(350, 185, 320, 35);
		
		userID = new JTextField();
		userID.setBounds(430, 190, 320, 25);
		
		
		PWLabel = new JLabel("Password:");
		PWLabel.setFont(new Font("Arial", 15, 20));
		PWLabel.setForeground(Color.BLACK);
		PWLabel.setBounds(350, 225, 320, 35);
		
		PW = new JPasswordField();
		PW.setBounds(450, 230, 320, 25);
		
		
		fNameFieldLabel = new JLabel("First Name:");
		fNameFieldLabel.setFont(new Font("Arial", 15, 20));
		fNameFieldLabel.setForeground(Color.BLACK);
		fNameFieldLabel.setBounds(350, 265, 320, 35);
		
		fNameField = new JTextField();	
		fNameField.setBounds(460, 270, 320, 25);
		
		
		rNameFieldLabel = new JLabel("Last Name:");
		rNameFieldLabel.setFont(new Font("Arial", 15, 20));
		rNameFieldLabel.setForeground(Color.BLACK);
		rNameFieldLabel.setBounds(350, 305, 320, 35);
		
		rNameField = new JTextField();
		rNameField.setBounds(460, 310, 320, 25);
		
		
		DOBLabel = new JLabel("Date of Birth:");
		DOBLabel.setFont(new Font("Arial", 15, 20));
		DOBLabel.setForeground(Color.BLACK);
		DOBLabel.setBounds(350, 345, 320, 35);
		
		DOB = new JTextField();
		DOB.setBounds(475, 350, 320, 25);
		
		
		gradYearLabel = new JLabel("Graduation Year:");
		gradYearLabel.setFont(new Font("Arial", 15, 20));
		gradYearLabel.setForeground(Color.BLACK);
		gradYearLabel.setBounds(350, 385, 320, 35);
		
		gradYear = new JTextField();
		gradYear.setBounds(520, 390, 320, 25);
		
		
		male = new JCheckBox("Male");
		male.setBounds(430, 430, 100, 25);
		
		genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Arial", 15, 20));
		genderLabel.setForeground(Color.BLACK);
		genderLabel.setBounds(350, 425, 320, 35);
				
		female = new JCheckBox("Female");
		female.setBounds(550, 430, 100, 25);
		
		
		dormLabel = new JLabel("Dorm:");
		dormLabel.setFont(new Font("Arial", 15, 20));
		dormLabel.setForeground(Color.BLACK);
		dormLabel.setBounds(350, 465, 320, 35);
		
		dorm = new JComboBox<String>();
		dorm.setBounds(415, 470, 140, 25);
		dorm.addItem("North Lake Village");
		dorm.addItem("South Lake Village");
		dorm.addItem("West Lake Village");
		
		confirm = new JButton("Register");
		confirm.setBounds(350, 525, 100, 25);
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(userID.getText().equals("")){
					JOptionPane.showMessageDialog(window, "User ID field cannot be blank.");
				}
				if(PW.getText().equals("")){
					JOptionPane.showMessageDialog(window, "Password field cannot be blank.");
				}
				else{
					currentID = userID.getText();
					buildUserFile();
					if(male.isSelected()){
						gend = "Male";
					}
					if(female.isSelected()){
						gend = "Female";
					}
					currentStudent = new Student(userID.getText(), PW.getText(),
							fNameField.getText(), rNameField.getText(), DOB.getText(),
							gradYear.getText(), gend, dorm.getSelectedItem().toString());
					createStudentFile(currentStudent);
					JOptionPane.showMessageDialog(window, "Registration Complete!");
					window.getContentPane().removeAll();
					window.getContentPane().add(new ProfileScreen(window));
					window.pack();
					window.getContentPane().setVisible(true);
					
				}
			}
		});
				
		add(registration);
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
		blueBackground.setIcon(new ImageIcon("Images/BlueBG2.png"));
		this.add(blueBackground);
	}
	
	public void buildUserFile(){
		BufferedWriter writer;
		try{
			FileWriter fw = new FileWriter("UserLogins.txt", true);
			writer = new BufferedWriter(fw);
			PrintWriter output = new PrintWriter(writer);
			if(!userID.getText().equals("") && !PW.getText().equals("")){
				output.print(userID.getText()+":"+PW.getText());
				output.println();
			}
			
			writer.close();
		}
		catch(IOException e){
			System.out.println("No file found");
		}	
	}
	
	public void createStudentFile(Student stud){
		BufferedWriter writer;
		try{
			FileWriter fw = new FileWriter("StudentData.txt", true);
			writer = new BufferedWriter(fw);
			PrintWriter output = new PrintWriter(writer);
			output.print(userID.getText()+":"+PW.getText()+":"+
					fNameField.getText()+":"+ rNameField.getText() +":"+ DOB.getText()+":"+ 
					Integer.valueOf(gradYear.getText())+":"+gend+":"+
					dorm.getSelectedItem().toString());
			output.println();			
			writer.close();
		}
		catch(IOException e){
			System.out.println("No file found");
		}
	}
}
