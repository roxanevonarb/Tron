package model;
/**
 * <h1>The  Element Interface</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
import java.awt.Color;
import java.util.Observer;



public interface IElements {
	public int getX();
	public int getY();
	public Color getColor();
	void addObserver(Observer o);

	
	
	

}
