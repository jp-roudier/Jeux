package ge.map;

import java.awt.Graphics;
import javax.swing.JPanel;

public class CaseSupp extends JPanel {
	
	private int _caseWidth = 20;
	private int _textDeltaX = 3;
	private int _textDeltaY = 15;
	


	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("caseSupp !"); 
	    
	    int _numCase = 1;
	    int _posX = 12;
	    int _posY = 6;
	    
	    g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    g.drawString("tt", (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
	    

	}   
}

