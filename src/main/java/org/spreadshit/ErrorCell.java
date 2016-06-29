package org.spreadshit;

public class ErrorCell extends Cell {

	private String data;

	public ErrorCell(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
