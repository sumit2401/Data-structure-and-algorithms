//public class mountainarray {
//    public static void main(String[] args) {
//        //peak array means the array is sorted in first increasing and then decreasing
//        // {1,2,3,4,5,4,2,1}.. here 5 is the peak element or the max number in the array
//
//        // so  in here first we find the mid and then check the condition if mid> mid+1 or not or mid < mid-1;
//    }
//    static int mountain(int[]arr ){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<end){
//            int mid  =  start +(end-start)/2;
//            if(arr[mid]> arr[mid+1]){
//                //if this condition is true that means we are in the ascending order
//                //that means the element is lie in left side
//                end = mid;// end ==mid because we know that the mid+1 element is not greater or the peak.. but it's not confirm that the middle element is not peak that's why we take end = mid
//            }
//            else{// if the above condition is not true that means the element lie in right side of the array
//                // and also means that we are in the ascending order side
//                start = mid+1;
//            }
//        }
//    }
//
//
//}
