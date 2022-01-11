package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,5,8));      //addAll
        System.out.println(list);


        list.removeAll(Arrays.asList(3,5,8));      //removesAll
        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,3,5,8));   //retainsAll element from list and removes the rest
        list2.retainAll(Arrays.asList(3,8));
        System.out.println(list2);

        System.out.println("--------------------------------");
        ArrayList<String> jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("______________________________________");

        ArrayList<Integer> list3 =new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,3,5,8));
        boolean result=list3.containsAll(Arrays.asList(2,5));
        System.out.println(result);

        System.out.println("----------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,101};

        ArrayList<Integer> list5 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list5 = " + list5);

    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list5= new ArrayList<>();

        for (int each : array) {
            list5.add(each);
        }

        return list5;
    }

       /* public static ArrayList<Integer> convertArrayToArrayList(int[] array){      //a method to convert array to array collection list
            ArrayList<Integer> list4 = new ArrayList<>();
            for (int each : array) {
                list.add(each);
            }
            return list;
        }
        */











}



//array utility class has a asList(array of values) method coverts it to a collection type list