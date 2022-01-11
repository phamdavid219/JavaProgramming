package day17_While_DoWhile;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");
        char mathOp = scan.next().charAt(0);
        while( !(mathOp == '+' || mathOp  == '-')){  //executes until a valid   operator is given
            System.out.println("Invalid entry. Please re-enter");
            mathOp =scan.next().charAt(0);
        }
        System.out.println((mathOp=='+' ? num1+num2  : num1-num2));
        scan.close();
    }
}
