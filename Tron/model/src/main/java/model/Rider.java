package model;

import java.awt.Color;
import java.util.ArrayList;

public class Rider extends Elements{
	private Direction direction;
	private ArrayList<Particles> particles = new ArrayList<Particles>();
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




public ArrayList<Particles> getParticles() {
	return particles;
}




public void setParticles(ArrayList<Particles> particles) {
	this.particles = particles;
}

	


	
	

	
}
