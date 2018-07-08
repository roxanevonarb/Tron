package model;
/**
 * <h1>The Rider (lightcycle) Interface</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
import java.util.ArrayList;

public interface IRider extends IElements{

	public void move();

	public ArrayList<IElements> getParticles();
	public void turnLeft();
	public void turnRight();

	public boolean isAlive();

	
	
}
