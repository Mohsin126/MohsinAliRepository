/*Reference to an instance Method*/

package com.java8.MethodReference;

interface MyInterface3
{
	void display();
}


public class InstanceMethodEx 
{
	public void show()
	{
		System.out.println("This is a non static method");
	}
	
	public static void main(String[] args) 
	{
		InstanceMethodEx method = new InstanceMethodEx();	//Object creation
		
		MyInterface3 myInt=method::show;		//Reference to a non static method
		myInt.display(); 			//Calling Interface method
		
		MyInterface3 myInt2=new InstanceMethodEx()::show;
		myInt2.display();
	}
}
