package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 2;
        int year = 2001;
        String result = ""; //replaces print statements
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = (year % 4 ==0)? "29 Days" : "28 Days"; //ternaries
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 Days";
                    break;
                default:
                    result = "31 Days";
            }
        } else {       //switch statement in an if statement
            result = "Invalid Number";
        }
        System.out.println(result);
    }

    public static class task1 {
        public static void main(String[] args) {
            System.out.println("Enter a word:");
            String word = new Scanner(System.in).next();  //xcodex
            if(word.charAt(0) == 'x'){
               word = word.replaceFirst("x","a");
            }
            System.out.println(word);








        }
    }
}

