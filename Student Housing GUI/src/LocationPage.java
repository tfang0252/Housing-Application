import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.swing.*;

public class LocationPage extends MainScreen implements ActionListener{
	
	private JPanel locationPane;
	private JLabel testMap;
	private JButton zoomIn;
	private JButton zoomOut;
	private int i = 3;
	public LocationPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
		zoomIn = new JButton("+");
		zoomOut = new JButton("-");
		zoomIn.addActionListener(this);
		zoomOut.addActionListener(this);
	
		zoomIn.setBounds(925,325,50,20);
		add(zoomIn);
		zoomOut.setBounds(925,350,50,20);
		add(zoomOut);

	
		testMap = new JLabel("");
		testMap.setBounds(360, 70, 1034, 683);

		testMap.setIcon(new ImageIcon("Images/map3.png"));
		
		
		locationPane = new JPanel();
		locationPane.setForeground(Color.WHITE);
		locationPane.setBounds(270, 70, 730, 570);

		locationPane.add(testMap);
		
	
		add(testMap);

			this.add(BwhiteBox);
		
			blueBackground = new JLabel("");
			blueBackground.setBounds(-30, -0, 1034, 683);
			blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
			add(blueBackground);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == zoomIn) {
			i++;
			
			
			if(i>5 || i <1) {
				i=3;
			}
			System.out.println(i);
			testMap.setIcon(new ImageIcon("Images/map"+i+".png"));
			revalidate();
		}
		if(e.getSource() == zoomOut) {
			i--;
			
			
			if(i>5 || i <1) {
				i=3;
			}
			System.out.println(i);
			testMap.setIcon(new ImageIcon("Images/map"+i+".png"));
			revalidate();
		}
		
	}

	
}



