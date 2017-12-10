import java.awt.BorderLayout;
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
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class LocationPage extends MainScreen{
	
	private JInternalFrame locationPane;
	private JLabel testMap;
	private JButton zoomIn;
	private JButton zoomOut;
	private int i = 3;
	public LocationPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
	

	
		GMapsAPI fgcu = new GMapsAPI();
		
		locationPane = new JInternalFrame();
		locationPane.setForeground(Color.WHITE);
		locationPane.setBounds(270, 70, 715, 580);
		
		locationPane.add(fgcu, BorderLayout.CENTER);
		//locationPane.setUndecorated(true);
		BasicInternalFrameUI bi = (BasicInternalFrameUI)locationPane.getUI();
		bi.setNorthPane(null);

		  
		locationPane.setVisible(true);
	
		add(locationPane);

			//this.add(BwhiteBox);
		
			blueBackground = new JLabel("");
			blueBackground.setBounds(-30, -0, 1034, 683);
			blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
			add(blueBackground);
	}



	
}



