package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,3};
        System.out.println(Arrays.toString(arr));
        arr=replaceAll(arr,3,30);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] replaceAll(int[] array, int oldValue, int newValue){
           //a loop to check all interger element within the array
        for (int i = 0; i < array.length; i++) {
            //at index i (old value)
            if(array[i]==oldValue){
                //will be replaced by the (new value)
                array[i]=newValue;
            }
        }
        //returns a new array with new value
        return array;
    }
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        //a loop to check all double element within the array
        for (int i = 0; i < array.length; i++) {
            //at index i (old value)
            if(array[i]==oldValue){
                //will be replaced by the (new value)
                array[i]=newValue;
            }
        }
        //returns a new array with new value
        return array;
    }
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        //a loop to check all char element within the array
        for (int i = 0; i < array.length; i++) {
            //at index i (old value)
            if(array[i]==oldValue){
                //will be replaced by the (new value)
                array[i]=newValue;
            }
        }
        //returns a new array with new value
        return array;
    }
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        //a loop to check all String element within the array
        for (int i = 0; i < array.length; i++) {
            //at index i (old value)
            if(array[i]==oldValue){
                //will be replaced by the (new value)
                array[i]=newValue;
            }
        }
        //returns a new array with new value
        return array;
    }
}
