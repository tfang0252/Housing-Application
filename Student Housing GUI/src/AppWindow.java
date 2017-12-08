import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AppWindow extends JFrame {

	//protected static JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow frame = new AppWindow();
					frame.setVisible(true);
					frame.setBounds(250, 20, 1000, 690);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * sets a basic frame that determines the size
	 * of the intial frame and backgound image.
	 */
	private void initialize() {	
		JFrame frame = this;
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Images/Background.png"));
		setTitle("Student Housing");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
	
		//frame ,
		getContentPane().removeAll();
		getContentPane().add(new StudentHousing(frame));
		pack();
		getContentPane().setVisible(true);	
		
	}

}
