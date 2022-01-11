package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); //121, concatenation
        System.out.println(10 + 20); //30, addition

        int num1 = 2000;
        short num2 = (short) num1; //because short cannot fit int
        int num3 = 2000;
        long num4 = num3;
    }

}
/*
double > float > long > int > short > byte
+:
-:
*:
/:
%:
 */