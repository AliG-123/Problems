package com.sparta;

public class ProblemMethods {

    public static boolean validPalindrome(String S) {
        //if length of string is less than 3 method should return false
        if (S.length() < 3) {
            return false;
        }

        // initialise empty string reverseString
        String reverseString = "";

        //running a while loop starting at the index at end of the string and concatenating to reverseString
        int i = S.length() - 1;
        while (i >= 0) {
            reverseString += S.charAt(i);
            i--;

        }

        //comparing both strings in uppercase form to see if it is a valid palindrome
        if (S.toUpperCase().equals(reverseString.toUpperCase())) {
            return true;
        }
        return false;
    }

    //This code returns the first longest palindrome in a sentence
    public static String LongestPalindrome(String S) {
        if (S.length()<3){
            return "No palindromes in string";
        }
        String[] strings = S.split(" ");

        String longest = "";

        for (String word: strings){
            if (validPalindrome(word)){
                if (word.length() > longest.length()){
                    longest = word;
                }
            }
        }
        if (longest.length() > 3){
            return longest;
        }else {
            return "No palindromes in string";
        }


    }

    // This code is for a bubble sort to take an array and put it into sorted order
    // The algorithm works by looping through the array several times and swapping adjacent elements until array is sorted

    public static int[] bubbleSortArray(int[] intsArray) { //Should be verb
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int number : intsArray) {
                System.out.print(number);
            }
            System.out.println();

            for (int i = 0; i < intsArray.length - 1; i++) {
                if (intsArray[i + 1] < intsArray[i]) {
                    flag = true;
                    int temp = intsArray[i];
                    intsArray[i] = intsArray[i + 1];
                    intsArray[i + 1] = temp;
                }
            }

        }
        return intsArray;

    }

    public static void main(String[] args) {
        System.out.println(LongestPalindrome("alig racecar"));
    }
}

