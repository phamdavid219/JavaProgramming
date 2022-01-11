package day16_ForLoopStringPrac;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Level";
        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse +=word.charAt(i);
            boolean isPalindroome = word.equalsIgnoreCase(reverse);
        }
        boolean isPalindroome = word.equalsIgnoreCase(reverse);

        System.out.println("isPalindroome = " + isPalindroome);


    }
}
