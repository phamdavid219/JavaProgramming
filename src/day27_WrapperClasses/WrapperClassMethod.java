package day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {
        String string="123";
        //primitive       primitive
        int num = Integer.parseInt(string); //neither autoboxing nor unboxing
        System.out.println(num+1);
    }
}
