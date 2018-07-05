package model;

import java.awt.Color;

public class Grid {
	
	
	private Rider rider1;
	private Rider rider2;
	private int width = 600;
	private int height = 400;
	private int nbCelsHeight=40;
	private int nbCelsWidth=60;
	
	
	
	public Grid () {
		this.rider1= new Rider(2,2,Color.red,Direction.EST);
		this.rider2= new Rider(30,30,Color.cyan,Direction.OUEST);
	}
	
}
