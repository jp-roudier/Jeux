package ge.drawing;

import java.awt.Graphics;
import java.awt.Rectangle;


public interface IDrawable {
	/**
	 * @post: configuration de g inchang�e
	 */
	public abstract void draw(Graphics g);

	/**
	 * @return le rectangle  qui contient compl�tement this.
	 */
	public abstract Rectangle getRectangle();
}