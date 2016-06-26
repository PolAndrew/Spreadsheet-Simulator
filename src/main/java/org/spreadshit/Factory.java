package org.spreadshit;


import java.util.regex.Pattern;

public class Factory {
	Pattern pattern = Pattern.compile("\t");
	Pattern expressPat=Pattern.compile("^=");
	Pattern labelPat=Pattern.compile("^'");
	Pattern numberPat=Pattern.compile("\\d");
	String[] dataFromScan=pattern.split(Scan.scStr());

	
	
	

}
