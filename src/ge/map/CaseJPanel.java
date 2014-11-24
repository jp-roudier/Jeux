package ge.map;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CaseJPanel extends JPanel {
	
	private int _caseWidth = 20;
	private int _textDeltaX = 6;
	private int _textDeltaY = 15;
	
	int[][] caseTab;
	
	public CaseJPanel(int[][] _tab){
		System.out.println("=== CASE GFX === " + _tab); 
		
		caseTab = new int[_tab.length][_tab[0].length];
		caseTab = _tab;
		
		
		// TRACE CARTE sur CONSOLE ---------------------------------------------
		String[] __caseOutPut;
		__caseOutPut = new String[8];
		
		
		for (int i = 0; i < _tab.length; i++) {
			for (int j = 0; j < _tab[i].length; j++) {
				if (__caseOutPut[j] == null) __caseOutPut[j] = "";
				__caseOutPut[j] += String.valueOf(_tab[i][j]);
				//System.out.println("=== Tile Cases ["+i+"]["+j+"]=> " + _tab[i][j]);
			}
		}
		
		for (int i = 0; i < __caseOutPut.length; i++) {
			System.out.println("__caseOutPut = " + __caseOutPut[i]);
		}
		// ---------------------------------------------------------------------
	}

	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("caseGfx !"); 

		int _numCase = 1;
	    int _posX = 0;
	    int _posY = 0;
	    
	    System.out.println("!!!!! caseTab "+caseTab[4][4]);
	    
	    for (int i = 0; i < caseTab.length; i++) {
	    	_posX = i;
	    	
		    for (int j = 0; j < caseTab[i].length; j++) {
		    	_posY = j;
		    	
		    	if (caseTab[i][j] == 0) {
		    		g.setColor(Color.green);
				}else {
					g.setColor(Color.red);
				}
		    	
		    	g.fillRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
		    	g.setColor(Color.black);
		    	g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
		    	g.setColor(Color.gray);
		    	g.drawString(String.valueOf(caseTab[i][j]), (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
		    	
		    	_numCase++;
			}
			
		}
	    
	    drawCasePlayer(g);
	    drawCasePnj(g);
	}  
	
	public void drawCasePlayer(Graphics g){
		System.out.println("!!! caseSupp !!!"); 
	    
	    int _posX = 2;
	    int _posY = 6;
	    
	    g.setColor(Color.blue);
	    
	    g.fillRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    g.setColor(Color.black);
	    g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    g.setColor(Color.white);
	    g.drawString("P", (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
		
	}
	
	public void drawCasePnj(Graphics g){
		System.out.println("!!! caseSupp !!!"); 
	    
	    int _posX = 6;
	    int _posY = 4;
	    
	    g.setColor(Color.orange);
	    
	    g.fillRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    g.setColor(Color.black);
	    g.drawRect(_posX*_caseWidth, _posY*_caseWidth, _caseWidth, _caseWidth);
	    //g.setColor(Color.white);
	    g.drawString("E", (_posX*_caseWidth)+_textDeltaX, (_posY*_caseWidth)+_textDeltaY);
		
	}
}

