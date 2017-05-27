package edu.lfa.GDA.entity;

import java.util.ArrayList;

import edu.lfa.GDA.DAO.ItemDAO;
import edu.lfa.GDA.DAO.impl.ItemDAOImpl;

public class Player {
	private String name,sex;
	private ItemDAO bag = new ItemDAOImpl(new ArrayList<>());
	private int points;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ItemDAO getBag(){
		return bag;
	}
}
