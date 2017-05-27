package edu.lfa.GDA.command;

import java.io.IOException;

public class BagCommand extends GameCommand {

	public void execute(String[] tokens) throws IOException {
		System.out.println("Your bag contains :"+player.getBag().getAll().toString());

	}

}
