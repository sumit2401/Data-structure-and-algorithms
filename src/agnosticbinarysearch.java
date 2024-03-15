public class agnosticbinarysearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-3,0,2,4,5,7,9,22,34,45};
        int target= 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    // this method is applicale when we know the array is sorted but we don't know the order in which order the array is sorted
    static int binarysearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
         boolean isasc = arr[start]<arr[end];// here we check if  the array is in asc order or in desc order
         while(start<=end){

             int mid= start+ (end-start)/2;

             if(arr[mid]==target) {
            return mid;
             }
             if(isasc){

                 if(target<arr[mid]){ //target< mid .. that means the element lie in left side of the array
                     end = mid-1;    // so the start remain the same but the end will change
                 } else if (target>arr[mid]) { // in here the element lie in right side of mid in the array so in this case the end remain same but the start position is change ans that will be line no 19
                     start = mid+1;
                 }

                 else{

                     if(target>arr[mid]){ //target< mid .. that means the element lie in left side of the array
                         end = mid-1;    // so the start remain the same but the end will change
                     } else { // in here the element lie in right side of mid in the array so in this case the end remain same but the start position is change ans that will be line no 19
                         start = mid+1;
                     }
                     }
                 }
             }
        return -1;
         }

    }

