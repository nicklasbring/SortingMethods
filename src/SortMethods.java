import java.util.ArrayList;

public class SortMethods {

    //My bubblesort method i use to sort arrays
    public static void bubbleSort(ArrayList<Integer> array){

        ExecTimer.start(); //Uses my ExecTimer class to estimate start time

        for (int i = 0 ; i < array.size() ; i++){
            for (int j = 0 ; j < array.size() - i - 1 ; j++){

                if(array.get(j) > array.get(j + 1)){
                int temp = array.get(j);
                array.set(j, array.get(j + 1));
                array.set(j + 1, temp);
                }
            }
        }

        System.out.println(); //For space
        System.out.println("After sorting the numbers:");
        System.out.println(array); //Displays the Array in sorted order

        System.out.println(); //For space
            ExecTimer.stop(); //Uses my ExecTimer class the get execution time
    }
}