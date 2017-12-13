import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class AdminPage extends MainScreen{
	
	private JPanel adminPane;


	
	public AdminPage(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		adminPane = new JPanel();
		adminPane.setForeground(Color.WHITE);
		adminPane.setBounds(260, 70, 730, 570);
		add(adminPane);

		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		this.add(blueBackground);
		
		revalidate();
	}

	
}


