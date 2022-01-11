package day25_CustomMethod_Overloading;

public class SumOfNumber {
    public static void main(String[] args) {
        int sum= sumOf2Numbers(10, 20);
        System.out.println("Sum of 2 numbers is "+sum);
        int sum2=sumOf3Numbers(10,20,30);
        System.out.println("Sum of 3 numbers is "+sum2);
        int sum3=sumOf4Numbers(10,20,30,40);
        System.out.println("Sum of 4 numbers is "+sum3);
    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers(int num1,int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

}
/*
parameters:must have informations

task: create a method of sum of 2/3/4 numbers
 */