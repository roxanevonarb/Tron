package model;

import java.awt.Color;
import java.util.ArrayList;

public class Rider extends Elements{
	private Direction direction;
	private ArrayList<Particles> particles = new ArrayList<Particles>();
	boolean alive = true;

public Rider(int x, int y, Color color , Direction direction) {
		super(x, y, color);
		this.direction=direction;
		// TODO Auto-generated constructor stub
	}




public void move() {
	switch(this.direction) {
	case EST: this.setX(this.getX()+1);
		break;
	case NORD: this.setY(this.getY()-1);
		break;
	case OUEST: this.setX(this.getX()-1);
		break;
	case SUD: this.setY(this.getY()+1);
		break;
	default:
		break;
	}
	
	
	
	
	
	
}

	


	
	

	
}
