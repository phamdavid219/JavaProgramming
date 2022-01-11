package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "David";
        String lastName = "Pham";
        String fullName = firstName + " " + lastName;
        String jobTitle = "Grocier";
        String companyName = "Kroger";
        double salary = 26_344.12;

        System.out.println(fullName + " is " + "a " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s " + "salary is " + "$" + salary);

    }


}
