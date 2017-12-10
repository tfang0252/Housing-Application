import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
public class StudentHousing extends AppWindowPanel{
	private JRadioButton NLRadioButton; //North lake button
	private JRadioButton SLRadioButton; //SouthLake Button
	private JRadioButton WLRadioButton; //South Lake button


	/**
	 * Create the application.
	 */
	public StudentHousing(JFrame window) {
		
		
		
		//following codes sets the radio buttons for each
				//housing option, once selected, cannot be unselected,
				//but will allow switching to other radio buttons.
				NLRadioButton = new JRadioButton("");
				NLRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						NLRadioButton.setSelected(true);
						SLRadioButton.setSelected(false);
						WLRadioButton.setSelected(false);	
					}
				});
				
				NLRadioButton.setOpaque(false);
 				NLRadioButton.setBounds(485, 575, 21, 14);
				this.add(NLRadioButton);
				
				SLRadioButton = new JRadioButton("");
				SLRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0){
						SLRadioButton.setSelected(true);
						NLRadioButton.setSelected(false);
						WLRadioButton.setSelected(false);	
					}
					
				});
				
				SLRadioButton.setOpaque(false);
 				SLRadioButton.setBounds(155, 575, 21, 14);
				this.add(SLRadioButton);
				
				WLRadioButton = new JRadioButton("");
				WLRadioButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						WLRadioButton.setSelected(true);
						SLRadioButton.setSelected(false);
						NLRadioButton.setSelected(false);	
					}
				});
				WLRadioButton.setOpaque(false);
				WLRadioButton.setBounds(815, 575, 21, 14);
				this.add(WLRadioButton);
				
				//following codes sets the images for each button,
				//WL, SL, and NL.Image can be clicked to select radio
				//button
				
				JLabel lblNLVillage = new JLabel("");
				lblNLVillage.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						NLRadioButton.setSelected(true);
						SLRadioButton.setSelected(false);
						WLRadioButton.setSelected(false);
					}
				});

				
				JLabel lblSLVillage = new JLabel("");
				lblSLVillage.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						NLRadioButton.setSelected(false);
						SLRadioButton.setSelected(true);
						WLRadioButton.setSelected(false);
					}
				});

				
				JLabel lblWLVillage = new JLabel("");
				lblWLVillage.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						NLRadioButton.setSelected(false);
						SLRadioButton.setSelected(false);
						WLRadioButton.setSelected(true);
					}
				});

				
				//button to select housing option
				//will return error message if an option is not selected
				JButton btnSelectHousing = new JButton("Select Housing");
				btnSelectHousing.setFont(new Font("Tahoma", Font.BOLD, 13));
				btnSelectHousing.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(NLRadioButton.isSelected() == false && 
								SLRadioButton.isSelected()== false &&
									WLRadioButton.isSelected()== false){
							JOptionPane.showMessageDialog(window, "Please select a housing option.");
							
						}
						else{
							window.getContentPane().removeAll();
							window.getContentPane().add(new LoginScreen(window));
							window.pack();
							window.getContentPane().setVisible(true);
						}				
					}
				});
				btnSelectHousing.setBounds(430, 617, 134, 29);
				this.add(btnSelectHousing);
				
				//sets background image
				JLabel lblBackground = new JLabel("");
				lblBackground.setLabelFor(this);
				lblBackground.setBounds(-20, 0, 1034, 680);
				lblBackground.setIcon(new ImageIcon("Images/Holmes.jpg"));
				this.add(lblBackground);

	}

}

