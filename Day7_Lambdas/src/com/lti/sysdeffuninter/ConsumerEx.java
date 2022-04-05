package com.lti.sysdeffuninter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;



public class ConsumerEx {
	
	public static void main(String[] args) {
		
		Consumer<String> c1= (s)-> System.out.println(s.toUpperCase());		
		c1.accept("Hello");
		
								// method reference 
		Consumer<String> c2= System.out::println;
		c2.accept("World");
		
		Consumer<Double> circle = radius -> {
			
			double circumference = Math.PI * Math.pow(radius, 2);
			
			double area = 2 * Math.PI * radius;
			System.out.println("Area: " + area);
			System.out.println("Circumference: " + circumference);
			
		};

		circle.accept(5d);
		
		
		
		BiConsumer<Double, Double> rectangle = (length, breadth) -> {
			double area = length * breadth;

			double perimeter = 2 * length * breadth;

			System.out.println("Rectangle Details:");
			System.out.println("Area = " + area);
			System.out.println("Perimeter = " + perimeter);
		};

		rectangle.accept(12d, 6d);
		
		
		/*  @FunctionalInterface
		  public interface Consumer<T> { void accept(T t); }
		  
		  Consumer<String> printConsumer = new Consumer<String>() 
		  { public void accept(String name) { System.out.println(name); }; };*/
		  
		 // names.forEach(printConsumer);
		  
		  //using lambda names.forEach(name -> System.out.println(name));
		  
		 

		// forEach method --> uses internally Consumer implementation
		// explain later
		
		  
		  List<String> list = Arrays.asList("Jay","Vijay","Sanjay");
		  
		  for (String name : list) { System.out.println(name); } 
		  //We can write this  using forEach:
		  
		  list.forEach( name -> { System.out.println(name); });  
		  
		 
		
		 // Collection interface has Iterable as its super interface. And this interface
		 // has a new API starting with Java 8:
		  
		  //default void forEach(Consumer<? super T> action) {
		  
		  //for (T t : this) { action.accept(t); } }
		  
		  
		  
		   Map<String, Integer> map = new HashMap<>();
		  
		  BiConsumer<String, Integer> b1 = map::put; //used an instance method
		  //reference since we want to call a //method on the local variable map .
		  
		  BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v)		;  
		  
		  b1.accept("product1", 10000); 
		  
		  // map::put is same as b2.accept("chick", 1); 
		  //k,		  v) -> map.put(k, v); System.out.println(map);
		 

		
		  Map<String, String> map1 = new HashMap<>(); 
		  BiConsumer<String, String> bc1 =map1::put; 
		  BiConsumer<String, String> bc2 = (k, v) -> map1.put(k, v);
		  bc1.accept("chicken", "Cluck"); 
		  bc2.accept("chick", "Tweep");
		  System.out.println(map1);
		 

		
		
		
		
	}

}
