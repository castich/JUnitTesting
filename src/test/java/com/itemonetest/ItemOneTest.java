package com.itemonetest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itemone.ItemOne;

public class ItemOneTest {
	@Test
	public void itemOneTest() {
		ItemOne itemOne = new ItemOne();
		assertEquals(3, itemOne.itemOne(),0);
	}

}
