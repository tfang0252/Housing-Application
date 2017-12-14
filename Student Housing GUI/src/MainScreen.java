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
	protected JLabel directory;

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
		
		directory = new JLabel("");
		directory.setIcon(new ImageIcon("Images/DormDir.png"));
		directory.setBounds(45,470,180,100);
		//this.add(directory);
		
		
		
		profile = new JLabel("");
		profile.setIcon(new ImageIcon("Images/Profile.png"));
		profile.setBounds(45,170, 180, 100);
		this.add(profile);
		
		account = new JLabel("");
		account.setBounds(45, 230, 180,100);
		account.setIcon(new ImageIcon("Images/Account.png"));
		this.add(account);
		
		events = new JLabel("");
		events.setBounds(45, 290, 180,100);
		events.setIcon(new ImageIcon("Images/Events.png"));
		this.add(events);
		
		
		locations = new JLabel("");
		locations.setBounds(45, 350, 180,100);
		locations.setIcon(new ImageIcon("Images/Locations.png"));
		this.add(locations);
		
		faq = new JLabel("");
		faq.setBounds(45, 410,180,100);
		faq.setIcon(new ImageIcon("Images/FAQ.png"));
		this.add(faq);
		
		requests = new JLabel("");
		requests.setBounds(750, 0, 220, 80);
		requests.setIcon(new ImageIcon("Images/Maintenance Button.png"));
		this.add(requests);
		
		
		logout = new JLabel("");
		logout.setBounds(45, 570,180,100);
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


		//blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));

		//blueBackground.setIcon(new ImageIcon("Images/BlueBG2.png"));

		//blueBackground.setIcon(new ImageIcon("Images/BlueBG.png"));

		blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));

		this.add(blueBackground);

		this.add(blueBackground);
		

		
		
		profile.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new ProfileScreen(window));
				window.pack();
				window.getContentPane().setVisible(true);				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setIcon(new ImageIcon("Images/ProfileH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				profile.setIcon(new ImageIcon("Images/Profile.png"));
				revalidate();
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
		
		account.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new AccountScreen(window));
				window.pack();
				window.getContentPane().setVisible(true);				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				account.setIcon(new ImageIcon("Images/AccountH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				account.setIcon(new ImageIcon("Images/Account.png"));
				revalidate();
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
		
		events.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new Events(window));
				window.pack();
				window.getContentPane().setVisible(true);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				events.setIcon(new ImageIcon("Images/EventsH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				events.setIcon(new ImageIcon("Images/Events.png"));
				revalidate();
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
		
		locations.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new LocationPage(window));
				window.pack();
				window.getContentPane().setVisible(true);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				locations.setIcon(new ImageIcon("Images/LocationsH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				locations.setIcon(new ImageIcon("Images/Locations.png"));
				revalidate();
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
		
		faq.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new faqPage(window));
				window.pack();
				window.getContentPane().setVisible(true);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				faq.setIcon(new ImageIcon("Images/FAQH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				faq.setIcon(new ImageIcon("Images/FAQ.png"));
				revalidate();
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
		
		logout.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new StudentHousing(window));
				window.pack();
				window.getContentPane().setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				logout.setIcon(new ImageIcon("Images/LogoutH.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				logout.setIcon(new ImageIcon("Images/Logout.png"));
				revalidate();
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
		
		home.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new StudentHousing(window));
				window.pack();
				window.getContentPane().setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				home.setIcon(new ImageIcon("Images/HomeB.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				home.setIcon(new ImageIcon("Images/Home.png"));
				revalidate();
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
		
		requests.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new RequestPage(window));
				window.pack();
				window.getContentPane().setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				requests.setIcon(new ImageIcon("Images/requestGlow.png"));
				requests.setBounds(742, 0, 245, 80);
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				requests.setIcon(new ImageIcon("Images/Maintenance Button.png"));
				requests.setBounds(750, 0, 220, 80);
				revalidate();
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
		
		back.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new LoginScreen(window));
				window.pack();
				window.getContentPane().setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				back.setIcon(new ImageIcon("Images/ReturnB.png"));
				revalidate();
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				back.setIcon(new ImageIcon("Images/Return.png"));
				revalidate();
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
		
		
		directory.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(new DirScreen(window));
				window.pack();
				window.getContentPane().setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				directory.setIcon(new ImageIcon("Images/DormDirH.png"));
			}
			

			@Override
			public void mouseExited(MouseEvent e) {
				directory.setIcon(new ImageIcon("Images/DormDir.png"));
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
		
		window.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("X:" + e.getX() + "  Y:" + e.getY());
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		
			
		});
	
	}

}