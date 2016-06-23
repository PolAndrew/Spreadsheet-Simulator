package org.spreadshit;

import java.util.ArrayList;

public abstract class Cell {
	private int row;
	private String col;
	
	private ArrayList<Cell> cellsrow=new ArrayList<>();
	
	
	public Cell(int row, String col) {
		
		this.row = row;
		this.col = col;
		
	}
		

	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}


	public ArrayList<Cell> getCellsrow() {
		return cellsrow;
	}


	public void setCellsrow(ArrayList<Cell> cellsrow) {
		this.cellsrow = cellsrow;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((col == null) ? 0 : col.hashCode());
		result = prime * result + row;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (col == null) {
			if (other.col != null)
				return false;
		} else if (!col.equals(other.col))
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	

	
	
	
}
