import java.lang.reflect.Array;
import java.util.Arrays;
//
public class mergesort {
    public static void main(String[] args) {

    }
    //merge sort uses the divide and conquere approach like recurssion
    //first divide the problem in parts and then sort them and then merger them tgus us what we called merge sort
    //steps to do merge sort:-
    // 1- divide array into 2 parts
//    // 2- get both parts sorted via recursion
//    //3- merge the sorted parts
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        // work of copyofrange is to Copies the specified range of the specified array into a new array
       //copyofrange create the new array and copy the particular range which were givem by us
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));// like here the copyofrange create the new array of range 0 to mid
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        
    }
//}
