import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class WebPage extends AppWindowPanel {
	public WebPage(JFrame window){
	
		 JEditorPane website = null;
		try {
			website = new JEditorPane("https://www2.fgcu.edu/arise/events.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      website.setEditable(false);
	      
	      window.add(new JScrollPane(website));
	      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      window.setVisible(true);
	      //window.pack();
	      
	}
}
