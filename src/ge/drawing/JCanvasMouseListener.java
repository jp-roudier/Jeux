
package ge.drawing;

import java.awt.event.*;

import javax.swing.SwingUtilities;


public class JCanvasMouseListener extends MouseAdapter {
	protected JCanvas canvas;

	public JCanvasMouseListener(JCanvas canvas) {
		super();
		this.canvas = canvas;
		canvas.addMouseListener(this);
	}
		
	public JCanvas getCanvas() {
		return canvas;
	}

	public void mouseClicked(MouseEvent e) {
		
		if (SwingUtilities.isLeftMouseButton(e)) {
			leftClickAction(e);
		} else {
			rightClickAction(e);
		}
	}

	protected void rightClickAction(MouseEvent e) {}

	protected void leftClickAction(MouseEvent e) {}
}