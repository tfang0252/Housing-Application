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


public class ProfileScreen extends MainScreen{
	
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


	
	public ProfileScreen(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		add(blueBackground);
	}
}
