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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentHousing extends AppWindow{
	private JRadioButton NLRadioButton; //North lake button
	private JRadioButton SLRadioButton; //SouthLake Button
	private JRadioButton WLRadioButton; //South Lake button


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentHousing window = new StudentHousing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentHousing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Mainly sets the different buttons declared
	 * globally in the class.
	 */
	private void initialize() {	
		
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
		
		NLRadioButton.setBackground(new Color(102, 153, 102));
		NLRadioButton.setBounds(169, 350, 21, 14);
		panel.add(NLRadioButton);
		
		SLRadioButton = new JRadioButton("");
		SLRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				SLRadioButton.setSelected(true);
				NLRadioButton.setSelected(false);
				WLRadioButton.setSelected(false);	
			}
			
		});
		
		SLRadioButton.setBackground(new Color(102, 153, 102));
		SLRadioButton.setBounds(495, 350, 21, 14);
		panel.add(SLRadioButton);
		
		WLRadioButton = new JRadioButton("");
		WLRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				WLRadioButton.setSelected(true);
				SLRadioButton.setSelected(false);
				NLRadioButton.setSelected(false);	
			}
		});
		WLRadioButton.setBackground(new Color(102, 153, 102));
		WLRadioButton.setBounds(824, 350, 21, 14);
		panel.add(WLRadioButton);
		
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
		lblNLVillage.setIcon(new ImageIcon("NLButton.png"));
		lblNLVillage.setBounds(31, 222, 286, 163);
		panel.add(lblNLVillage);
		
		JLabel lblSLVillage = new JLabel("");
		lblSLVillage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NLRadioButton.setSelected(false);
				SLRadioButton.setSelected(true);
				WLRadioButton.setSelected(false);
			}
		});
		lblSLVillage.setIcon(new ImageIcon("SLButton.png"));
		lblSLVillage.setBounds(356, 222, 286, 163);
		panel.add(lblSLVillage);
		
		JLabel lblWLVillage = new JLabel("");
		lblWLVillage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NLRadioButton.setSelected(false);
				SLRadioButton.setSelected(false);
				WLRadioButton.setSelected(true);
			}
		});
		lblWLVillage.setIcon(new ImageIcon("WLButton.png"));
		lblWLVillage.setBounds(684, 222, 286, 163);
		panel.add(lblWLVillage);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("FGCU-logo.png"));
		lblLogo.setBounds(684, 11, 300, 150);
		panel.add(lblLogo);
		
		//button to select housing option
		//will return error message if an option is not selected
		JButton btnSelectHousing = new JButton("Select Housing");
		btnSelectHousing.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSelectHousing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(NLRadioButton.isSelected() == false && 
						SLRadioButton.isSelected()== false &&
							WLRadioButton.isSelected()== false){
					JOptionPane.showMessageDialog(panel, "Please select a housing option.");
					
				}
				else{
					LoginScreen loginScreen = new LoginScreen();
					frame.setContentPane(loginScreen.getContentPanel());
					frame.revalidate();;
				}				
			}
		});
		btnSelectHousing.setBounds(436, 470, 134, 29);
		panel.add(btnSelectHousing);
		
		//sets background image
		JLabel lblBackground = new JLabel("");
		lblBackground.setLabelFor(frame);
		lblBackground.setBounds(-40, -16, 1034, 683);
		lblBackground.setIcon(new ImageIcon("Holmes.jpg"));
		panel.add(lblBackground);
	}

}
