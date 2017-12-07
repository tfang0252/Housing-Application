import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Events extends JPanel{
	
	private JLabel icon;
	private JTextField lTitle;
	private JTextField lDescription;
	
	public Events(JFrame frame,String s1, String s2, String s3){
		String iconText = s1;
		String title = s2;
		String description = s3;
		
		this.setPreferredSize(new Dimension(150,60));
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(1000, 665));
		setVisible(true);
		
		icon = new JLabel("");
		icon.setIcon(new ImageIcon(iconText));
		add(icon);
		
		lTitle = new JTextField();
		lTitle.setText(title);
		add(lTitle);
		
		lDescription = new JTextField();
		lDescription.setText(description);
		add(lDescription);
		
		
		
	}
}
