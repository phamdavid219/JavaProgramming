package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num=scan.nextInt();
            if(num>max){   //when the user enters a new number, it gets replaced
                max = num;
            }
        }
        System.out.println("max number = " + max);

scan.close();
    }
}
//write a program for users to enter 5 numbers and pick the lowest number