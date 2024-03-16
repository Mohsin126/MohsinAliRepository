package com.java8.MethodReference;
interface MyInter4
{
	MyClass getMsg(String msg);
}

class MyClass
{
	MyClass(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodRefConst {

	public static void main(String[] args) 
	{
		MyInter4 mi4 = MyClass::new;
		mi4.getMsg("Method reference using a Constructor");
	}

}
