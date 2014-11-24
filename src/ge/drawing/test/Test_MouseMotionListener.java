
package ge.drawing.test;

import ge.drawing.CircleDrawable;
import ge.drawing.GUIHelper;
import ge.drawing.IDrawable;
import ge.drawing.JCanvas;
import ge.drawing.MoveDrawableMouseListener;
import ge.drawing.RectangleDrawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;




public class Test_MouseMotionListener {
	
	public static void main(String[] args) {
			JCanvas jc = new JCanvas();
			jc.setBackground(Color.WHITE);
			jc.setPreferredSize(new Dimension(400,200));
			Dimension dim  =new Dimension(40,60);
			IDrawable rect = new RectangleDrawable(Color.RED,new Point(10,10),dim);
			IDrawable circle = new CircleDrawable(Color.BLUE,new Point(60,30),dim);
			jc.addDrawable(rect);
			jc.addDrawable(circle);
			new MoveDrawableMouseListener(jc);
			GUIHelper.showOnFrame(jc,"test JCanvas");
		}

}
