package edu.lfa.GDA.command;

import java.io.IOException;

public class RunCommand extends GameCommand {

	public void execute(String[] tokens) throws IOException {
		System.out.println("Do you really want to exit [Y/N]? ");
		
		if (reader.readLine().equalsIgnoreCase("y")) {
			System.exit(0);
		}

	}

}
