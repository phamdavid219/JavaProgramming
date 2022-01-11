package day15_ForLoop;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName =scan.next();
        System.out.println("Enter your last name:");
        String lastName =scan.next();
        String first=firstName.toUpperCase();
        String last = lastName.toUpperCase();
        System.out.println(first.charAt(0)+firstName.substring(1).toLowerCase()+
                " "+last.charAt(0)+lastName.substring(1).toLowerCase());



    }
}