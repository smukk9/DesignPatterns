package org.Strategy.pattern;

public class App {

	
	public static void main(String [] args){
		
		Context context = new Context(new multiply());
		
		context.getStrategy().operations(10, 20);
		
	}
}
