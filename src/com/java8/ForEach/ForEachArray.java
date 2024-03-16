package com.java8.ForEach;

import java.util.Arrays;

public class ForEachArray {

    public static void main(String[] args) {
        
        int[] nums = { 3, 4, 2, 1, 6, 7 };
        
        Arrays.stream(nums).forEach((e) -> { System.out.println(e); });
    }
}
