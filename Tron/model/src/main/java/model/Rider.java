package model;

import java.awt.Color;
import java.util.ArrayList;

public class Rider extends Elements implements IRider{
	private Direction direction;
	public ArrayList<IElements> particles = new ArrayList<IElements>();
	boolean alive = true;
	public Grid grid;

public Rider(int x, int y, Color color , Direction direction,Grid grid) {
		super(x, y, color);
		this.direction=direction;
		this.grid=grid;
		// TODO Auto-generated constructor stub
	}




public void move() {
	this.particles.add(0, new Particles(this.x, this.y, this.color));
	switch(this.direction) {
	case EST: this.setX(this.x+1);
		break;
	case NORD: this.setY(this.y-1);
		break;
	case OUEST: this.setX(this.x-1);
		break;
	case SUD: this.setY(this.y+1);
		break;
	default:
		break;
	}
	grid.checkColision(this);
	
}




public boolean isAlive() {
	return alive;
}




public void setAlive(boolean alive) {
	this.alive = alive;
}




@Override
public ArrayList<IElements> getParticles() {
	// TODO Auto-generated method stub
	return particles;
}




	


	
	

	
}
