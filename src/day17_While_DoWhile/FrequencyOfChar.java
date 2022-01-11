package day17_While_DoWhile;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "AAABBBCAA";
        int frequency = 0; //1+1+1
        char ch = 'A';
        for (int i = 0; i < str.length(); i++) { //executes the length of the string given what char
            char eachChar = str.charAt(i);
            if(ch == eachChar){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
