package com.lti.sysdeffuninter;

import java.util.function.Function;

public class testMcq {
	
	public static void main(String[] args) {
		
        double principle = 100;
        int interestrate = 5;
        double amount = compute(principle, x->x*interestrate);

	}
	
	/*public static double compute(double base, Function<Integer, Integer > func){
	    return func.apply((int)base);
	}*/
/*	public static double compute(double base, Function<Integer, Double> func){
	    return func.apply((int)base);
	}*/
	
		public static double compute(double base, Function<Double, Double> func){
	    return func.apply(base);
	}



}
