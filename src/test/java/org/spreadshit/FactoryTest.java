package org.spreadshit;

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
	}
}
