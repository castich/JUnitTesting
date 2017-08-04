package com.itemfour;

public class ItemFour {

	public int itemFour() {
		int helloCount = 0;
		int x = 3;
		int y = 10;
		
		while (x < y){
			helloCount++;
			x = x + 1;
			y = y - 1;
		}
		return helloCount;
	}
}
