package com.itemtwo;

import java.util.Scanner;

public class ItemTwo {
	
	public int itemTwo() {
		int n = 5;
		int F_0=1,F_1=1;
		int F_n=0;
		for (int i=1; i<n; i++){
			F_n=F_0+F_1;
			F_0=F_1;
			F_1=F_n;
		}
		return F_n;
	}
	
}
