package com.itemtwotest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itemtwo.ItemTwo;

public class ItemTwoTest {
	@Test
	public void itemTwoTest() {
		ItemTwo two = new ItemTwo();
		assertEquals(8,two.itemTwo(),0);
	}
	
}
