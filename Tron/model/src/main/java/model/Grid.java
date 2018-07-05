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
		this.rider1= new Rider(2,2,Color.red,Direction.EST,this);
		this.rider2= new Rider(30,30,Color.cyan,Direction.OUEST,this);
	}
	
	
	public boolean checkColision(Rider rider) {
		if(rider.getX()>this.nbCelsWidth || rider.getX()<=0 || rider.getY()<=0 || rider.getY()>this.nbCelsHeight) {rider.setAlive(false); return true;} 
		
		for (Particles particle : rider1.getParticles()) {
			if(rider.getX() == particle.getX() && rider.getY() == particle.getY()) {rider.setAlive(false);return true;}
		}
		
		for (Particles particle : rider2.getParticles()) {
			if(rider.getX() == particle.getX() && rider.getY() == particle.getY()) {rider.setAlive(false);return true;}
	
	}
		return false;
	
}
}
