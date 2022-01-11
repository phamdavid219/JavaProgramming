package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique=uniqueElement(arr);
        System.out.println(Arrays.toString(unique));
    }
    public static int[] uniqueElement(int[] array){
        int[] result={};  //temporary array
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String[] uniqueElement(String[] array){
        String[] result={};  //temporary array
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
