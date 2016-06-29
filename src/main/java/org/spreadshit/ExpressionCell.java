package org.spreadshit;

public class ExpressionCell extends Cell {

	private String data;

	public ExpressionCell(String data) {

		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
