import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainScreen extends AppWindowPanel{
	protected JLabel profile;
	protected JLabel account;
	protected JLabel events;
	protected JLabel locations;
	protected JLabel faq;
	protected JLabel logout;
	protected JLabel fgcuLogo;
	protected JLabel whiteBox;
	protected JLabel BwhiteBox;
	protected JLabel blueBackground;
	protected JLabel pPhoto;
	protected JLabel back; 
	protected JLabel home;
	protected JLabel eagleLogo;
	protected JLabel requests;

	public MainScreen(JFrame window){

		home = new JLabel();
		home.setIcon(new ImageIcon("Images/Home.png"));
		home.setBounds(5, -15, 100, 100);
		this.add(home);
	//	System.out.println(string);
		
		eagleLogo = new JLabel("");
		eagleLogo.setIcon(new ImageIcon("Images/Logo_2.png"));
		eagleLogo.setBounds(60, -222, 1034, 683);
		this.add(eagleLogo);
		

		back = new JLabel("");
		back.setIcon(new ImageIcon("Images/Return.png"));
		back.setBounds(70, -15, 100, 100);
		this.add(back);
		
		pPhoto = new JLabel("");
		pPhoto.setIcon(new ImageIcon("Images/pPhoto.png"));
		pPhoto.setBounds(75, -215, 1034, 683);
		//this.add(pPhoto);
		
		
		profile = new JLabel("");
		profile.setIcon(new ImageIcon("Images/Profile.png"));
		profile.setBounds(45, -120, 1034, 683);
		this.add(profile);
		
		account = new JLabel("");
		account.setBounds(45, -60, 1034, 683);
		account.setIcon(new ImageIcon("Images/Account.png"));
		this.add(account);
		
		events = new JLabel("");
		events.setBounds(45, 0, 1034, 683);
		events.setIcon(new ImageIcon("Images/Events.png"));
		this.add(events);
		
		
		locations = new JLabel("");
		locations.setBounds(45, 60, 1034, 683);
		locations.setIcon(new ImageIcon("Images/Locations.png"));
		this.add(locations);
		
		faq = new JLabel("");
		faq.setBounds(45, 120, 1034, 683);
		faq.setIcon(new ImageIcon("Images/FAQ.png"));
		this.add(faq);
		
		requests = new JLabel("");
		requests.setBounds(26, 203, 1034, 683);
		requests.setIcon(new ImageIcon("Images/Maintenance Button.png"));
		this.add(requests);
		
		
		logout = new JLabel("");
		logout.setBounds(45, 270, 1034, 683);
		logout.setIcon(new ImageIcon("Images/logout.png"));
		
		this.add(logout);
			
		fgcuLogo = new JLabel("");
		fgcuLogo.setBounds(42, -297, 1034, 683);
		fgcuLogo.setIcon(new ImageIcon("Images/logo_2.png"));
		//this.add(fgcuLogo);
		
		whiteBox = new JLabel("");
		whiteBox.setBounds(0, 70, 1034, 683);
		whiteBox.setIcon(new ImageIcon("Images/WhiteMenuBox.png"));
		this.add(whiteBox);
		
		BwhiteBox = new JLabel("");
		BwhiteBox.setBounds(260, 70, 1050, 683);
		BwhiteBox.setIcon(new ImageIcon("Images/BWhiteBox.png"));
		//this.add(BwhiteBox);
		
		blueBackground = new JLabel("");
		blueBackground.setBounds(-30, -0, 1034, 683);

		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));

		blueBackground.setIcon(new ImageIcon("Images/BlueBG2.png"));

		blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));

		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));

		this.add(blueBackground);
		
		window.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e) {
				if((e.getX()>50 && e.getX()<231) && (e.getY()>225 && e.getY()<270)){
					profile.setIcon(new ImageIcon("Images/ProfileH.png"));
					revalidate();
				}
				else{
					profile.setIcon(new ImageIcon("Images/Profile.png"));
				}
				if((e.getX()>35 && e.getX()<233) && (e.getY()>290 && e.getY()<334)){
					account.setIcon(new ImageIcon("Images/AccountH.png"));
					revalidate();
				}
				else{
					account.setIcon(new ImageIcon("Images/Account.png"));
					revalidate();
				}
				if((e.getX()>50 && e.getX()<233) && (e.getY()>350 && e.getY()<395)){
					events.setIcon(new ImageIcon("Images/EventsH.png"));
					revalidate();
				}
				else{
					events.setIcon(new ImageIcon("Images/Events.png"));
					revalidate();
				}
				if((e.getX()>25 && e.getX()<225) && (e.getY()>405 && e.getY()<455)){
					locations.setIcon(new ImageIcon("Images/LocationsH.png"));
					revalidate();
				}
				else{
					locations.setIcon(new ImageIcon("Images/Locations.png"));
					revalidate();
				}
				if((e.getX()>20 && e.getX()<235) && (e.getY()>465 && e.getY()<510)){
					faq.setIcon(new ImageIcon("Images/FAQH.png"));
					revalidate();
				}
				else{
					faq.setIcon(new ImageIcon("Images/FAQ.png"));
					revalidate();
				}
				
				if((e.getX()>39 && e.getX()<254) && (e.getY()>549 && e.getY()<610)){
					requests.setIcon(new ImageIcon("Images/requestGlow.png"));
					requests.setBounds(14, 203, 1034, 683);
					revalidate();
				}
				else{
					requests.setIcon(new ImageIcon("Images/Maintenance Button.png"));
					requests.setBounds(26, 203, 1034, 683);
					revalidate();
				}
				if((e.getX()>65 && e.getX()<175) && (e.getY()>620 && e.getY()<660)){
					logout.setIcon(new ImageIcon("Images/LogoutH.png"));
					revalidate();
				}
				else{
					logout.setIcon(new ImageIcon("Images/Logout.png"));
					revalidate();
				}
				if((e.getX()>0 &&e.getX()<54)&&(e.getY()>25 && e.getY()<72)){
					home.setIcon(new ImageIcon("Images/HomeB.png"));
					revalidate();
				}
				else{
					home.setIcon(new ImageIcon("Images/Home.png"));
					revalidate();
				}
				if((e.getX()>75&&e.getX()<135) && (e.getY()>27 && e.getY()<85)){
					back.setIcon(new ImageIcon("Images/ReturnB.png"));
					revalidate();
				}
				else{
					back.setIcon(new ImageIcon("Images/Return.png"));
					revalidate();
				}
			}
		});	
		
		//this is where additional JPanel classes should be instantiated
		//depending on the range clicked by the user.
		window.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(e.getX() +","+ e.getY());
				//home button click
				if((e.getX()>65 && e.getX()<175) && (e.getY()>620 && e.getY()<645)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new StudentHousing(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				//back button click
				if((e.getX()>74&&e.getX()<125) && (e.getY()>37 && e.getY()<81)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new LoginScreen(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				//logout button click
				if((e.getX()>0 &&e.getX()<60)&&(e.getY()>24 && e.getY()<70)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new StudentHousing(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				//Profile button click
				if((e.getX()>50 && e.getX()<231) && (e.getY()>225 && e.getY()<270)){
					
					window.getContentPane().removeAll();
					window.getContentPane().add(new ProfileScreen(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				if((e.getX()>35 && e.getX()<233) && (e.getY()>290 && e.getY()<334)){
					
					window.getContentPane().removeAll();
					window.getContentPane().add(new AccountScreen(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				//goes to event page on click
				if((e.getX()>50 && e.getX()<195) && (e.getY()>350 && e.getY()<395)){
					
					window.getContentPane().removeAll();
					window.getContentPane().add(new Events(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				
				if((e.getX()>39 && e.getX()<254) && (e.getY()>549 && e.getY()<610)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new RequestPage(window));
					window.pack();
					window.getContentPane().setVisible(true);
					
				}
			//this adds the location page
				if((e.getX()>20 && e.getX()<235) && (e.getY()>465 && e.getY()<510)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new faqPage(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}	
				if((e.getX()>25 && e.getX()<225) && (e.getY()>405 && e.getY()<455)){
					window.getContentPane().removeAll();
					window.getContentPane().add(new LocationPage(window));
					window.pack();
					window.getContentPane().setVisible(true);
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	
	}

}
