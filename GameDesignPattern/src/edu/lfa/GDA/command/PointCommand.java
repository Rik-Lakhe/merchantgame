package edu.lfa.GDA.command;

import java.io.IOException;

public class PointCommand extends GameCommand {

	public void execute(String[] tokens) throws IOException {
		System.out.println("You have "+player.getPoints()+" points");

	}

}
