import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AppWindowPanel extends JPanel{
	protected HashMap <String,String> userList=new HashMap<String,String>();
	protected HashMap <String, Student> studentData =new HashMap<String, Student>();
	protected Scanner input;
	protected Student currentStudent;
	protected static String currentID;
	public AppWindowPanel(){
		setLayout(null);
		setPreferredSize(new Dimension(1000, 665));
		setVisible(true);	
	}
}
