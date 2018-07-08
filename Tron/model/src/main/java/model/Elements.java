package model;
/**
 * <h1>The Element Class</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
import java.awt.Color;
import java.util.Observable;


public class Elements extends Observable implements IElements{
	
	public Elements(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	
	protected int x;
	protected int y;
	protected Color color;
	
	
	
	@Override
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
