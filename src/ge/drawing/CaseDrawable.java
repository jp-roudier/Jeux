
package ge.drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;


public class CaseDrawable extends FormDrawable{

	/**
	 * @param color
	 * @param pos
	 * @param dim
	 */
	private int _textDeltaX = 3;
	private int _textDeltaY = 15;
	
	private String _label;
	
	public CaseDrawable(Color color, Point pos, Dimension dim, String label) {
		super(color, pos, dim);
		_label = label;
		
	}

	/* (non-Javadoc)
	 * @see draw.Drawable#draw(java.awt.Graphics)
	 */
	public void draw(Graphics g) {
		Color c = g.getColor();
		
		//g.setColor(color);
		//g.fillRect(rect.x,rect.y,rect.height,rect.width);
		//g.setColor(c);
		
	    
	    g.setColor(color);
	    
	    g.fillRect(rect.x, rect.y, rect.height, rect.width);
	    g.setColor(Color.black);
	    g.drawRect(rect.x, rect.y, rect.height, rect.width);
	    g.setColor(Color.GRAY);
	    g.drawString(_label, (rect.x)+_textDeltaX, (rect.y)+_textDeltaY);
	}

}
