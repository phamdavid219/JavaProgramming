package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            while (!(age > 0 && age < 121)) {
                System.out.println("Invalid Age: please re-enter your age:"); //while the AGE is invalid
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();
            while(!(a.equals("yes") || a.equals("no"))){  //while the ANSWER is invalid
                System.out.println("Invalid entry. Would you like to continue?");
                a= scan.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }
        scan.close();

    }
}
