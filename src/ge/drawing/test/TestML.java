
package ge.drawing.test;

import ge.drawing.IDrawable;
import ge.drawing.JCanvas;
import ge.drawing.JCanvasMouseListener;
import ge.drawing.RectangleDrawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;




public class TestML extends JCanvasMouseListener {

	public TestML(JCanvas canvas) {
		super(canvas);

	}

	protected void rightClickAction(MouseEvent e) {
		List selectedDrawables = canvas.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0)
			return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		canvas.removeDrawable(drawable);
	}


	protected void leftClickAction(MouseEvent e) {
		Point p = e.getPoint();
		IDrawable rect = createDrawable(e);
		if (canvas.isFree(rect.getRectangle())) {
			canvas.addDrawable(rect);
		}

	}

	private IDrawable createDrawable(MouseEvent e) {
		Point p = e.getPoint();
		Dimension dim = new Dimension(40, 40);
		return new RectangleDrawable(Color.RED, p, dim);

	}

}
