package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //in means obtaining input .out means displaying output

        System.out.println("Enter an integer:");

        int num1 =input.nextInt(); //lets you type on console

        System.out.println(num1);  //prints the variable that was scanned


        input.close();




    }
}
