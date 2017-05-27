package edu.lfa.GDA.command;

import java.util.HashMap;
import java.util.Map;

public class GameCommandFactory {
	private static Map<String, GameCommand> commands = initcommands();
	
	private static Map<String, GameCommand> initcommands(){
		Map<String, GameCommand> cmd = new HashMap<>();
		cmd.put("exit", new ExitCommand());
		cmd.put("go", new GoCommand());
		cmd.put("run",new RunCommand());
		cmd.put("pick", new PickCommand());
		cmd.put("jump", new JumpCommand());
		cmd.put("point", new PointCommand());
		cmd.put("bag", new BagCommand());
		cmd.put("sell", new SellCommand());
		return cmd;
	}
	public static GameCommand get(String key){
		return(commands.containsKey(key))?commands.get(key):null;
	}
}
