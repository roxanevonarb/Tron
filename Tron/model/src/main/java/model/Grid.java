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


	public Rider getRider1() {
		return rider1;
	}


	public void setRider1(Rider rider1) {
		this.rider1 = rider1;
	}


	public Rider getRider2() {
		return rider2;
	}


	public void setRider2(Rider rider2) {
		this.rider2 = rider2;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getNbCelsHeight() {
		return nbCelsHeight;
	}


	public void setNbCelsHeight(int nbCelsHeight) {
		this.nbCelsHeight = nbCelsHeight;
	}


	public int getNbCelsWidth() {
		return nbCelsWidth;
	}


	public void setNbCelsWidth(int nbCelsWidth) {
		this.nbCelsWidth = nbCelsWidth;
	}
	
	
	
	
	
	
	
	
	
}
