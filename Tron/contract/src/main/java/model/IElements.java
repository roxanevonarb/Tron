package model;

import java.awt.Color;
import java.util.Observer;



public interface IElements {
	public int getX();
	public int getY();
	public Color getColor();
	void addObserver(Observer o);

	
	
	

}
