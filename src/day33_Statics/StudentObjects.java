package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmet");
        System.out.println(student1);
        Student student2 = new Student("Aygun", 'F');
        Student student3 = new Student("Nigara", 11);
        Student student4 = new Student("Mert", 12, 'F');
        Student student5 = new Student("Cihad", 'M', 28);

        System.out.println(student4==student2);
        Student[] students={student1, student2,student3,student4,student5};
        System.out.println(Arrays.toString(students));
    }
}