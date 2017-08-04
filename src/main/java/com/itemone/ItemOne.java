package com.itemone;

public class ItemOne {

	public int itemOne() {
		int result = 0;
		
		int i=1;
		for (int j=0; j<5;j=j+2){
			i= (i*i) +j;
		}
		
		switch (i){
		case 3:
			break;
		case 13:
			result += 1;
		case 175:
			result += 1;
		default:
			result += 1;
		}
		
		return result;

	}

}
