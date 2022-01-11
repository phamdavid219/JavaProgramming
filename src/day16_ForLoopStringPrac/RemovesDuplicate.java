package day16_ForLoopStringPrac;

public class RemovesDuplicate {
    public static void main(String[] args) {
        String str = "aabbaacc";
        String result = "";
        for (int i = 0; i <=str.length()-1 ; i++) {  //i counts all characters(length of the string)
            String ch =""+str.charAt(i);

            if(!result.contains(ch)){  //if character is not contained in result. the char will be added
                result +=ch;

            }
        }

        System.out.println(result);

        
        
        
        
    }
}
