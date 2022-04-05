package com.lti.sysdeffuninter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {

	// s - abc
	static public boolean match(String s) {

		// implmentation using lambda //
		Predicate<String> p = str -> str.equals("abc");

		return p.test(s); // p.test(abc);
	}

	public static void main(String[] args) {

		Predicate<String> p1 = String::isEmpty;

		boolean ans = p1.test("Hello");
		System.out.println(ans);
		System.out.println(p1.test(""));

		System.out.println("****");

		boolean ans1 = match("abc");// step 1 :calling with para abc
		System.out.println(ans1);
		
		String toBeTested = "xyz";
        // test predicate with another string
		
		  Predicate<String> p = str -> str.equals("abc"); 
        
        boolean result = p.test(toBeTested); // p.test("def");
        
        if(result) {
           System.out.println("Strings matched");
        } else {
           System.out.println("Strings do not match");
        }	
        
        BiPredicate<String,String> p3 = (s1,s2) -> s1.startsWith(s2);
        
        
       System.out.println( p3.test("chicken","chick")); // true
       System.out.println(    p3.test("chicken","abcd"));// false 
       
       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);		  
       
		  System.out.println("Print even numbers:"); 
		  
		  evaluate(list, (n)-> n%2 == 0 );		  
		  
		  System.out.println("Print odd numbers:"); 
		  evaluate(list, (n)-> n%2 == 1 );		
		  
		  System.out.println("Print numbers greater than 5:"); 
		  evaluate(list, (n)-> n >	5 );
        
	}
	 public static void evaluate(List<Integer> list, Predicate<Integer> p) {
	    	
			for(Integer n: list) 
			{
				if(p.test(n)) 
				{
					System.out.println(n + " ");
				}
			}
	}
}
