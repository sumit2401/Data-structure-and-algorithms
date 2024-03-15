public class floor {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,13,15,17,35,46,67};
        int target = 22;
        int ans = floor(arr , target);
        System.out.println(ans);
    }
//floor means the number is smaller than the mid number but greater than the number before that eg- 17 is smaller than 22 but greater than the 15 or any numbers which lie before the number
    static int floor(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
