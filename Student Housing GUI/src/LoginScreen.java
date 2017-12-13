import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
 



/**Class extends AppWindow with preset frame
 * size and layout, and can be modified to add to add
 * the login screen 
*/
public class LoginScreen extends AppWindowPanel{
	private JTextField SID;
	private JPasswordField PW;
//user data found 
	private boolean userFound;
	private boolean pwFound;
	
//admin data found
	private boolean adminFound; 
	private boolean pwAdminFound;
	
	public LoginScreen(JFrame window) {
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon("Images/Return.png"));
		back.setBounds(2, -20, 100, 100);
		back.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX()>2&&e.getX()<51) && (e.getY()>27 && e.getY()<70)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new StudentHousing(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		back.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				if((e.getX()>2&&e.getX()<51) && (e.getY()>27 && e.getY()<70)){
					back.setIcon(new ImageIcon("Images/ReturnB.png"));
					revalidate();
				}
				else{
					back.setIcon(new ImageIcon("Images/Return.png"));
					revalidate();
				}
			}
		});
		this.add(back);
		
		SID = new JTextField();

		SID.setBounds(620, 380, 290, 30);

		SID.setBounds(630, 355, 290, 30);

		SID.setBounds(595, 380, 290, 30);

		SID.setBounds(620, 380, 317, 30);

		
		/*
		 * jumps to password when enter is pressed
		 */
		SID.addKeyListener(new KeyListener(){
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
			        PW.requestFocusInWindow();

			       
			    }

				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
		this.add(SID);
		
		PW = new JPasswordField();

		PW.setBounds(620, 470, 290, 30);

		PW.setBounds(630, 427, 290, 30);

		PW.setBounds(595, 470, 290, 30);

		PW.setBounds(620, 470, 317, 30);

		
		/*
		 * attempts to login when enter is pressed in pw field
		 */
		PW.addKeyListener(new KeyListener(){		
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					readFile();
					Set set = userList.entrySet();
					Iterator iterator = set.iterator();
					while(iterator.hasNext()) {
						Map.Entry entry = (Map.Entry)iterator.next();	
						
						if(SID.getText().equals("1")&&PW.getText().equals("1")) {
							adminFound = true; 
							//currentID = SID.getText();
							pwAdminFound = true;
						}
						
						if(SID.getText().equals(entry.getKey())){
							userFound = true;
							currentID = SID.getText();
						}
						if(PW.getText().equals(entry.getValue())){
							pwFound = true;
						} 
						
				      }
					
					if(adminFound && pwAdminFound) {
						
						window.getContentPane().removeAll();
						window.getContentPane().add(new AdminPage(window));
						window.pack();
						window.getContentPane().setVisible(true);	
					}	
					else if((!userFound)&& !(adminFound && pwAdminFound)){
						
						int option = JOptionPane.showConfirmDialog(window,
								"User not found. Would you like to register?");
						if(option == 0){
							window.getContentPane().removeAll();
							window.getContentPane().add(new Registration(window));
							window.pack();
							window.getContentPane().setVisible(true);
						}
					}
					else if(userFound && !pwFound && !(adminFound && pwAdminFound)){
						JOptionPane.showMessageDialog(window, "Password is invalid");	
					}
					else if(userFound && pwFound && !(adminFound && pwAdminFound)){
						window.getContentPane().removeAll();
						window.getContentPane().add(new MainScreen(window));
						window.pack();
						window.getContentPane().setVisible(true);	
					}

			       
			    }

				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
		
		this.add(PW);
		
		
		JLabel studentID = new JLabel("");

		studentID.setBounds(620, 22, 1034, 683);

		studentID.setBounds(630, -10, 1034, 683);

		studentID.setBounds(570, 30, 1034, 683);

		studentID.setBounds(620, 22, 1034, 683);

		studentID.setIcon(new ImageIcon("Images/S-ID.png"));
		this.add(studentID);
		
		JLabel password = new JLabel("");

		password.setBounds(620, 112, 1034, 683);

		password.setBounds(630, 65, 1034, 683);


		password.setBounds(580, 120, 1034, 683);


		password.setBounds(620, 112, 1034, 683);

		password.setIcon(new ImageIcon("Images/Password.png"));
		this.add(password);
		
		JLabel housingLogo = new JLabel();
		housingLogo.setIcon(new ImageIcon("Images/FGCU_Housing.png"));
		housingLogo.setBounds(620, -250, 1034, 683);
		this.add(housingLogo);
		
		
		JLabel logo = new JLabel("");

		logo.setIcon(new ImageIcon("Images/eagleLogo.png"));
		logo.setBounds(700, -100, 1034, 683);

		logo.setIcon(new ImageIcon("Images/Eagle.png"));
		logo.setBounds(620, -95, 1034, 683);

		logo.setIcon(new ImageIcon("Images/Eagle.png"));
		logo.setBounds(710, -110, 1034, 683);

		logo.setIcon(new ImageIcon("Images/eagleLogo.png"));
		logo.setBounds(700, -80, 1034, 683);

		this.add(logo);

		JLabel lblBackground = new JLabel("");
		lblBackground.setLabelFor(window);
		lblBackground.setBounds(-450, -3, 1034, 683);
		lblBackground.setIcon(new ImageIcon("Images/Background2.jpg"));
		this.add(lblBackground);
		
		JButton confirm = new JButton("Login");
		
		confirm.setFont(new Font("Arial Black", Font.PLAIN, 16));
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){		
				readFile();
				Set set = userList.entrySet();
				Iterator iterator = set.iterator();
				while(iterator.hasNext()) {
					Map.Entry entry = (Map.Entry)iterator.next();					
					if(SID.getText().equals(entry.getKey())){
						userFound = true;
						currentID = SID.getText();
					}
					if(PW.getText().equals(entry.getValue())){
						pwFound = true;
					}
					
				}
		      
				if(adminFound && pwAdminFound) {
					
					window.getContentPane().removeAll();
					window.getContentPane().add(new AdminPage(window));
					window.pack();
					window.getContentPane().setVisible(true);	
				}
				else if(!userFound && !(adminFound && pwAdminFound)){
					
					int option = JOptionPane.showConfirmDialog(window,
							"User not found. Would you like to register?");
					if(option == 0){
						window.getContentPane().removeAll();
						window.getContentPane().add(new Registration(window));
						window.pack();
						window.getContentPane().setVisible(true);
					}
					else{
						
					}
				}
				else if(userFound && !pwFound && !(adminFound && pwAdminFound)){
					JOptionPane.showMessageDialog(window, "Password is invalid");	
				}
				else if(userFound && pwFound && !(adminFound && pwAdminFound)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new MainScreen(window));
					window.pack();
					window.getContentPane().setVisible(true);	
				}
			}
		});
		
		JButton regButton = new JButton("Register");
		regButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		regButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == regButton) {
					window.getContentPane().removeAll();
					window.getContentPane().add(new Registration(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				
			}
			
		});

		confirm.setBounds(620, 515, 150, 40);

		confirm.setBounds(630, 475, 150, 40);

		confirm.setBounds(595, 515, 150, 40);

		confirm.setBounds(620, 515, 150, 40);
		
		confirm.setIcon(null);
		confirm.setBackground(new Color(192, 192, 192));
		confirm.setForeground(new Color(0, 0, 0));
		this.add(confirm);
		
		regButton.setBounds(790, 515, 150, 40);
		
		
		
		

		regButton.setIcon(null);
		regButton.setBackground(new Color(192, 192, 192));
		regButton.setForeground(new Color(0, 0, 0));
		this.add(regButton);
		
		JLabel blueBackground = new JLabel("");
		blueBackground.setLabelFor(window);
		blueBackground.setBounds(-30, -3, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		this.add(blueBackground);	
	}
	
	public void readFile(){
		userFound = false;
		pwFound = false;
		String line = "";
		StringTokenizer uData;
		
		try{
			input=new Scanner(new File("UserLogins.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening file..");
			System.exit(1);
		}
		try{
			while((line=input.nextLine())!=null){		
				uData= new StringTokenizer(line, ":");
				String user = uData.nextToken();
				String pw = uData.nextToken();
				userList.put(user, pw);				
			}
			
		}
		catch(NoSuchElementException e){
			
		}
	}

	public void appendToFile(){
		BufferedWriter writer;
		try{
			FileWriter fw = new FileWriter("UserLogins.txt", true);
			writer = new BufferedWriter(fw);
			PrintWriter output = new PrintWriter(writer);
			if(!SID.getText().equals("") && !PW.getText().equals("")){
				output.print(SID.getText()+":"+PW.getText());
				output.println();
			}
			
			writer.close();
		}
		catch(IOException e){
			System.out.println("No file found");
		}	
	}

}
