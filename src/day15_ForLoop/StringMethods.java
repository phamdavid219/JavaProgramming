package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "";
        boolean r=str.isEmpty();
        System.out.println(r); // isEmpty
        String str2 = " ";
        boolean r1=str2.isBlank();
        System.out.println(r1);  //isBlank but if theres a character, then false


        String str3="Cydeo     ";
        System.out.println(str3.isBlank()); //incorported


        System.out.println("-----------------------------------");


        String s1 = "CYDEO", s2 ="cydeo";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-----------------------------------");
        String sentence="My favorite program is Java";
        boolean hasCSharp=sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava=sentence.contains("Java");  //only contains Upper case word
        boolean hasJava2=sentence.contains("java");  //only contains Lower case
        boolean hasJava3=sentence.toLowerCase().contains("java");  //allows both upper and lower case
        System.out.println(hasJava3);

        System.out.println("---------------------------");
        String a ="Wooden Spoon"
        ;
        boolean x=a.startsWith("Woo"); //case sensitive
        boolean y=a.endsWith("Spoon");
        boolean z=a.toLowerCase().startsWith("wooden");





    }
}
