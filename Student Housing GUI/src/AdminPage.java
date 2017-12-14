import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.*;


public class AdminPage extends MainScreen{
	
	private JPanel adminPane;
	private JLabel maintReq;
	private JScrollPane reqPane;
	private String userID;
	private String issue;
	private String description;
	private String priority;
	private int lineCount = 0;
	private String[] descriptArr = new String[100];
	private JButton[] buttons = new JButton[100];
	private String[] stringArr = new String[100];
	private int counter;
	public AdminPage(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		this.remove(profile);
		this.remove(account);
		this.remove(locations);
		this.remove(requests);
		this.remove(directory);
		this.remove(faq);
		this.remove(events);
		this.remove(whiteBox);
		
		maintReq = new JLabel("");
		maintReq.setBounds(83,200,100,100);
		maintReq.setIcon(new ImageIcon("Images/emailLogo2.png"));
		maintReq.addMouseListener(new MouseListener() {
		
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BufferedReader reader = null;
				final JPanel panel = new JPanel(new GridLayout(0,1));
				reqPane = new JScrollPane(panel);
				reqPane.setPreferredSize(new Dimension(600,500));
				reqPane.setBounds(270, 110, 715, 538);
				panel.setBorder(new JTextField().getBorder());
				add(reqPane);
				
				String line = "";
				StringTokenizer uData;
				
				try{
					input=new Scanner(new File("Maintenance Request.txt"));
				}
				catch(FileNotFoundException e){
					System.out.println("Error opening file..");
					System.exit(1);
				}
				try{
					while((line=input.nextLine())!=null){
						
						uData= new StringTokenizer(line, ":");
						userID = uData.nextToken();
						priority = uData.nextToken();
						issue = uData.nextToken();
						description = uData.nextToken();
						descriptArr [lineCount] = description;
						stringArr[lineCount]= "UserID:" + userID + " Priority:" + priority + " Issue:" + issue;
						System.out.println(stringArr[lineCount]);
						lineCount++;
					}			
				}
				catch(NoSuchElementException e){		
				}
				
				JButton[] jlabel1 = new JButton[lineCount];
				
				for(int i = 0;i<lineCount;i++) {
					counter = i;
					jlabel1[i]=new JButton(stringArr[i]);
					jlabel1[i].setPreferredSize(new Dimension(100,200));
					jlabel1[i].addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(window,descriptArr[counter]);
							
						}
						
					});
					panel.add(jlabel1[i]);
				}
				
				
				
			}
			
			
				

			@Override
			public void mouseEntered(MouseEvent arg0) {
				maintReq.setIcon(new ImageIcon("Images/emailLogo.png"));
				revalidate();
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				maintReq.setIcon(new ImageIcon("Images/emailLogo2.png"));
				revalidate();
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
		this.add(maintReq);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.add(whiteBox);
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/adminBG.png"));
		this.add(blueBackground);
		
		
	}
	
	
	
}


