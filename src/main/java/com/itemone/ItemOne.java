package com.itemone;

public class ItemOne {

	public String itemOne() {
		StringBuilder result = new StringBuilder();
		
		int i=1;
		for (int j=0; j<5;j=j+2){
			i= (i*i) +j;
		}
		
		switch (i){
		case 3:
			result.append("3");
			break;
		case 13:
			result.append("13");
		case 175:
			result.append("175");
		default:
			result.append("0");
		}
		
		return result.toString();

	}

}
