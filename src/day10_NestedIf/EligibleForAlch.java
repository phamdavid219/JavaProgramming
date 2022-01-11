package day10_NestedIf;

public class EligibleForAlch {
    public static void main(String[] args) {
        int age = 22;
        boolean hasID = false;
        if(hasID) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        }else{
            System.out.println("Invalid ID");
        }


        System.out.println("_________________________________________________________");

        int number = 1;

        if(number >=1 && number<=7){
            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number ==4){
                System.out.println("Thursday");
            }else if(number ==5){
                System.out.println("Friday");
            }else if(number ==6){
                System.out.println("Saturday");
            }else if(number ==7){
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid");
        }


    }
}
