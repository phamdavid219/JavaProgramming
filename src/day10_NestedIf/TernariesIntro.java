package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 1;
        if(n%2 ==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("____________________________________");

         String result1 = (n%2==0)? "Even" : "Odd";
        System.out.println(result1);


        int age=23;
        String ageLimit=(age>=21)? "Eligible" : "Not Eligible";
        System.out.println(ageLimit);

        int number = 0;
        String result2 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println("result2 = " + result2);



    }
}
