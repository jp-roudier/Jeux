package ge.map;


import ge.drawing.CaseDrawable;
import ge.drawing.CircleDrawable;
import ge.drawing.GUIHelper;
import ge.drawing.IDrawable;
import ge.drawing.JCanvas;
import ge.drawing.MoveDrawableMouseListener;
import ge.drawing.RectangleDrawable;
import ge.drawing.listeners.NonOverlapMoveAdapter;

import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Carte {
	
	public int[][] tabCases;
	public CarteJFrame carte;
	
	public int _caseWidth = 20;

	public Carte(){
		tabCases = new int[8][8];
		for (int i = 0; i < tabCases.length; i++) {
			for (int j = 0; j < tabCases[i].length; j++) {
				if (i >= 2 && i <=5 && j>= 3 && j <=4) {
					tabCases[i][j] = 1;
				}else {
					tabCases[i][j] = 0;
				}
				
			}
		}

		System.out.println("=== CONSTRUCT MAP === ");
		//newWin();
		//carte = new CarteJFrame(tabCases);
		drawCanvas();
	}
	
	public void drawCanvas() {
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400,300));
		//jc.setLocationRelativeTo(null);          
		
		JButton bouton = new JButton("Mon bouton");
		bouton.setSize(50,20);
		//jc.setLayout(new BorderLayout());
	    
		
	    //container.add(myPlateau, BorderLayout.CENTER);
			
		Dimension dim  		= new Dimension(40,40);
		Dimension _size 	= new Dimension(_caseWidth,_caseWidth);
		/*IDrawable rect 		= new RectangleDrawable(Color.RED,new Point(200,10),dim);
		IDrawable circle 	= new CircleDrawable(Color.BLUE,new Point(300,30),dim);*/
		
		
		
		int _numCase = 1;
	    int _posX = 0;
	    int _posY = 0;
	    
	    for (int i = 1; i <= tabCases.length; i++) {
	    	_posX = i;
	    	
		    for (int j = 1; j <= tabCases[i-1].length; j++) {
		    	_posY = j;
		    	
		    	Color c;
		    	if (tabCases[i-1][j-1] == 0) 		c = Color.GREEN;
				else								c = Color.RED;
				
		    	
		    	
		    	Point p = new Point(_caseWidth*i,_caseWidth*j);
		    	
		    	IDrawable _case 	= new CaseDrawable(c,p,_size, String.valueOf(_numCase));
		    	jc.addDrawable(_case);
		    	_numCase++;
			}
			
		}
	    
	    IDrawable _player 	= new CaseDrawable(Color.BLUE,new Point(_caseWidth*3,_caseWidth*7),_size, "P");
	    jc.addDrawable(_player);
	    IDrawable _pnj 		= new CaseDrawable(Color.ORANGE,new Point(_caseWidth*7,_caseWidth*5),_size, "E");
		jc.addDrawable(_pnj);
		
		//jc.addDrawable(rect);
		//jc.addDrawable(circle);
		//jc.add(bouton, BorderLayout.NORTH);
		
		//new MoveDrawableMouseListener(jc);
		new NonOverlapMoveAdapter(jc);
		GUIHelper.showOnFrame(jc,"test JCanvas");
		jc.add(bouton);
		
	}
	

}
