package org.spreadshit;

public class ExpressionCell extends Cell {

	private String data;

	public ExpressionCell(int row, String col, String data) {
		super(row, col);
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
