
/*Example of Lambda Expression without Parameters*/
package com.java8.LambdaExp;

interface MyInterface2{  
    public String say();  
}  
public class LambdaExp2{  
public static void main(String[] args) {  
    MyInterface2 s=()->{  
        return "Lambda Expression without parameters";  
    };  
    System.out.println(s.say());  
}  
}  