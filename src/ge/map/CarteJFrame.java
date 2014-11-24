package ge.map;

import java.awt.BorderLayout;
import java.awt.Color;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CarteJFrame extends JFrame {

	public CarteJFrame(int[][] _tab){                
		this.setTitle("=== Tile Game ===");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);               
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton bouton = new JButton("Mon bouton");
		bouton.setSize(50,20);
		
		JPanel container = new JPanel();
		CaseJPanel myPlateau = new CaseJPanel(_tab);
		
		container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    container.add(bouton, BorderLayout.NORTH);
	    container.add(myPlateau, BorderLayout.CENTER);
	   
	    
		/*CaseSupp myTestSupp = new CaseSupp();
		container.add(myTestSupp, BorderLayout.CENTER);*/
	    
		//this.setContentPane(container);
	    //this.getContentPane().add(bouton);
		this.getContentPane().add(container);
		
				
		this.setVisible(true);
	}     
}