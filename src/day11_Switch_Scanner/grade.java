package day11_Switch_Scanner;

public class grade {
    public static void main(String[] args) {
        char a = 'A';
        String result = "";
        switch (a) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result ="Great";
                break;
            case 'C':
                result ="Good";
                break;
            case 'D':
                result ="Passed";
                break;
            case 'F':
                result ="Failed";
                break;
            default:
                System.out.println("Invalid");
                System.out.println(result);
        }


    }
}
