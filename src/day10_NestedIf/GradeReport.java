package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 61;
        String result = "";
        if(grade >=0 && grade<=100){
            if(grade >=90){
                result = "Exellent";
            }else if(grade >=80){
                result = "Great";
            }else if(grade >=70){
                result = "Good";
            }else if(grade >=60){
                result = "Passed";
            }else if(grade <60){
                result = "Failed";
            }
        }else{
            result = "Invalid Grade";
        }
        System.out.println("result = " + result);









    }
}
