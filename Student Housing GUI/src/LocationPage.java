import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.swing.*;

public class LocationPage extends MainScreen{
	
	private JPanel locationPane;
	private int zoom =10;
	private JLabel testMap;
	
	public LocationPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
	
		testMap = new JLabel("");
		testMap.setBounds(260, 70, 730, 570);
		
		
		locationPane = new JPanel();
		locationPane.setForeground(Color.WHITE);
		locationPane.setBounds(260, 70, 730, 570);
		locationPane.add(testMap);
		locationPane.addMouseWheelListener(new MouseWheelListener(){

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				//scroll down
				if(e.getWheelRotation() > 0) {
					zoom-=1;
					getMap(zoom);
					System.out.println(zoom);
					
					
				}
				//scroll up
				if(e.getWheelRotation() < 0) {
					zoom+=1;
					getMap(zoom);
					System.out.println(zoom);
					
				}
				
			}
			
		});
		getMap(zoom);
		add(locationPane);
		
			
	
			// create a GUI component that loads the image: image.jpg
			//
	
		
			blueBackground = new JLabel("");
			blueBackground.setBounds(-30, -0, 1034, 683);
			blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
			add(blueBackground);
	}
	
	public void getMap(int zoom) {
		try {
			String latitude = "26.471038";
			String longitude = "-81.770770";
			String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
			+ latitude
			+ ","
			+ longitude
			+ "&zoom="+zoom+"&size=612x612&scale=2&maptype=roadmap";
			String destinationFile = "imageMap1.jpg";
			
			System.out.println(imageUrl);
			// read the map image from Google
			// then save it to a local file: image.jpg
		
			URL url = new URL(imageUrl);
			System.out.println(url);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);
			
			byte[] b = new byte[2048];
			int length;
			
			while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
			}
			length++;
			
			is.close();
			os.close();
			
			
			testMap.setIcon(new ImageIcon(destinationFile));
			revalidate();
			} catch (IOException e) {
			
			e.printStackTrace();
			
			System.exit(1);
			}
	}

	
}



