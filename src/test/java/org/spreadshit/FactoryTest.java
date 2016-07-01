package org.spreadshit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {
	@Test
	public void testCreateCell() {
		Factory factory = new Factory();
		assertTrue("string cell created", factory.createCell("'Some cell") instanceof LabelCell);
		assertTrue("number created", factory.createCell("123") instanceof NumberCell);
		assertTrue("float number created", factory.createCell("123.25") instanceof NumberCell);
		assertTrue("expression cell created", factory.createCell("=A1+5+B1") instanceof ExpressionCell);
		assertTrue("error cell created", factory.createCell("124BB") instanceof ErrorCell);
		assertTrue("error cell created", factory.createCell("=A1--B2w") instanceof ErrorCell);
	}
	
	public void testcreatGrid(){
		Factory factory=new Factory();
		List<String> cells = new ArrayList();
		cells.add("'ABC\t22\t35");
		cells.add("12\t333\t800");
		Grid grid = factory.createGrid(cells);
		assertTrue("Expect cells created ok", grid.getCellAt(2, B) instanceof NumberCell);
		
		
		
	}
	
}
