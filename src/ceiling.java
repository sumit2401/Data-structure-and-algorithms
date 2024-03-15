public class ceiling {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,34,56,79,89};
//        int target = 20;
//        int ans = ceiling(arr , target);
//        System.out.println(ans);

        char[] a= {'c', 'f','j'};
        char x = 'd';
        char ans = ceiling2(a, x);
        System.out.println(ans);
    }
//smallest element in the array which is greater than tha target element
    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target >arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return start;
    }

    static char ceiling2(char[]a, char x){
        int n = a.length;

        //hi starts at 'n' rather than the usual 'n - 1'.
        //It is because the terminal condition is 'lo < hi' and if hi starts from 'n - 1',
        //we can never consider value at index 'n - 1'
        int lo = 0, hi = n;

        //Terminal condition is 'lo < hi', to avoid infinite loop when target is smaller than the first element
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > x)     hi = mid;
            else    lo = mid + 1;                 //a[mid] <= x
        }

        //Because lo can end up pointing to index 'n', in which case we return the first element
        return a[lo % n];
    }
}
