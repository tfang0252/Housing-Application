import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class faqPage extends MainScreen implements ActionListener {
	
	private JLabel appAndPay;
	private JLabel assignment;
	private JLabel rooms;
	private JLabel policies;
	private JLabel everythingElse;
	

	private JButton appAndPayB = new JButton();
	private JButton assignmentB= new JButton();;
	private JButton roomsB= new JButton();;
	private JButton policiesB= new JButton();;
	private JButton everythingElseB= new JButton();;
	

	public faqPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		
		
		
		appAndPay = new JLabel("");
		appAndPay.setIcon(new ImageIcon("Images/ApplicationPayments.PNG"));
		appAndPay.setBounds(300, -60, 1034, 683);
		
		appAndPayB.setBounds(328, 270, 319, 30);
		appAndPayB.setOpaque(false);
		appAndPayB.setContentAreaFilled(false);
		appAndPayB.setBorderPainted(false);
		appAndPayB.addActionListener(this);
		this.add(appAndPayB);
		this.add(appAndPay);
		
		assignment = new JLabel("");
		assignment.setIcon(new ImageIcon("Images/assignment.PNG"));
		assignment.setBounds(300, 10, 1034, 683);
		this.add(assignment);
		assignmentB.setBounds(310, 335, 170, 30);
		assignmentB.setOpaque(false);
		assignmentB.setContentAreaFilled(false);
		assignmentB.setBorderPainted(false);
		assignmentB.addActionListener(this);
		this.add(assignmentB);
		
		rooms = new JLabel("");
		rooms.setIcon(new ImageIcon("Images/theRooms.PNG"));
		rooms.setBounds(310, 60, 1034, 683);
		this.add(rooms);
		roomsB.setBounds(310, 390, 160,30);
		roomsB.setOpaque(false);
		roomsB.setContentAreaFilled(false);
		roomsB.setBorderPainted(false);
		roomsB.addActionListener(this);
		this.add(roomsB);
		
		policies = new JLabel("");
		policies.setIcon(new ImageIcon("Images/HousingPolicies.PNG"));
		policies.setBounds(300, 120, 1034, 683);
		this.add(policies);
		policiesB.setBounds(310, 445, 220,30);
		policiesB.setOpaque(false);
		policiesB.setContentAreaFilled(false);
		policiesB.setBorderPainted(false);
		policiesB.addActionListener(this);
		this.add(policiesB);
		
		everythingElse = new JLabel("");
		everythingElse.setIcon(new ImageIcon("Images/everythingElse.PNG"));
		everythingElse.setBounds(300, 180, 1034, 683);
		this.add(everythingElse);
		everythingElseB.setBounds(300, 500, 220,30);
		everythingElseB.setOpaque(false);
		everythingElseB.setContentAreaFilled(false);
		everythingElseB.setBorderPainted(false);
		everythingElseB.addActionListener(this);
		this.add(everythingElseB);
		
		this.add(BwhiteBox);

		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
		add(blueBackground);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==(appAndPayB)) {
			
			appAndPay.setIcon(new ImageIcon("Images/ApplicationPaymentsB.PNG"));
			revalidate();
			
			JTextArea textArea = new JTextArea(40,50);
			textArea.setBackground(Color.white);
			 textArea.setLineWrap(true);
			 textArea.setWrapStyleWord(true);
			
			
			try {
				FileReader FAQreader = new FileReader("App and Payment FAQ.txt");
				BufferedReader FAQbuffer = new BufferedReader(FAQreader);
				
				String FAQline;
				while((FAQline=FAQbuffer.readLine())!=null){
					 textArea.append(FAQline+ '\n');
				}
				FAQbuffer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 textArea.setEditable(false);	
		      textArea.setBackground(null);
	    
	      JScrollPane scrollPane = new JScrollPane( textArea);
	      scrollPane.setBackground(Color.white);
	     
	      
	      // display them in a message dialog
	      //JOptionPane.showMessageDialog(window, textArea);
		      JOptionPane.showConfirmDialog(null, scrollPane,
		    		    "Application and Payment FAQ", 
		    		    JOptionPane.CLOSED_OPTION, 
		    		    JOptionPane.PLAIN_MESSAGE);
		      appAndPay.setIcon(new ImageIcon("Images/ApplicationPayments.PNG"));
	}
		if(e.getSource()==(assignmentB)) {
			assignment.setIcon(new ImageIcon("Images/assignmentB.PNG"));
			revalidate();
			
			JTextArea textArea = new JTextArea(40,50);
			textArea.setBackground(Color.white);
			
			 textArea.setLineWrap(true);
			 textArea.setWrapStyleWord(true);
			
			
			try {
				FileReader FAQreader = new FileReader("Assignment FAQ.txt");
				BufferedReader FAQbuffer = new BufferedReader(FAQreader);
				String FAQline;
				while((FAQline=FAQbuffer.readLine())!=null){
					 textArea.append(FAQline+ '\n');
				}
				FAQbuffer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 textArea.setEditable(false);	
		      textArea.setBackground(null);
	    
	      JScrollPane scrollPane = new JScrollPane( textArea);
	      scrollPane.setBackground(Color.white);
	     
	      
	      // display them in a message dialog
	      //JOptionPane.showMessageDialog(window, textArea);
		      JOptionPane.showConfirmDialog(null, scrollPane,
		    		    "Assignment FAQ", 
		    		    JOptionPane.CLOSED_OPTION, 
		    		    JOptionPane.PLAIN_MESSAGE);
		      assignment.setIcon(new ImageIcon("Images/assignment.PNG"));
	}
		if(e.getSource() == roomsB) {
			rooms.setIcon(new ImageIcon("Images/theRoomsB.PNG"));
			revalidate();
			
			JTextArea textArea = new JTextArea(40,50);
			textArea.setBackground(Color.white);
			 textArea.setLineWrap(true);
			 textArea.setWrapStyleWord(true);
			
			
			try {
				FileReader FAQreader = new FileReader("Rooms FAQ.txt");
				BufferedReader FAQbuffer = new BufferedReader(FAQreader);
				
				String FAQline;
				while((FAQline=FAQbuffer.readLine())!=null){
					 textArea.append(FAQline+ '\n');
				}
				FAQbuffer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 textArea.setEditable(false);	
		      textArea.setBackground(null);
	    
	      JScrollPane scrollPane = new JScrollPane( textArea);
	      scrollPane.setBackground(Color.white);
	     
	      
	      // display them in a message dialog
	      //JOptionPane.showMessageDialog(window, textArea);
		      JOptionPane.showConfirmDialog(null, scrollPane,
		    		    "Rooms FAQ", 
		    		    JOptionPane.CLOSED_OPTION, 
		    		    JOptionPane.PLAIN_MESSAGE);
		      rooms.setIcon(new ImageIcon("Images/theRooms.PNG"));
		
	}
	if(e.getSource()== policiesB) {
			
			policies.setIcon(new ImageIcon("Images/HousingPoliciesB.PNG"));
			revalidate();
			
			JTextArea textArea = new JTextArea(40,50);
			textArea.setBackground(Color.white);
			 textArea.setLineWrap(true);
			 textArea.setWrapStyleWord(true);
			
			
			try {
				FileReader FAQreader = new FileReader("Policies FAQ.txt");
				BufferedReader FAQbuffer = new BufferedReader(FAQreader);
				
				String FAQline;
				while((FAQline=FAQbuffer.readLine())!=null){
					 textArea.append(FAQline+ '\n');
				}
				FAQbuffer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 textArea.setEditable(false);	
		      textArea.setBackground(null);
	    
	      JScrollPane scrollPane = new JScrollPane( textArea);
	      scrollPane.setBackground(Color.white);
	     
	      
	      // display them in a message dialog
	      //JOptionPane.showMessageDialog(window, textArea);
		      JOptionPane.showConfirmDialog(null, scrollPane,
		    		    "Housing Policies FAQ", 
		    		    JOptionPane.CLOSED_OPTION, 
		    		    JOptionPane.PLAIN_MESSAGE);
		      policies.setIcon(new ImageIcon("Images/HousingPolicies.PNG"));
		
	}
	if(e.getSource()==everythingElseB) {
		
		everythingElse.setIcon(new ImageIcon("Images/everythingElseB.PNG"));
		revalidate();
		
		JTextArea  textArea = new JTextArea(40,50);
		textArea.setBackground(Color.white);
		 textArea.setLineWrap(true);
		 textArea.setWrapStyleWord(true);
		
		
		try {
			FileReader FAQreader = new FileReader("EverythingElse FAQ.txt");
			BufferedReader FAQbuffer = new BufferedReader(FAQreader);
			
			String FAQline;
			while((FAQline=FAQbuffer.readLine())!=null){
				 textArea.append(FAQline+ '\n');
			}
			FAQbuffer.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		 textArea.setEditable(false);	
	      textArea.setBackground(null);
   
     JScrollPane scrollPane = new JScrollPane( textArea);
     scrollPane.setBackground(Color.white);
     
    
     
	      JOptionPane.showConfirmDialog(null, scrollPane,
	    		    "EverythingElse FAQ", 
	    		    JOptionPane.CLOSED_OPTION, 
	    		    JOptionPane.PLAIN_MESSAGE);
	      everythingElse.setIcon(new ImageIcon("Images/everythingElse.PNG"));
	
		}
		
	}
	


}
