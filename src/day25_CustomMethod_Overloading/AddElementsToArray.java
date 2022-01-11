package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        arr = addInteger(arr, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------------");


    }


    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element){
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
/*
Task2:
		1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}
	    2. create a return method called addDouble that can add a double after the last index of a double array
	    3. create a return method called addString that can add a String after the last index of a String array
	    4. create a return method called addChar that can add a char after last index of a char array
 */
/*replace specific word in a highlighted section Crtl+R
merge(int[] arr1,int[] arr2)

 */
/*public static void main(String[] args) {

    int[] intArray = {5,6,0,-1,3,4};
    Arrays.sort(intArray);

    double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
    Arrays.sort(doubleArray);

    char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
    Arrays.sort(charArray);

    System.out.println("-------------------------------------------");

    //sum of 10 and 20
    int sum1 = sumOfNumbers(10,20);

    // sum of 10, 20, 30
    int sum2 = sumOfNumbers(10, 20, 30);

    // sum of 10, 20, 30, 40
    int sum3 = sumOfNumbers(10, 20, 30, 40);

    // sum of 18.2 and 30.7
    double sum4 = sumOfNumbers(18.2, 30.7);

    //sum of 5.5, 4.5, 6.5
    double sum5 = sumOfNumbers(4.5 , 5.5, 6.5);

    // sum of 4.5, 3.5, 2.5, 6.5
    double sum6 = sumOfNumbers(4.5 , 3.5, 2.5, 6.5);


}


    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }





}
/*
 1. create a method that can find the sum of two numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */