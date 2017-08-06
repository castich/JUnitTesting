package com.itemonetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.itemone.ItemOne;

public class ItemOneTest {
	@Test
	public void itemOneTest() {
		ItemOne itemOne = new ItemOne();
		String result = "131750";
		assertEquals(result,itemOne.itemOne());
	}

}
