package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }


        }
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
