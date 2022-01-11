package day21_ForEachLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        for(char each:str.toCharArray()){  //char[] chars=str.toCharArrays();  to task it to a variable  [J,a,v,a]
            System.out.println(each);   // for(char each:chars)
        }
    }
}
