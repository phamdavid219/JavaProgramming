package day26_CustomMethodPractice;

public class FrequencyOfElement {
                 //example [1,1,1,2,3,4,5]    find frequency of 1

    public static void main(String[] args) {
        int[] arr={1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};
        int n=frequencyOfElement(arr,1);   //assign it to a variable 'n' to reuse finding frequency
        System.out.println(n);
        String[] arr2={"Jon","Jon","Jon","Mikasa","Ashly","Ashly"};
        int m=frequencyOfElement(arr2,"Jon");
        System.out.println(m);
    }

    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }
    public static int frequencyOfElement(char[] array, char element){
        char count=0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }
    public static int frequencyOfElement(String[] array, String element){
        int count=0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;

    }
}
/*
1. Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array

 */