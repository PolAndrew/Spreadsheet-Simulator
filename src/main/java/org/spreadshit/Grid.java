package org.spreadshit;

import java.util.ArrayList;

public class Grid {

	private ArrayList<ArrayList<Cell>> table = new ArrayList<>();

	public Grid() {
	}

	public NumberCell getCellAt(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ArrayList<Cell>> getTable() {
		return table;
	}

	public void setTable(ArrayList<ArrayList<Cell>> table) {
		this.table = table;
	}
	
	public void addToTable(ArrayList<Cell> line){
		this.table.add(line);
		
	}
}
