package com.main;

import com.itemseven.ItemSeven;
import com.itemten.ItemTen;
import com.itemthree.ItemThree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemSeven is = new ItemSeven();
		ItemTen it = new ItemTen();
		ItemThree item3 = new ItemThree();
		int x = item3.itemThree(2, 2, 1);
		System.out.println(x);
	}

}
