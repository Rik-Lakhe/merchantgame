package edu.lfa.GDA.command;

import java.io.IOException;

import edu.lfa.GDA.entity.Item;

public class PickCommand extends GameCommand {

	public void execute(String[] tokens) throws IOException {
		
		if(tokens.length>1){
		Item item = getItemByName(tokens[1]);
			if(item!=null){
				if(item.getPoints()<= player.getPoints()){
					player.getBag().insert(item);
				}else{
					System.out.println("Not enough points");
				}
			}
		}else{
			System.out.println("not enough parameters!!");
		}
	}

}
