
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class RequestPage extends MainScreen {
	
	
	
	private JButton sendReq;
	private JLabel reqBack;
	
	private JLabel problemL;
	private JTextField probTxt;

	private JLabel probDescLabel;
	private JTextArea probDesc;
	private JLabel submitButton;
	private JLabel priorityL;
	private JComboBox<String> priorCombo;
	

	private String userProb;
	private String probDescription;
	private String UIN = currentID;
	private String priorString;

	public RequestPage(JFrame window) {
		super(window);
		
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		this.remove(whiteBox);
		
		probDescLabel = new JLabel("Description");
		probDescLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		probDescLabel.setBounds(330,300,150,35);
		probDescLabel.setForeground(Color.white);
		add(probDescLabel);
		
		priorityL = new JLabel("Priority");
		priorityL.setFont(new Font("Arial Black", Font.PLAIN, 16));
		priorityL.setBounds(330,230,150,35);
		priorityL.setForeground(Color.white);
		add(priorityL);
		
		
		problemL = new JLabel("Issue");
		problemL.setFont(new Font("Arial Black", Font.PLAIN, 16));
		problemL.setBounds(330,170,150,35);
		problemL.setForeground(Color.white);
		add(problemL);
		
		probTxt = new JTextField();
		probTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		probTxt.setBounds(330,200,300,20);
		add(probTxt);
		

		probDesc = new JTextArea();
		probDesc.setBounds(330,340,500,230);
		probDesc.setBorder(probTxt.getBorder());
		add(probDesc);
		
		UIManager.put("ComboBox.background", new ColorUIResource(Color.white));
		priorCombo = new JComboBox<String>();
		priorCombo.addItem("");
		priorCombo.addItem("1(Minor issue)");
		priorCombo.addItem("2");
		priorCombo.addItem("3 (Urgent)");
		priorCombo.setBounds(330,260,130,25);
		add(priorCombo);
		
		
		submitButton = new JLabel("");
		submitButton.setBounds(720,600,250,30);
		submitButton.setIcon(new ImageIcon("Images/submitButton.png"));
		submitButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(window,"Request Sent.");
				userProb = probTxt.getText();
				probDescription = probDesc.getText();
				priorString = (String) priorCombo.getSelectedItem();
				
				System.out.println(UIN);
				System.out.println(userProb);
				System.out.println(probDescription);
				
				 try{BufferedWriter writer;
				
					writer = new BufferedWriter(new FileWriter("Maintenance Request.txt", true));
			
				    
				    writer.append(UIN + ":" + priorString + ":" + userProb + ":" + probDescription +'\n');
				   
				    writer.close();
				    }catch(IOException ex) {
				    	
				    }
				 
				 probTxt.setText("");
				 probDesc.setText("");
				 priorCombo.setSelectedIndex(0);
				 
				 
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				submitButton.setIcon(new ImageIcon("Images/submitButton2.png"));
				revalidate();
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				submitButton.setIcon(new ImageIcon("Images/submitButton.png"));
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
		add(submitButton);
		
		reqBack = new JLabel("");
		reqBack.setBounds(270, 110, 715, 580);
		reqBack.setIcon(new ImageIcon("Images/reqBackground.png"));
		add(reqBack);
		
		whiteBox = new JLabel("");
		whiteBox.setBounds(0, 70, 1034, 683);
		whiteBox.setIcon(new ImageIcon("Images/WhiteMenuBox.png"));
		this.add(whiteBox);
		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
		add(blueBackground);	
	}
	

}
