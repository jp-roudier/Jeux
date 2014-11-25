package ge.map;


import ge.drawing.CaseDrawable;
import ge.drawing.CircleDrawable;
import ge.drawing.GUIHelper;
import ge.drawing.IDrawable;
import ge.drawing.JCanvas;
import ge.drawing.MoveDrawableMouseListener;
import ge.drawing.RectangleDrawable;
import ge.drawing.listeners.NonOverlapMoveAdapter;
import ge.main.Hero;
import ge.main.Personnage;
import ge.main.Pnj;

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
	
	//public int[][] testPlayerCase;
	
	public int[][] tabCases;
	public CarteJFrame carte;
	
	public JCanvas jc = new JCanvas();
	
	CaseDrawable[] tCases = {};
	
	public int _caseWidth = 20;
	public Dimension _size 	= new Dimension(_caseWidth,_caseWidth);
	
	//public IDrawable _player;
	public CaseDrawable _player;
	public CaseDrawable _pnj;	

	public Carte(int _width, int _height){
		tabCases = new int[_width][_height];
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
	
	public void addSprite(int _X, int _Y){
	    //IDrawable _player 	= new CaseDrawable(Color.BLUE,new Point(_caseWidth*_X,_caseWidth*_Y),_size, "P");
		_player 	= new CaseDrawable(Color.BLUE,new Point(_caseWidth*_X,_caseWidth*_Y),_size, "P");
	    jc.addDrawable(_player);Point p =new Point();
	    
	    
	}
	
	public void addSpritePnj(int _X, int _Y){
	    _pnj 		= new CaseDrawable(Color.ORANGE,new Point(_caseWidth*_X,_caseWidth*_Y),_size, "E");
		jc.addDrawable(_pnj);
	}
	
	
	
	
	
	public void drawCanvas() {
		
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400,300));

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
	    
		//new MoveDrawableMouseListener(jc);
		new NonOverlapMoveAdapter(jc);
		GUIHelper.showOnFrame(jc,"test JCanvas");
		
	}
	

}
