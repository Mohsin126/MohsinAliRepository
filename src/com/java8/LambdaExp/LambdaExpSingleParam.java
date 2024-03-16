/*Lambda Expression with Single Parameter*/
package com.java8.LambdaExp;
interface MyInterface3
{
	public String display(String name);
}


public class LambdaExpSingleParam {

	public static void main(String[] args) 
	{
		MyInterface3 mi = (name)->{return "Hello"+name;};System.out.println("Mohsin");
		MyInterface3 mi2 = (name)->{return "Hello"+name;};System.out.println("Osmani");
	}
}
