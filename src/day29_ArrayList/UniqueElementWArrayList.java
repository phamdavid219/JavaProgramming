package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementWArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));  //take the unique element and put it in list2

        ArrayList<Integer> list2= new ArrayList<>();
        for (Integer eachElement : list) {   //checking the frequency of each element in list()
           int frequency = Collections.frequency(list,eachElement);
            if(frequency==1){
                list2.add(eachElement);
            }
        }
        System.out.println(list2);
        System.out.println("------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,2,3,3,3,4,5,5,6,7,7,8,9,9));  //take the unique element and put it in list2

        ArrayList<Integer> unique1= new ArrayList<>(list3);
        unique1.removeIf(p -> Collections.frequency(list3,p)>1);
        System.out.println(unique1);
    }
}
