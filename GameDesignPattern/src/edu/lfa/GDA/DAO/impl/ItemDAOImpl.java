package edu.lfa.GDA.DAO.impl;

import java.util.List;

import edu.lfa.GDA.DAO.ItemDAO;
import edu.lfa.GDA.entity.Item;

public class ItemDAOImpl implements ItemDAO{
	List<Item> items;
	
	
	
	public ItemDAOImpl(List<Item> items) {
		this.items = items;
	}

	@Override
	public boolean insert(Item item) {
		
		return items.add(item);
	}

	@Override
	public boolean delete(Item item) {
		
		return items.remove(item);
	}

	@Override
	public List<Item> getAll() {
		return items;
	}

	@Override
	public Item getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delAll() {
		items.removeAll(items);
		
		
		
		return false;
	}

}
