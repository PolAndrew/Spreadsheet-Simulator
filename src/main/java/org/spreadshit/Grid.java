package org.spreadshit;

import java.util.ArrayList;
import java.util.HashMap;

public class Grid {

	int a;
	private HashMap<Integer, ArrayList<Cell>> table = new HashMap<>();

	public HashMap<Integer, ArrayList<Cell>> getTable() {
		return table;
	}

	public void setTable(HashMap<Integer, ArrayList<Cell>> table) {
		this.table = table;
	}

	public Grid(HashMap<Integer, ArrayList<Cell>> table) {
		super();
		this.table = table;
	}

	@Override
	public String toString() {
		return "Grid [table=" + table + "]";
	}

}
