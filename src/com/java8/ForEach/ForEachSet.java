package com.java8.ForEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachSet {

    public static void main(String[] args) {
        
        Set<String> brands = new HashSet<>();
        
        brands.add("Nokia");
        brands.add("Samsung");
        brands.add("Vivo");
        brands.add("Apple");
        
        brands.forEach((e) -> { System.out.println(e); });
    }
}