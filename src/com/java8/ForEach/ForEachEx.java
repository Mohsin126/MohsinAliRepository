package com.java8.ForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachEx {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Inida");
        names.add("USA");
        names.add("Japan");
        names.add("Hongkong");

  
        
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
    }
}