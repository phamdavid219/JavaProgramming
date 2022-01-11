package day18_NestedLoop;
import java.util.Scanner;
public class NestedOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){
                System.out.println("Invalid, would you like to enter another number?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }





scan.close();



    }

}
