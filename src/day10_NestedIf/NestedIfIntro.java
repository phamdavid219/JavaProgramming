package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 10;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid");
        }
    }
}
