package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        arr = addElement(arr, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------------");


    }


    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array


}

