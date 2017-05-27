package edu.lfa.GDA.config;

import java.util.ArrayList;
import java.util.List;

import edu.lfa.GDA.entity.Item;

public class DataLoader {
	
	private static List<Item> items = new ArrayList<>();
	public static void loadItems(){
		items.add(new Item("Gun",5000));
		items.add(new Item("Apple",50));
		items.add(new Item("Coin",20));
		items.add(new Item("Momo",40));
		items.add(new Item("Ring",500));
		items.add(new Item("Burger",30));
	}
	public static List<Item> getItems(){
			return items;
	}
	
}
