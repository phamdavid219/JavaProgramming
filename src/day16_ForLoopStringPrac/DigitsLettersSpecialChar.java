package day16_ForLoopStringPrac;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str="Cydeo123456School! @#$%WoodenSpoon";
        //12345/CydeoWoodenSpoon/!@#$%
        String digits="";
        String letters="";
        String uniques="";
        for (int i = 0; i <str.length() ; i++) {  //index numbers of the string str
            char ch = str.charAt(i);  //prints every character in the string
            if(ch>='0'&&ch<='9'){  //or use ascki table to find the digits
                digits +=ch;
            }else if(ch>='a'&&ch<='z'){
                letters+=ch;
            }else if(ch>='A'&&ch<='Z'){
                letters+=ch;
            }else{
                if(ch !=' '){ //a condition to ignore space
                uniques+=ch;}
            }
        }

        System.out.println(uniques);
        System.out.println(letters);
        System.out.println(digits);
    }
}
