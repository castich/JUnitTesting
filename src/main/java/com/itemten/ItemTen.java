package com.itemten;

public class ItemTen {
	static int value = 10;
	static boolean a,b,c;
	public void tenA() {
		double count;
		int limit;
		count = 9.0;
		limit = 43/4;
		for (; count <= limit; count = count + 0.5){
			System.out.println ("in for:" + count);
		}
		System.out.println ("after for" + count);
	}
	
	public void tenB() {
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		System.out.println("-----");
		int value = 30;
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
	}
	
	private int p1(int input){
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}
	private int p2(int input){
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}
	
	public void tenC() {
		int value = 5;
		int value2 = 1;
		while (value2 < 4){
			for (;value >= value2; value--){
				System.out.println("*");
			}
			value2++;
		}
	}
	
	public void tenD() {
		a = true;
		b = false;
		c = false;
		System.out.println (a + ", " + b + ", " + c);
		do{
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + ", " + b + ", " + c);
		}
		while ( a || b || c);
	}
	
	public void tenE() {
		int one = 1;
		int two = 2;
		int three = 3;
		do
		{
			one++;
			System.out.print("cart");
		}while ( one < 3);
		
		for (int i = 0; i < two; i++){
			System.out.print("o");
		}
		while (true){
			three++;
		if (three == 5){
			break;
		}
			System.out.print("n");
		}
	}
}
