package org.spreadshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Factory {
	private static final Pattern pattern = Pattern.compile("\t");
	private static final Pattern expressPat = Pattern.compile("^=([a-zA-Z][1-9]|[0-9]+)([+*/-]([a-zA-Z][0-9]|[0-9]+))*$");
	private static final Pattern labelPat = Pattern.compile("^'");
	private static final Pattern numberPat = Pattern.compile("\\d");
	String[] dataFromScan = pattern.split(Scan.scStr());
	List<String> line=Arrays.asList(dataFromScan);

	public Cell createCell(String s) {
		if (expressPat.matcher(s) != null) {
			return new ExpressionCell(s);

		} else if (labelPat.matcher(s) != null) {
			return new LabelCell(s);
		} else if (numberPat.matcher(s) != null) {
			Integer i = Integer.parseInt(s);
			return new NumberCell(i);
		} else {
			return new ErrorCell(s);
		}

	}

	

	public Grid CreateGrid(List<String> line) {
		Grid grid=new Grid();
		ArrayList<Cell> CellLine=new ArrayList<Cell>();
				
		for (String cell : line) {
			CellLine.add(createCell(cell));
		}
		grid.addToTable(CellLine);
		
		return grid;
	}

}
