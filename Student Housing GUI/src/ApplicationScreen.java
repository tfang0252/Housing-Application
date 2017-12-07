import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class ApplicationScreen extends AppWindowPanel{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;



	/**
	 * Create the application.
	 */
	public ApplicationScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		JLabel profile = new JLabel("");
		profile.setBounds(80, -120, 1034, 683);
		profile.setIcon(new ImageIcon("Profile.png"));
		this.add(profile);
		
		JLabel account = new JLabel("");
		account.setBounds(65, -60, 1034, 683);
		account.setIcon(new ImageIcon("Account.png"));
		this.add(account);
		
		JLabel events = new JLabel("");
		events.setBounds(80, 0, 1034, 683);
		events.setIcon(new ImageIcon("Events.png"));
		this.add(events);
		
		JLabel dormDir = new JLabel("");
		dormDir.setBounds(55, 60, 1034, 683);
		dormDir.setIcon(new ImageIcon("DormDir.png"));
		this.add(dormDir);
		
		JLabel locations = new JLabel("");
		locations.setBounds(55, 120, 1034, 683);
		locations.setIcon(new ImageIcon("Locations.png"));
		this.add(locations);
		
		JLabel faq = new JLabel("");
		faq.setBounds(110, 180, 1034, 683);
		faq.setIcon(new ImageIcon("FAQ.png"));
		this.add(faq);
		
		JLabel logout = new JLabel("");
		logout.setBounds(95, 270, 1034, 683);
		logout.setIcon(new ImageIcon("logout.png"));
		this.add(logout);
			
		JLabel fgcuLogo = new JLabel("");

		fgcuLogo.setBounds(15, -270, 1034, 683);
		fgcuLogo.setIcon(new ImageIcon("FGCU-logo.png"));
		this.add(fgcuLogo);
		
		JLabel whiteBox = new JLabel("");
		whiteBox.setBounds(0, 70, 1034, 683);
		whiteBox.setIcon(new ImageIcon("WhiteMenuBox.png"));
		this.add(whiteBox);
		
		JLabel blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -16, 1034, 683);
		blueBackground.setIcon(new ImageIcon("BlueBG.png"));
		this.add(blueBackground);
		
	}
	
}
