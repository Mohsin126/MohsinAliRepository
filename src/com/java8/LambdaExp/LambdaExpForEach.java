/*Lambda Expression using ForEach loop*/

package com.java8.LambdaExp;
import java.util.*;
public class LambdaExpForEach 
{

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("Chris");
		list.add("George");
		list.add("Anil");
		list.add("Bob");
		list.add("Jack");
	
		list.forEach((n)->System.out.println(n));
	}
}
