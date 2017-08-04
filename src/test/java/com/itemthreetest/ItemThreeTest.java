package com.itemthreetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.itemthree.ItemThree;

public class ItemThreeTest {
	@Test
	public void itemThreeTest() {
		ItemThree item = new ItemThree();
		assertEquals(26,item.itemThree(2, 2, 0),0);
		assertEquals(458330,item.itemThree(2, 3, 0),0);
		assertEquals(677,item.itemThree(2, 2, 1),0);
	}
	
}
