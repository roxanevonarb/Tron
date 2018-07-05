package model;

public enum Direction {

	NORD,EST,SUD,OUEST;
	
	public Direction getNext() {
	     return this.ordinal() < Direction.values().length - 1
	         ? Direction.values()[this.ordinal() + 1]
	         : null;
	   }
}
