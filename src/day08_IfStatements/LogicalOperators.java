package day08_IfStatements;

import javax.lang.model.SourceVersion;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";

        String name2 = "Shay";
        int age2 = 34;
        char gender = 'F';

        boolean isSelectiveService = age2 >= 18 && (gender == 'M' || gender == 'F');
//&& ||
        int score = 59;
        boolean passed = score >= 60;
        boolean failed = score < 60;
        System.out.println("passed = " + passed);
        System.out.println("-------------------------------------------------");

        boolean result1 = !(10 > 30) && !(10 > 32);
        System.out.println("result1 = " + result1);







    }
}
