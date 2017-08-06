package com.itemten;

public class ItemTen {
	static int value = 10;
	static boolean a,b,c;
	public float tenA() {
		float count;
		float limit;
		count = 9;
		limit = 43/4f;
		for (; count <= limit; count = count + 0.5f){
			System.out.println ("in for:" + count);
		}
		System.out.println ("after for" + count);
		return count;
	}
	
	public String tenB() {
		
		StringBuilder result =  new StringBuilder();
		String globalValue, localValue;
		
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		System.out.println("-----");
		result.append(value);
		int value = 30;
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		result.append(value);
		
		return result.toString();
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
	
	public int tenC() {
		int value = 5;
		int value2 = 1;
		int resultCounter=0;
		while (value2 < 4){
			for (;value >= value2; value--){
				System.out.println("*");
				resultCounter++;
			}
			value2++;
		}
		return resultCounter;
	}
	
	public String tenD() {
		StringBuilder result = new StringBuilder();
		a = true;
		b = false;
		c = false;
		System.out.println (a + ", " + b + ", " + c);
		result.append(a + ", " + b + ", " + c);
		do{
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + ", " + b + ", " + c);
			result.append(a + ", " + b + ", " + c);
		}
		while ( a || b || c);
		return result.toString();
	}
	
	public String tenE() {
		StringBuilder result = new StringBuilder();
		int one = 1;
		int two = 2;
		int three = 3;
		do
		{
			one++;
			System.out.print("cart");
			result.append("cart");
		}while ( one < 3);
		
		for (int i = 0; i < two; i++){
			System.out.print("o");
			result.append("o");
		}
		while (true){
			three++;
		if (three == 5){
			break;
		}
			System.out.print("n");
			result.append("n");
		}
		return result.toString();
	}
}
