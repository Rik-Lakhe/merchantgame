package edu.lfa.GDA.DAO;

import java.util.List;

import edu.lfa.GDA.entity.Item;

public interface ItemDAO {
	boolean insert(Item item);
	boolean delete(Item item);
	List<Item> getAll();
	Item getByName(String name);
	boolean delAll();
}
