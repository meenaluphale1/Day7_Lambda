package com.lti.sysdeffuninter;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		
		Supplier<LocalDate> s1= ()-> LocalDate.now(); 
		LocalDate obj	=s1.get();
		
		System.out.println(obj);
		
		
		Supplier<String> s= ()-> new String("hello");
		System.out.println(s.get());
		
	}
}
