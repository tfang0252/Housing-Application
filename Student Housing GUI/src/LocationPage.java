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

	
	public LocationPage(JFrame window) {
		super(window);
		this.remove(BwhiteBox);
		this.remove(blueBackground);
		
	
		
		
		locationPane = new JPanel();
		locationPane.setForeground(Color.WHITE);
		locationPane.setBounds(260, 70, 730, 570);
		
		locationPane.addMouseWheelListener(new MouseWheelListener(){

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				//scroll down
				if(e.getWheelRotation() > 0) {
					zoom--;
					getMap(zoom);
					revalidate();
				}
				//scroll up
				if(e.getWheelRotation() < 0) {
					zoom++;
					getMap(zoom);
					revalidate();
				}
				
			}
			
		});
		getMap(zoom);
		add(locationPane);
		
			
	
			// create a GUI component that loads the image: image.jpg
			//
			ImageIcon imageIcon = new ImageIcon((new ImageIcon("imageMap1.jpg")).getImage().getScaledInstance(630, 600, java.awt.Image.SCALE_SMOOTH));
			locationPane.add(new JLabel(imageIcon));
		
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
			
			// read the map image from Google
			// then save it to a local file: image.jpg
		
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);
			
			byte[] b = new byte[2048];
			int length;
			
			while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
			}
			
			is.close();
			os.close();
			} catch (IOException e) {
			
			e.printStackTrace();
			
			System.exit(1);
			}
	}

	
}



