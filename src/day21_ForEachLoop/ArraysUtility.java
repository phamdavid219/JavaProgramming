package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num)); //[I@27f674d not hashcode must call Array.util
        String str = "Java";
        System.out.println(str.toString());
        System.out.println("-------------------");
        int[] scores = {95,100,55,65,85,70};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score = " + scores[0]);
        System.out.println("Max Score = " + scores[scores.length-1]); //sorts A~Z 1~10 etc
        System.out.println("----------------");
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        Arrays.sort(arr1);
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        //anagram 2 words using the same letters 'heart 'earth
        char[] ch1 = {'h','e','a','r','t'};
        char[] ch2 = {'e','a','r','t','h'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2);
        System.out.println("-------------------");
    }
}
