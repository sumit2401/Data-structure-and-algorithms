public class infintearray {
    public static void main(String[] args) {
        //we can say the array is infinite when we don't use the arr.length ... first we take starting element .. with the help of those element we found the other indexes of the array

        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findrange(arr, target));
    }
    static int findrange(int[]arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        while(target> arr[end]){//there is no need of us to write the condition target>start.. its the common sense means if the target is greater than the end then it is also greater than the start
            int newstart = end+1; //this is our new start
             end = end + (end-start+1)*2;// basically the formula is end = end + (end-(start-1))*2 in here we multiply with 2 because we want to double the size of the box where we find our target
             start = newstart;
        }
        return binarysearch(arr, target , start, end);
    }//simple binary search method
    static int binarysearch(int [] arr, int target , int start, int end){
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
            return -1;
    }
}
