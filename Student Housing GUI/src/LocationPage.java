import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class LocationPage extends MainScreen{
	
	private JScrollPane locationPane;


	
	public LocationPage(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		
		
		
		locationPane = new JScrollPane();
		locationPane.setForeground(Color.WHITE);
		locationPane.setBounds(260, 70, 730, 570);
		add(locationPane);

		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		this.add(blueBackground);
		
		revalidate();
	}

	
}


