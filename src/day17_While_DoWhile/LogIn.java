package day17_While_DoWhile;
import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username:");
        String u = scan.next();
        System.out.println("Enter Password:");
        String p = scan.next();
        if(u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged In");

        }else{
            int attempts =3;
            while(!(u.equals("Cydeo")&&p.equals("Cydeo123")) &&attempts>0){
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter Username");
                u = scan.next();
                System.out.println("Enter Password");
                p = scan.next();
                attempts--;

            }if(u.equals("Cydeo")&&p.equals("Cydeo123")){
                System.out.println("Logged In");
            }else{
                System.out.println("No more attempts. Try again later");
            }
        }


        scan.close();
    }
}
