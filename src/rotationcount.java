public class rotationcount {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(findcount(arr));
    }

    static int findcount(int[] arr) {
        int pivot = findpivot(arr);
       int  count = pivot+1;
       return count;
    }


    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (start > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int duplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
             if (arr[mid]>arr[mid+1]){
                 return mid;
             } else if (arr[mid]<arr[mid-1]) {
                 return mid-1;
             } else if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
                 //but what if the start and end is pivot
                 //case 1 start is pivot
                 if(arr[start]>arr[start+1]){
                     return start;
                 }// if this condition is true then return start otherwise start=start++
                 start++;
                 // check if the end is the pivot
                 if(arr[end]<arr[end-1]){
                     return end-1;
                 }
                 end--;
                 //left side is sorted that means the pivot should lie in right side of the array and we know the right side elements are smaller than the start element
             } else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[end]<arr[mid]) {
                 start = mid+1;
             }
             else{
                 end = mid-1;
             }

        }
        return -1;
    }
}
