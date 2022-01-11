package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3};
        arr=removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] removeDuplicate(int[] array){
        int[] result={}; //new array
        for (int each : array) {  //checks each element in the array
            if(!ArraysUtility.contains(result, each)){
                result=ArraysUtility.addElement(result,each);  //if the element contains the same element, it will !not contain it
            }
        }
        return result;  //prints a new array that contains only 1 of the element with no duplication
    }
    public static double[] removeDuplicate(double[] array){
        double[] result={}; //new array
        for (double each : array) {  //checks each element in the array
            if(!ArraysUtility.contains(result, each)){
                result=ArraysUtility.addElement(result,each);  //if the element contains the same element, it will !not contain it
            }
        }
        return result;  //prdoubles a new array that contains only 1 of the element with no duplication
    }
    public static char[] removeDuplicate(char[] array){
        char[] result={}; //new array
        for (char each : array) {  //checks each element in the array
            if(!ArraysUtility.contains(result, each)){
                result=ArraysUtility.addElement(result,each);  //if the element contains the same element, it will !not contain it
            }
        }
        return result;  //prchars a new array that contains only 1 of the element with no duplication
    }
    public static String[] removeDuplicate(String[] array){
        String[] result={}; //new array
        for (String each : array) {  //checks each element in the array
            if(!ArraysUtility.contains(result, each)){
                result=ArraysUtility.addElement(result,each);  //if the element contains the same element, it will !not contain it
            }
        }
        return result;  //prStrings a new array that contains only 1 of the element with no duplication
    }
}
