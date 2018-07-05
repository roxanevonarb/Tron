package model;

import java.awt.Color;
import java.util.ArrayList;

public class Rider extends Elements{


public Rider(int x, int y, Color color , Direction direction) {
		super(x, y, color);
		this.direction=direction;
		// TODO Auto-generated constructor stub
	}
private Direction direction;
private ArrayList<Particles> particles = new ArrayList<Particles>();
	
	
	

	
}
