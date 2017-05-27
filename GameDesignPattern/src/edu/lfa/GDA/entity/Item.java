package edu.lfa.GDA.entity;

public class Item {
	private String name;
	private int points;

	public Item() {
	}
	
	

	public Item(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}



	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Item [name=" + name + ", points=" + points + "]";
	}
	
	

}
