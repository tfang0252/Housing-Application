import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppWindow extends JFrame {

	protected JFrame frame;
	protected JPanel panel;

	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * sets a basic frame that determines the size
	 * of the intial frame and backgound image.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Background.png"));
		frame.setBounds(250, 20, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}

}
