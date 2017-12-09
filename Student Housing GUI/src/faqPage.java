import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class faqPage extends MainScreen {
	
	private JLabel appAndPay;
	private JLabel assignment;
	private JLabel rooms;
	private JLabel policies;
	private JLabel everythingElse;
	

	
	

	public faqPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		
		
		
		appAndPay = new JLabel("");
		appAndPay.setIcon(new ImageIcon("Images/ApplicationPayments.PNG"));
		appAndPay.setBounds(300, -60, 1034, 683);
		this.add(appAndPay);
		
		assignment = new JLabel("");
		assignment.setIcon(new ImageIcon("Images/assignment.PNG"));
		assignment.setBounds(300, 10, 1034, 683);
		this.add(assignment);
		
		rooms = new JLabel("");
		rooms.setIcon(new ImageIcon("Images/theRooms.PNG"));
		rooms.setBounds(310, 60, 1034, 683);
		this.add(rooms);
		
		policies = new JLabel("");
		policies.setIcon(new ImageIcon("Images/HousingPolicies.PNG"));
		policies.setBounds(300, 120, 1034, 683);
		this.add(policies);
		
		everythingElse = new JLabel("");
		everythingElse.setIcon(new ImageIcon("Images/everythingElse.PNG"));
		everythingElse.setBounds(300, 180, 1034, 683);
		this.add(everythingElse);
		
		this.add(BwhiteBox);
		//335,260   921,655
		window.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e) {
				if((e.getX()>333 && e.getX()<660) && (e.getY()>300 && e.getY()<325)){
					appAndPay.setIcon(new ImageIcon("Images/ApplicationPaymentsB.PNG"));
					revalidate();
				}
				else{
					appAndPay.setIcon(new ImageIcon("Images/ApplicationPayments.PNG"));
				}
				if((e.getX()>333 && e.getX()<478) && (e.getY()>368 && e.getY()<383)){
					assignment.setIcon(new ImageIcon("Images/assignmentB.PNG"));
					revalidate();
				}
				else{
					assignment.setIcon(new ImageIcon("Images/assignment.PNG"));
				}
				if((e.getX()>333 && e.getX()<470) && (e.getY()>424 && e.getY()<444)){
					rooms.setIcon(new ImageIcon("Images/theRoomsB.PNG"));
					revalidate();
				}
				else{
					rooms.setIcon(new ImageIcon("Images/theRooms.PNG"));
				}
				if((e.getX()>333 && e.getX()<533) && (e.getY()>481 && e.getY()<501)){
					policies.setIcon(new ImageIcon("Images/HousingPoliciesB.PNG"));
					revalidate();
				}
				else{
					policies.setIcon(new ImageIcon("Images/HousingPolicies.PNG"));
				}
				if((e.getX()>333 && e.getX()<524) && (e.getY()>534 && e.getY()<555)){
					everythingElse.setIcon(new ImageIcon("Images/everythingElseB.PNG"));
					revalidate();
				}
				else{
					everythingElse.setIcon(new ImageIcon("Images/everythingElse.PNG"));
				}
			}
		});	
		
		window.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if((e.getX()>333 && e.getX()<660) && (e.getY()>300 && e.getY()<325)){
					
					JTextArea textArea = new JTextArea(40,50);
					
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
				      
				     
				      
				      // display them in a message dialog
				      //JOptionPane.showMessageDialog(window, textArea);
					      JOptionPane.showConfirmDialog(null, scrollPane,
					    		    "Application and Payment FAQ", 
					    		    JOptionPane.CLOSED_OPTION, 
					    		    JOptionPane.PLAIN_MESSAGE);
				}
				
				if((e.getX()>333 && e.getX()<478) && (e.getY()>368 && e.getY()<383)){
					
					JTextArea textArea = new JTextArea(40,50);
					
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
				      
				     
				      
				      // display them in a message dialog
				      //JOptionPane.showMessageDialog(window, textArea);
					      JOptionPane.showConfirmDialog(null, scrollPane,
					    		    "Assignment FAQ", 
					    		    JOptionPane.CLOSED_OPTION, 
					    		    JOptionPane.PLAIN_MESSAGE);
				
				}
				
				if((e.getX()>333 && e.getX()<470) && (e.getY()>424 && e.getY()<444)){
					
					JTextArea textArea = new JTextArea(40,50);
					
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
				      
				     
				      
				      // display them in a message dialog
				      //JOptionPane.showMessageDialog(window, textArea);
					      JOptionPane.showConfirmDialog(null, scrollPane,
					    		    "Rooms FAQ", 
					    		    JOptionPane.CLOSED_OPTION, 
					    		    JOptionPane.PLAIN_MESSAGE);
					
				}
				
				if((e.getX()>333 && e.getX()<533) && (e.getY()>481 && e.getY()<501)){
					
					JTextArea textArea = new JTextArea(40,50);
					
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
				      
				     
				      
				      // display them in a message dialog
				      //JOptionPane.showMessageDialog(window, textArea);
					      JOptionPane.showConfirmDialog(null, scrollPane,
					    		    "Housing Policies FAQ", 
					    		    JOptionPane.CLOSED_OPTION, 
					    		    JOptionPane.PLAIN_MESSAGE);
					
				}
				
				if((e.getX()>333 && e.getX()<524) && (e.getY()>534 && e.getY()<555)){
					
					JTextArea  textArea = new JTextArea(40,50);
					
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
				      
				     
				      
				      // display them in a message dialog
				      //JOptionPane.showMessageDialog(window, textArea);
					      JOptionPane.showConfirmDialog(null, scrollPane,
					    		    "EverythingElse FAQ", 
					    		    JOptionPane.CLOSED_OPTION, 
					    		    JOptionPane.PLAIN_MESSAGE);
				
				}
				
	
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		

		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		add(blueBackground);
	}


}
