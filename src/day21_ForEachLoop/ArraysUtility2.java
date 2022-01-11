package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniels"};
        String[] earlyBirds = Arrays.copyOf(students,3);
        String[] inBetween = Arrays.copyOfRange(students,2,5);
        System.out.println("-------------");
        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,3,6); //calls index
        System.out.println(Arrays.toString(ch2));
    }
}
