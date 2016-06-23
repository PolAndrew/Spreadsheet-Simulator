package org.spreadshit;

public class NumberCell extends Cell{
	
	
	private int data;

	
	public NumberCell(int row, String col, int data) {
		super(row, col);
		this.data = data;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}

	
	
	
}
