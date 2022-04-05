package com.lti.sysdeffuninter;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//A Function is responsible for turning one parameter into a value 
//of a potentially different type and returning it. 
//Similarly, a BiFunction is responsible for turning two parameters into a value 
//and returning it

public class FunctionEx {

	public static void main(String[] args) {
		// hello(String)
		// returning length(int)
		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply("Hello Bhawna !!!"));

		// chicken starts with chick

		// f1.apply("Chicken","Chick");

		BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.startsWith(s2);
		System.out.println(f1.apply("Chicken", "Chick"));

		Function<String, Boolean> f3 = s -> s.startsWith("chick") ;
		System.out.println(f3.apply("chicken"));

		
		BiFunction<String, String, String> b1 = String::concat;
		
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick

		BiFunction<Integer, Integer, Integer> add1 = (n1, n2) -> n1 + n2;
		System.out.println(add1.apply(12, 2));

		BiFunction<Integer, Double, Double> add2 = (n1, n2) -> n1 + n2;

		System.out.println(add2.apply(100, 200.87));

		BiFunction<String, String, String> fun = (x, y) -> x.concat(y);
		System.out.println(fun.apply("JAVA", "11"));
		
	//	Hello --> index of e  using 
		
		Function<String, Integer> fun6 = (str) -> str.indexOf('o');		
		System.out.println(fun6.apply("Hello"));
		
		//dev// impl 
		BiFunction<String, Character , Integer> ind=(k,l)-> k.indexOf(l);  ;
				
		//user 		
		System.out.println(ind.apply("Hello", 'e'));
		
		
		
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        
       System.out.println(egg.test("eggbrown"));
        
        //Convinience Methods 
		
       
        Consumer<String> c1 = x -> System.out.print("1: " + x);        
        Consumer<String> c2 = x -> System.out.println(",2: " + x);          
        Consumer<String> combined = c1.andThen(c2);              
        combined.accept("Annie"); // 1: Annie,2: Annie
        
      //Function
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
                      
        
        Function<Integer, Integer> combined2 = after.andThen(before);        
        System.out.println(combined2.apply(3)); //(3*2) +1 = 7        
        combined2 = after.compose(before);      
        System.out.println(combined2.apply(3)); //(3+1) *2 = 8

        
	}

}
