/*Lambda Expression with Single Parameter*/

package com.java8.LambdaExp;

interface Addition
{
	int add(int a,int b);
	
}

public class LambdaExpMultPara {

	public static void main(String[] args) 
	{
		Addition ad1=(a,b)->(a+b);System.out.println(ad1.add(10, 20));
	
	}
}
