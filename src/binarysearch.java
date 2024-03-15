public class binarysearch {
    public static void main(String[] args) {
    int[] arr = {-18,-12,-3,0,2,4,5,7,9,22,34,45};
    int target= 22;
    int ans = binarysearch(arr, target);
        System.out.println(ans);

    }

    // this code applicable when we know that the the array is sorted in ascending orderd
    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //int mid = (start+end)/2;  // might be possible that (start+end) exceed the range of int that why we write this as line 14
            int mid = start +(end-start)/2; // in here there is no possibilities that this exceed the range of int

        if(target<arr[mid]){ //target< mid .. that means the element lie in left side of the array
            end = mid-1;    // so the start remain the same but the end will change
        } else if (target>arr[mid]) { // in here the element lie in right side of mid in the array so in this case the end remain same but the start position is change ans that will be line no 19
            start = mid+1;
        }
        else { // if target == mid that means we find the ans here
            return mid;
        }

    }// we return -1 bcoz in case the element does not lie in the array so the program return the -1 value which actually don't lie in array
        return -1;
}
}
// in binary search the array is breaking up in parts for finidng the ans
// the reason binary search is better than linear search is bcoz the time complexity of linear is way more than the binary search

// in worst case the time complexity of binary search is log(base2)(k).. in here the k in the no. of part