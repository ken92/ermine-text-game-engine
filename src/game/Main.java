package game;
import javax.swing.SwingUtilities;

public class Main {
	private static int SCREENWIDTH = 900;
	private static int SCREENHEIGHT= 50;
	
	public Main() {}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Game game = new Game(SCREENWIDTH, SCREENHEIGHT);
				game.startGame();
			}
		});
	}
}











/*
package game;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	JTextArea mainTextArea = new JTextArea(10, 30);
	JPanel actionsArea = new JPanel();
	
	public void setMainTextAreaText(String str) {
		mainTextArea.setText(str);
	}
	
	public Main() {
		super();
		mainTextArea.setEditable(false);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setLineWrap(true);
		
		JScrollPane scroll = new JScrollPane(mainTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(scroll, BorderLayout.CENTER);
		add(actionsArea, BorderLayout.SOUTH);
    }

	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Main frame = new Main();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.pack();
				frame.setVisible(true);
				frame.setResizable(false);
				
				frame.setMainTextAreaText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean magna leo, sollicitudin ultricies ornare quis, aliquet non odio. Praesent laoreet fermentum libero vel condimentum. Vivamus auctor condimentum ex, non rutrum dui lacinia in. Nullam non elit venenatis, faucibus eros ut, bibendum leo. Quisque bibendum mauris magna, et aliquam lacus elementum a. Mauris ut elit molestie, porttitor tortor eu, mollis ex. Vestibulum nec ipsum laoreet, rhoncus turpis sed, imperdiet purus. Phasellus mollis luctus nulla, ac porttitor dolor efficitur id. Donec ac maximus metus. Sed vestibulum tincidunt mi, ac accumsan velit ultrices at. Suspendisse ornare et diam eget faucibus. Suspendisse potenti. Aliquam risus sem, aliquet nec velit eget, accumsan iaculis ex. Donec placerat nulla nulla, nec eleifend nibh malesuada sed. Phasellus nisi nibh, dictum id maximus ac, cursus id nunc.\n\n"+
				"Nunc ullamcorper finibus diam, ut tristique neque mollis et. Duis quis augue sagittis, mollis lectus eu, finibus felis. Vestibulum sed nisl ac purus tincidunt pulvinar. Curabitur nec mi vel orci suscipit bibendum. Donec nec neque et metus laoreet suscipit in in nisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus maximus ante faucibus magna aliquam sagittis. Etiam aliquet felis tellus, ac eleifend justo rhoncus vitae. Fusce feugiat ipsum vestibulum sagittis commodo. Nam cursus id leo vitae rhoncus.\n\n"+"In hac habitasse platea dictumst. Sed dictum massa ultricies sapien interdum finibus. Fusce tempus lorem at nunc bibendum, in sagittis sapien dignissim. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Phasellus commodo tempor lobortis. Etiam at arcu ut quam euismod consequat. Fusce vulputate leo sit amet ex interdum, eget laoreet libero mollis. Suspendisse ultricies, tellus sed maximus volutpat, urna ex laoreet leo, vel egestas lorem arcu ut libero.\n\n"+
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur ut urna arcu. Sed a lacus convallis, pretium dui sed, luctus enim. Morbi ultricies volutpat quam, vitae malesuada quam suscipit sed. Vestibulum quis eros condimentum, iaculis lacus quis, ultricies felis. Mauris suscipit mattis fringilla. In eget risus convallis sapien maximus congue. Integer sit amet lorem eu odio tincidunt congue. Aenean ex justo, malesuada quis tempor a, lacinia et arcu. Aliquam hendrerit tortor nec neque aliquet ultricies.\n\n"+
				"Cras nec tempus eros. Ut et nulla dui. Cras quis eros suscipit, imperdiet urna a, condimentum tellus. Donec nisl diam, mattis at tincidunt et, aliquet vel est. Pellentesque condimentum mauris lobortis pellentesque egestas. Donec luctus pulvinar nibh, ut gravida neque. Proin eleifend pulvinar libero.");
			}
		});
	}
}
*/
