package org.spreadshit;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Factory {
	Pattern pattern = Pattern.compile("\t");
	Pattern expressPat=Pattern.compile("^=");
	Pattern labelPat=Pattern.compile("^'");
	Pattern numberPat=Pattern.compile("\\d");
	String[] dataFromScan=pattern.split(Scan.scStr());
	
	public Cell createCell(String s){
		if(expressPat.matcher(s) != null){
			return new ExpressionCell(s);
			
		}else if(labelPat.matcher(s) != null){
			return new LabelCell(s);
		}else if(numberPat.matcher(s) != null){
			Integer i=Integer.parseInt(s);
			return new NumberCell(i);
		}else {
				return new ErrorCell(s);
		}

	}
	
	public ArrayList<Cell> cellWithData(String[] dataFromScan){
		ArrayList<Cell> cellData=new ArrayList<>();
		
		for (String i : dataFromScan) {
			cellData.add(createCell(i));
		}
		
		
		return  cellData;
		
		
		
		
	}

}
