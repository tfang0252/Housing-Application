import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**Class extends AppWindow with preset frame
 * size and layout, and can be modified to add to add
 * the login screen 
*/
public class LoginScreen extends AppWindow{


	public LoginScreen() {
		initialize();
	}

	private void initialize(){	
		JLabel nextScreen = new JLabel("Next Screen");
		nextScreen.setBounds(500, 239, 89, 23);
		panel.add(nextScreen);
		panel.setLayout(null);

		
	}
	
	//allows new modified panel containing other components
	//to be returned.
	public JPanel getContentPanel(){
		return panel;
	}
	
}
