package com.itemthree;

public class ItemThree {

	public int itemThree(int inner, int outer, int result) {
		for (int i=0; i < outer; i++){
			for (int j=0; j < inner; j++){
				result = (result*result)+1;
			}
		}
		return result;
	}
	
}
