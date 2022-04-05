package com.lti.sysdeffuninter;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOpEx {
	
	public static void main(String[] args) {		
		
		UnaryOperator<String> u1 = String::toUpperCase;
		
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		
		System.out.println(u1.apply("chirp"));
		
		System.out.println(u2.apply("chirp"));
				
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
	
	}

}
