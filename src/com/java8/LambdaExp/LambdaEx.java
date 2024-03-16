package com.java8.LambdaExp;

@FunctionalInterface
interface MyInterface
{
	public void display();
	
}


public class LambdaEx 
{

	public static void main(String[] args) 
	{
		String name = "xyz";
		MyInterface mi=()->{System.out.println("Name "+name);};
		mi.display();
	}
}
