package com.itemfourtest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.itemfour.ItemFour;

public class ItemFourTest {
	@Test
	public void itemFourTest() {
		ItemFour itemFour = new ItemFour();
		assertEquals(4,itemFour.itemFour(),0);
	}
}
