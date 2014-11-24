
package ge.drawing.listeners;

import ge.drawing.JCanvas;
import ge.drawing.MoveDrawableMouseListener;

import java.awt.Point;
import java.awt.event.MouseEvent;




public class NonOverlapMoveAdapter extends MoveDrawableMouseListener{
	
	private Point initialLocation;

	/**
	 * @param canvas
	 */
	public NonOverlapMoveAdapter(JCanvas canvas) {
		super(canvas);
		
	}

	
	public void mouseReleased(MouseEvent e) {
		if(drawable== null) return ;
		if( !canvas.isAlone(drawable)){
			drawable.setPosition(initialLocation);

		}
		initialLocation =null;
		drawable=null;
		canvas.repaint();
	}


	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		if(drawable!=null) {
			initialLocation=drawable.getPosition();
		}
	}

}
