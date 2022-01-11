package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("--------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);
        System.out.println("---------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,9,2,7,6,5,4,3,2,1));
        Collections.swap(list3,2,5);
        System.out.println(list3);
        int max =Collections.max(list3);
        int min =Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("--------------------");
        ArrayList<Character> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.replaceAll(list4,'A','F');
        System.out.println(list4);
        System.out.println("------------------------");
        int frequency =Collections.frequency(list3,10);
        System.out.println(frequency);
        System.out.println("--------------------------");

    }
}
