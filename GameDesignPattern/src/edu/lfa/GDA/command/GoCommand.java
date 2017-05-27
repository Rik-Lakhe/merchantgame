package edu.lfa.GDA.command;

import java.io.IOException;
import java.util.List;

import edu.lfa.GDA.entity.Item;

public class GoCommand extends GameCommand {
	public List<Item> items;
	String[] direction = {"left","right","forward","back"};
	public void execute(String[] tokens) throws IOException {

		if(!hasDirection(tokens[1])){
			System.out.println("Not a direction");
		}else{
			switch(tokens[1].toLowerCase()){
			case "right":
				Item item1 = randItem();
				System.out.println("Found "+item1.getName());
				System.out.println("Points needed to pick : "+item1.getPoints());
				break;
			case "left":
				Item item2 = randItem();
				System.out.println("Found "+item2.getName());
				System.out.println("Points needed to pick : "+item2.getPoints());
				break;
			case "forward":
				Item item3 = randItem();
				System.out.println("Found "+item3.getName());
				System.out.println("Points needed to pick : "+item3.getPoints());
				break;
			case "back":
				Item item4 = randItem();
				System.out.println("Found "+item4.getName());
				System.out.println("Points needed to pick : "+item4.getPoints());
				break;
			}
		}

	}
	
	private boolean hasDirection(String key){
		for(int i =0; i< direction.length;i++){
			if(direction[i].equalsIgnoreCase(key)){
				return true;
			}
		}return false;
	}
		
	
}
