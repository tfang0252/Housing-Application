
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RequestPage extends MainScreen {
	
	
	private JFrame reqMainFrame;
	private JButton sendReq;
	private JPanel topPanel;
	private JLabel problemL;
	private JTextField probTxt;
	private JPanel midPanel;
	private JLabel probDescLabel;
	private JTextArea probDesc;

	private String userProb;
	private String probDescription;
	private String UIN = currentID;

	public RequestPage(JFrame window) {
		super(window);
		
		
		
		
		reqMainFrame = new JFrame("Request Maintenance");
		reqMainFrame.setLayout(new BorderLayout());
		reqMainFrame.setSize(500,500);
		reqMainFrame.setVisible(true);
		reqMain();
		
		
		
		
		
		
		
	
	}
	public void reqMain() {
		sendReq = new JButton("Send Request");
		reqMainFrame.add(sendReq, BorderLayout.SOUTH);
		
		sendReq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userProb = probTxt.getText();
				probDescription = probDesc.getText();
				System.out.println(UIN);
				System.out.println(userProb);
				System.out.println(probDescription);
				
				 try{BufferedWriter writer;
				
					writer = new BufferedWriter(new FileWriter("Maintenance Request.txt", true));
			
				    
				    writer.append(UIN + ":" + userProb + ":" + probDescription +'\n');
				   
				    writer.close();
				    }catch(IOException ex) {
				    	
				    }
				
			}
			
		});
		
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		
		
		
		problemL = new JLabel("Problem: ");
		topPanel.add(problemL,FlowLayout.LEFT);
		
		 probTxt = new JTextField();
		probTxt.setPreferredSize(new Dimension(200,20));
		topPanel.add(probTxt);
		midPanel = new JPanel();
		
		probDescLabel = new JLabel("Problem Description");
		midPanel.add(probDescLabel);
		
		probDesc = new JTextArea();
		probDesc.setPreferredSize(new Dimension(400,300));
		probDesc.setBorder(probTxt.getBorder());
		midPanel.add(probDesc);
		
		
		
		reqMainFrame.add(topPanel,BorderLayout.NORTH);
		reqMainFrame.add(midPanel, BorderLayout.CENTER);
	}

}
