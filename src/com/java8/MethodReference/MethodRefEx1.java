/*Reference to a Static Method*/

package com.java8.MethodReference;

interface MyInterface
{
	void display();
}


public class MethodRefEx1 
{
	public static void showMessage()
	{
		System.out.println("This is a Static method");
	}
	
	public static void main(String[] args) 
	{
		MyInterface myInt = MethodRefEx1::showMessage;		//Referring Static Method
		myInt.display(); 		//Calling Interface Method
	}
}
