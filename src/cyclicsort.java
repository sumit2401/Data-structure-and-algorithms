import java.util.Arrays;
// so the cycle sort only only work on continous numbers like 1,2,3,4,5
public class cyclicsort {
    public static void main(String[] args) {
        //int [] arr = {8,10,5,17,20};// cycle sort doesn't work on this
        int [] arr={5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[]arr){
     int i =0;
     while(i<arr.length){
          int correct = arr[i]-1;//suppose the i=1 then the correct index of arr[1]=4 is 3 so the element arr[i]=4 place on there correct position means index 3
         if(arr[i]!= arr[correct]){ // arr[1](means the element 4) is not equal to correct index means 3 then the element will swap  otherwise just increment the loop
             swap(arr, i ,correct);
         }
         else{
             i++;
         }
     }
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a] ;
        arr[a]=arr[b];
        arr[b]= temp;
    }

}
