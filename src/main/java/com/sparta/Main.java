package com.sparta;

public class Main {
    public static void main(String[] args) {
        ProblemMethods problemMethods = new ProblemMethods();

        boolean answer = problemMethods.validPalindrome("kayak");
        System.out.println(answer);


        int[] array = problemMethods.bubbleSortArray(new int[]{5, 2, 6, 1, 3});


    }
}