package com.lti.sysdeffuninter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

 /* 
forEach() method has been added in following places:

1.Iterable interface – This makes Iterable.forEach() method available to all collection classes except Map
2.Map interface – This makes forEach() operation available to all map classes.
3. Stream interface – This makes forEach() and forEachOrdered() operations available to all types of stream.
 */

public class forEachMeth {
public static void main(String[] args) {
	
	//forEach() can be implemented to be faster than for-each loop, 
	//because the iterable knows the best way to iterate its elements,
	//as opposed to the standard iterator way. 
	//So the difference is loop internally or loop externally.

	//one drawback - lack of checked exceptions support.
//	For instance, consider a for-loop version of iterating and printing a Collection of Strings:
		//For example ArrayList.forEach(action) may be simply implemented as
	
		 List<String> list = Arrays.asList("Jay","Vijay","Sanjay");    
	
		for (String name : list) {
		    System.out.println(name);
		}
		
		
		//We can write this using forEach:

		list.forEach(   name -> {System.out.println(name);   }     );
	
	
	
		/*
		 * Collection interface has Iterable as its super interface. 
		 *And this interface has a new API starting with Java 8:

		default void forEach(  Consumer<? super T> action) 
			{
			   
			    for (T t : this) {
			    
			        action.accept(t);
			    }
			}
			
		 * 
		 * 
		
		
		
		
	
	
	    /*
	     * classic for
	     * 
	for(int i = 0, l = list.size(); i < l; ++i)
	 {
    doIt(list.get(i));
	}
		execution time: 4.21 ms

		classic foreach// enhanced for loop
		
		for(Integer i : list) {
		    doIt(i);
		}
		execution time: 5.95 ms

		List.forEach()
		list.forEach((i) -> doIt(i));
		execution time: 3.11 ms

			List.stream().forEach()
			list.stream().forEach((i) -> doIt(i));
			execution time: 2.79 ms

				List.parallelStream().forEach
				list.parallelStream().forEach((i) -> doIt(i));
				execution time: 3.6 ms
*/
	    
}
}
