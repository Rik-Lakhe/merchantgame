package edu.lfa.GDA.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import edu.lfa.GDA.entity.Item;
import edu.lfa.GDA.entity.Player;

public abstract class GameCommand {
	protected Player player;
	protected BufferedReader reader;
	protected List<Item> items;
	
	public void setItems(List<Item> items){
		this.items = items;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}

	public abstract void execute(String[] tokens) throws IOException;
	
	public Item randItem(){
		Random rand = new Random();
		return items.get(rand.nextInt(items.size()-1));
	}
	
	public Item getItemByName(String name){
		for(Item i : items){
			if(i.getName().equalsIgnoreCase(name)){
				return i;
			}
		}return null;
	}
}
