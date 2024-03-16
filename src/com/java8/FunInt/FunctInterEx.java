package com.java8.FunInt;

@FunctionalInterface  
interface myInterface{  
    void display(String message);  
    int num1=10;
}  
public class FunctInterEx implements myInterface
{  
    public void display(String message)
    {  
        System.out.println(message);
        
    }  
    public static void main(String[] args) {  
    	FunctInterEx fie = new FunctInterEx();  
        fie.display("My First Functional Interface");
        
    }  
}  