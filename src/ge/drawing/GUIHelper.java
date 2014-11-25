package ge.drawing;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class GUIHelper {
	
	public static void showOnFrame(JComponent component, String frameName) {
		JFrame frame = new JFrame(frameName);
		
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		//        frame.setSize(dim);
		
		frame.setLocationRelativeTo(frame.getParent());
		frame.addWindowListener(wa);
		frame.getContentPane().add(component);
		frame.pack();

		frame.setVisible(true);
//		frame.setResizable(false);

	}
	
	public static void showOnFrame(Component component, String frameName) {
		Frame frame = new Frame(frameName);
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		//        frame.setSize(dim);
		frame.setLocationRelativeTo(frame.getParent());
		frame.addWindowListener(wa);
		frame.add(component);
		frame.pack();

		frame.setVisible(true);
//		frame.setResizable(false);

	}

}
