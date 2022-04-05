package com.lti.lambdaex;


interface FormatStr
{
	String formatMsg(String  str);
}

interface simple
{
	public void show(String str);	
}


public class FunInterEx3 {
	public static void main(String[] args) {
		
		simple si= (s)-> System.out.println(s);		
		si.show("Hello GET 10101011 scholors !!!");
		
		
		FormatStr fs= str ->str.replaceAll(",","*");		
		String s=fs.formatMsg("hello, world , Welcome , Hi ,");
		System.out.println(s);	
		
	}
	

}
