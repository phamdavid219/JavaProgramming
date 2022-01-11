package day22_MultiDimensionalArray;
import java.util.Arrays;
public class MulriDimensionalArrayIntro {
    public static void main(String[] args) {
        String[] group1 ={"john","joe"};
        String[] group2 ={"john","joe"};
        String[] group3 ={"john","james"};
        String[][] groups = new String[3][];      //set the size of the element
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

        int[][] array2D={{1,2,3},{2,3,4},{5,4,6}};
                //index     0       1       2
        System.out.println(Arrays.deepToString(array2D));
        System.out.println(Arrays.toString(array2D[2]));
        System.out.println(array2D[2][2]);
        //[ID arrays][ID element]
    }
}
//String[] group1 ={"john","john"};
//String[] group2 ={"john","john"}; use a two dimensional array