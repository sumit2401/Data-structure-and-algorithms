public class binaryrecursion {
    public static void main(String[] args) {
    int[] arr= {1,2,3,4,52,66,78};
    int target = 3;
        System.out.println(search(arr, target, 0,arr.length-1));
    }
    //binary search using recursion
    static int search(int[]arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(target>arr[mid]){
            return search(arr, target, mid+1,end);
        }
        if(target<arr[mid]){
            return search(arr, target, start, mid-1);
        }
        else{
            return mid;
        }
    }
}
