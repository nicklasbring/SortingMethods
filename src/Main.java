import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Creating a new array from my ArrayForTesting class.
        I can specify the size of the array in the makeArray method. */
        ArrayList<Integer> myArray = ArrayForTesting.makeArray();

        //Here i'm calling my bubbleSort method to sort myArrray
        SortMethods.bubbleSort(myArray);
    }
}
