import java.util.ArrayList;
import java.util.Collections;

public class ArrayForTesting {

    //My Arraylist method i use to create a Array list with specified size
    public static ArrayList<Integer> makeArray(int size){

    ArrayList<Integer> myArray = new ArrayList<Integer>();

    //My ArrayList is getting numbers from 0 to the specified size
    for (int i = 0 ; i < size ; i++){
        myArray.add(i);
    }
        /* Here my ArrayList is getting shuffled
        so i can use my sort method. */
        Collections.shuffle(myArray);
            System.out.println("\nThe array before sorting:");
            System.out.println(myArray);
            return myArray;
    }
}
