package com.java8.FunInt;


public class FunctInterAnonymous 
{
public static void main(String[] args) 
{
	MyFunctionalInterface.print("msg");
	MyFunctionalInterface intr = new MyFunctionalInterface()
			{
			public void method1(String str)
			{
				
			}
			
			};
			intr.log("msg");
}
}
