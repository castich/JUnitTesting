package com.itemseven;

public class ItemSeven {
	public double itemSeven(int intVal) {
		boolean done = false;
		int count = 1;
		int current = intVal + 2;
		while (! done){ 
			current = current / count;
			if (current % 3 == 0) 
				done = true; 
			else if (current < 1) 
				done = true; 
			else 
			count += 1; System.out.println(current); 
		}
		System.out.println (count); 
		return count;
	}
	
}
