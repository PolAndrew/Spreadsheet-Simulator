package org.spreadshit;

public class LabelCell extends Cell {

	private String data;

	public LabelCell(String data) {

		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
