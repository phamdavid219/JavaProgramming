package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 !=0){
                list.remove(i);  //does not remove all odd numbers because collection is dynamic size
            }
        }

        System.out.println(list);

        list.removeIf(p -> p<5); //Lambda expression
        System.out.println(list);
        System.out.println("------------------------");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each%2==0);   //have a variable name to task each element into
        System.out.println(list2);
        System.out.println("----------------------------");

        ArrayList<String> list3 =new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3);


        //using custom method to check if a string is palindrome in a collection

        ArrayList<String> name =new ArrayList<>();
        name.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java","Level"));
        name.removeIf(names -> !StringUtility.isPalindrome(names));
        System.out.println(name);

/*
remove(): when we remove one element. cannot use in a loop
removeAll(): when we remove multiple element(u have to know all that you want to remove)
retainAll(): when we retain the element and exclude the rest(need to know the element first)
removeIf(): when we remove element under a condition(element unknown)
 */





    }
}
