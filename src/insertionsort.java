import java.util.Arrays;
//in insertion sort we virtually divide the array in sorted and unsorted part
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        inverseinsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i =0; i<arr.length-1;i++){
        for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }

    }
    static void inverseinsertion(int[]arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]>arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
