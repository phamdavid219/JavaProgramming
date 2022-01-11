package day17_While_DoWhile;
import java.util.Scanner;
public class EligibleToVote2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt(); //valid age only 1-120
        while(!(age >=1&&age<=120)) {
            System.out.println("Invalid, please re-enter:");
            age = scan.nextInt();
        }
            System.out.println("Are you a US Citizen yes/no");
            String USorNot = scan.next().toLowerCase();
            while (!(USorNot.equalsIgnoreCase("yes") || USorNot.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer, please re-enter:");
                USorNot = scan.next().toLowerCase();

            }

         if(age >=18 && USorNot.equals("yes")) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
scan.close();
    }
}
