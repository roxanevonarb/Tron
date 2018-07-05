package model;

import java.awt.Color;

public class Grid {
	
	
	private Rider rider1;
	private Rider rider2;
	private int width = 600;
	private int height = 400;
	private int nbCelsHeight=40;
	private int nbCelsWidth=60;
	private Elements elements[][] = new Elements[60][40];
	
	
	public Grid () {
		this.rider1= new Rider(2,2,Color.RED,Direction.EST);
		this.rider1= new Rider(2,2,Color.RED,Direction.EST);
		
		
		
	}
	

}
