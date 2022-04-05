package com.lti.lambdaex;

public class UserApp {
	
	public static void main(String[] args) {
				
		// implementation as lmbda 
		MaxFinder mf1=(num1,num2)-> num1>num2?num1:num2 ;
		
		int result1 =mf1.maximum(400, 200);
		System.out.println(result1);		
	}

}

// Function Interface 
//Lambda - implementing functional interfaces as annonymous classes 
