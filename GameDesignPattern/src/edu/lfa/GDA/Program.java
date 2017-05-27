package edu.lfa.GDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import edu.lfa.GDA.command.GameCommand;
import edu.lfa.GDA.command.GameCommandFactory;
import edu.lfa.GDA.config.DataLoader;
import edu.lfa.GDA.entity.Player;

public class Program {

	private static Scanner input;

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			input = new Scanner(System.in);
			Player player = new Player();
			DataLoader.loadItems();
			String line = "";
			player.setPoints(new Random().nextInt(100));
			System.out.println(
					"Oracle : \n    Welcome to the world to Adventure. I am the Great Oracle of Jolchel. \nI sense a great adventure with you, may i ask about you ... ...  ......");
			System.out.println("++++++++++++++++++++++++++++++++++++++\nWhat are you?\n1. Boy         2. Girl");
			int sexcho = input.nextInt();
			if (sexcho == 1) {
				player.setSex("boy");
			} else if (sexcho == 2) {
				player.setSex("girl");
			} else {
				System.out.println("Error !!!!!");
				System.exit(0);
			}
			System.out.println(player.getSex());
			System.out.println("++++++++++++++++++++++++++++++++++++++\nWhat is your name?");
			player.setName(reader.readLine());
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("\n\n\n         Welcome " + player.getName()
					+ " to the world of Lybibacon. The great world of adventure awaits you.. .... ....... \n \n \n You find yourself in middle of ");
			while (true) {
				System.out.print(player.getName() + " > ");
				line = reader.readLine();
				String tokens[] = line.split(" ");
				GameCommand cmd = GameCommandFactory.get(tokens[0].toLowerCase());
				if (cmd != null) {
					cmd.setItems(DataLoader.getItems());
					cmd.setPlayer(player);
					cmd.setReader(reader);
					cmd.execute(tokens);
					
				} else {
					System.out.println("Invalid Command!");
				}

			}

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}

}
