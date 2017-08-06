package com.itemseventest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itemseven.ItemSeven;

public class ItemSevenTest {
	
	@Test
	public void itemSeven() {

		ItemSeven seven = new ItemSeven();
		String res7 = seven.itemSeven(60);
		assertEquals("62311025",res7);
	}
	
}
