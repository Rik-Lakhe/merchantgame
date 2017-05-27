package edu.lfa.GDA.command;

import java.io.IOException;

import edu.lfa.GDA.entity.Item;

public class SellCommand extends GameCommand {

	public void execute(String[] tokens) throws IOException {
		if (tokens.length > 1) {
			int tempPoint = 0;
			int playPoint = player.getPoints();
			if (tokens[1].equalsIgnoreCase("all")) {
				{
					while(player.getBag().getAll()!=null){
					for (Item ib : player.getBag().getAll()) {
						int point = ib.getPoints();
						String tempItem = ib.getName();
						tempPoint = tempPoint + point;
						player.getBag().delete(ib);
					}
					}
					playPoint = playPoint + tempPoint;
					player.setPoints(playPoint);
				}

			}else if(getItemByName(tokens[1])!= null){
				System.out.println("Do you really want to sell [Y/N] ?" + getItemByName(tokens[1]));
				if (reader.readLine().equalsIgnoreCase("y")) {
					player.getBag().delete(getItemByName(tokens[1]));
					playPoint = playPoint + getItemByName(tokens[1]).getPoints();
					player.setPoints(playPoint);

				} else {
					System.out.println("Not enough parameters.");
				}

			}
		} else {
			System.out.println("not enough parameters!!");
		}
	}

}
