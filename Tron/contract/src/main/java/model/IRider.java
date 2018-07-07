package model;

import java.util.ArrayList;

public interface IRider extends IElements{

	public void move();

	public ArrayList<IElements> getParticles();
	public void turnLeft();
	public void turnRight();

	public boolean isAlive();

	
	
}
