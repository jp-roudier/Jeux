package ge.map;

import java.awt.Graphics;
import javax.swing.JPanel;

public class CaseGfx extends JPanel {
	
	private int _caseWidth = 20;
	private int _textDeltaX = 3;
	private int _textDeltaY = 15;
	
	public CaseGfx(String _t){
		System.out.println("=== CASE GFX === " + _t); 
	}

	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("caseGfx !"); 
		//g.fillOval(20, 20, 75, 75);
		
	    int x1 = this.getWidth()/2;
	    int y1 = this.getHeight()/2;   
	    int largeur = 20;
	    //g.fillOval(x1-(largeur/2), y1-(largeur/2), largeur, largeur);
	    
	    /*g.drawRect(10, 10, 50, 60);
	    g.drawString("c 1 ", 10, 20);
	    g.fillRect(65, 65, 30, 40);
	    */
	    
	    
	    int _numCase = 1;
	    int _posX = 0;
	    int _posY = 0;
	    
	    //g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    //g.drawString("0" + numCase, _textDeltaX, _textDeltaY);
	    
	    for (int i = 0; i <= 8; i++) {
	    	_posX = i;
	    	//g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
		    //g.drawString(String.valueOf(_numCase), (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
		    
		    for (int j = 0; j < 8; j++) {
		    	_posY = j;
		    	g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
		    	g.drawString(String.valueOf(_numCase), (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
		    	
		    	_numCase++;
			}
			
		}
	}   
}

