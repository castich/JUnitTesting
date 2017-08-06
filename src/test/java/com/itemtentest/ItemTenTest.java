package com.itemtentest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itemten.ItemTen;

public class ItemTenTest {

	ItemTen ten = new ItemTen();
	
	@Test
	public void tenA() {
		assertEquals(11.0, ten.tenA(), 0);
	}
	

	@Test
	public void tenB() {
		assertEquals("20120", ten.tenB());
	}
	

	@Test
	public void tenC() {
		assertEquals(5, ten.tenC(), 0);
	}
	

	@Test
	public void tenD() {
		String res = "true, false, falsetrue, true, falsefalse, true, falsefalse, false, false";
		assertEquals(res, ten.tenD());
	}
	

	@Test
	public void tenE() {
		assertEquals("cartcartoon", ten.tenE());
	}

}
