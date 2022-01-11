package day16_ForLoopStringPrac;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "AABCCD";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);


            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index# is the same, then its unique
                result += ch;
            }
        }


        System.out.println(result);

    }
}
