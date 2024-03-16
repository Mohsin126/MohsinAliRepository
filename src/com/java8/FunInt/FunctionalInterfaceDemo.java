package com.java8.FunInt;

@FunctionalInterface

	interface MyFunctionalInterface
	{
		void method1(String str);		//Default Method
		static void print(String msg)				//Static method 
		{
		
		
			System.out.println("Hello \t"+msg);
		}
		default void log(String msg)
		{
			System.out.println("Functional \t"+msg);
		}
	}



public class FunctionalInterfaceDemo implements MyFunctionalInterface
{

	public static void main(String[] args) 
	{
		MyFunctionalInterface.print("World");
		MyFunctionalInterface intr = new FunctionalInterfaceDemo();
		intr.log("Interface");
	}

	@Override
	public void method1(String str) {
		
	}


}
