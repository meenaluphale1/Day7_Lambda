package com.lti.lambdaex;

interface Power
{
	double pow(int x, int y);	
}


public class FunIntEx2 {
	
	public static void main(String[] args) {
		
	// impl fun interface as Lmbda 		
		Power p = (x,y)->Math.pow(x,y);
	
		
		double r=p.pow(5, 2);
		System.out.println(r);
		
	}

}

