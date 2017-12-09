import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class EventsPage extends MainScreen{
	
	private JScrollPane eventPane;


	
	public EventsPage(JFrame window){
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		
		
		
		eventPane = new JScrollPane();
		eventPane.setForeground(Color.WHITE);
		eventPane.setBounds(260, 70, 730, 570);
		add(eventPane);

		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);
		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));
		this.add(blueBackground);
		
		revalidate();
	}

	
}


