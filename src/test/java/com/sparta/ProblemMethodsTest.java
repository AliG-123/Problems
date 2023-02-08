package com.sparta;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class ProblemMethodsTest {
    @ParameterizedTest
    @ValueSource(strings = {"racecar","civic" ,"hannah"})
    @DisplayName("Given a valid palindrome return true")
    public void GivenPalindrome_ReturnsTrueIfValidPalindrome(String string){
        boolean expectedResult = true;
        boolean result = ProblemMethods.validPalindrome(string);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ali","oo" ,"invalid"})
    @DisplayName("Given an invalid palindrome return false")
    public void GivenInvalidPalindrome_ReturnsFalse(String string){
        boolean expectedResult = false;
        boolean result = ProblemMethods.validPalindrome(string);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given an int array return sorted array using bubble sort method")
    public void givenArray_ReturnsBubbleSortedArray(){
        int [] array = {5,2,6,1,3};
        int [] expectedResult = {1,2,3,5,6};
        int[] result = ProblemMethods.bubbleSortArray(array);
//        Assertions.assertArrayEquals(expectedResult, result);
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), result);

    }

    @Test
    @DisplayName("Given an int array return sorted array using bubble sort method")
    public void givenArray2_ReturnsBubbleSortedArray(){
        int [] array = {8,22,1,8,3,9};
        int [] expectedResult = {1,3,8,8,9,22};
        int[] result = ProblemMethods.bubbleSortArray(array);
//        Assertions.assertArrayEquals(expectedResult, result);
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), result);

    }

    @Test
    @DisplayName("Given a sentence containing palindromes return first longest")
    public void GivenASentence_ReturnsFirstLongestPalindrome(){
        String test = "Ali oo invalid racecar hannah pullup mam dad civic rotator";
        String expectedResult = "racecar";
        String result = ProblemMethods.LongestPalindrome(test);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given an empty string return no palindromes message")
    public void GivenEmptyString_ReturnsNoPalindromeMesssage(){
        String test  = "";
        String expectedResult = "No palindromes in string";
        String result = ProblemMethods.LongestPalindrome(test);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given a string with no palindromes return no palindromes message")
    public void GivenStringWithNoPalindromes_ReturnsNoPalindromeMesssage(){
        String test  = "My name is Ali and I am working for Sparta Global";
        String expectedResult = "No palindromes in string";
        String result = ProblemMethods.LongestPalindrome(test);
        Assertions.assertEquals(expectedResult, result);
    }

//    @ParameterizedTest
//    @ValueSource(ints = {59217,15731 ,13621})
//    @DisplayName("Given different integer arrrays pass if method returns sorted array")
//    public void GivenIntArray_ReturnsSorted(int number){
//        int [] array = number.split();
//        int [] result = ProblemMethods.isSortedBubbleSort(array);
//        assertEquals(Arrays.stream(array).sorted().toArray(), result);
//    }

}
