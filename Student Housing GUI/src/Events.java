import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Events extends MainScreen{
	
	private JInternalFrame evePane;
	
	public Events(JFrame window){
			
			super(window);
			this.remove(BwhiteBox);
			this.remove(blueBackground);
			
		 Browser browser = new Browser();
		 BrowserView browserView = new BrowserView(browser);
		 
		 evePane = new JInternalFrame();
		 evePane.setForeground(Color.WHITE);
		 evePane.setBounds(270, 70, 715, 580);
			
		 evePane.add(browserView, BorderLayout.CENTER);
		 
		

		 BasicInternalFrameUI bi = (BasicInternalFrameUI)evePane.getUI();
			bi.setNorthPane(null);
			evePane.setVisible(true);
		
			add(evePane);

				//this.add(BwhiteBox);
			browser.loadURL("https://webviewer.collegenet.com/wv3_servlet/fgcu/urd/run/wv_event.DayList?evdt=2017121100000000,evfilter=54138");
				blueBackground = new JLabel("");
				blueBackground.setBounds(-30, -0, 1034, 683);
				blueBackground.setIcon(new ImageIcon("Images/BlueBG3.png"));
				add(blueBackground);

		/*
		 setLayout(new FlowLayout());
		this.add(browserView);
		//setPreferredSize(new Dimension(1000, 665));
		this.setPreferredSize(new Dimension(1000,665));
		setVisible(true);
		*/
				
		
	}
}
