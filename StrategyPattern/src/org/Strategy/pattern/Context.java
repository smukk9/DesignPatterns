package org.Strategy.pattern;

public class Context {

	private strategy Strategy ;

	public strategy getStrategy() {
		return Strategy;
	}

	public Context(strategy strat){
		
		this.Strategy = strat;
	}
	
}
