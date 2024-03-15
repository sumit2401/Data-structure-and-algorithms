public class reccbinarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findindex(arr, 4, 0,arr.length-1));
    }
    static int findindex(int[]arr,int target,int start, int end){

       if(end>+start && start<=arr.length-1){
         int mid =start+(end-start)/2;

        if( arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return findindex(arr, target, start, mid-1);
        }

           return findindex(arr, target, mid+1, end);
        }
        return -1;
    }

}

