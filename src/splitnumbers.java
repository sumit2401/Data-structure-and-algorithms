public class splitnumbers {
    public static void main(String[] args) {
int [] arr= {7,2,5,10,8};
int m = 2;
        System.out.println(splitarray(arr, m));
    }

    static int splitarray(int[] arr, int m) {// here m no. of subarrays
        int start = 0;// initial start and end both are zero
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);// it gives us the maximum value element
            //math.min gives us the minimum value element
            end += arr[i]; // end = end+arr[i]
        }
        //the maximum number of subarray from an array = length of an array and the minimum number of subarray is one which itself is original array
        //now our start= minimum value of array after take the sum .... so this min value come from the maximum no. of sublayer
        //end = maximum value after sum...... sum of whole array
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int piece = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    //if the sum of subarray exceed the value of mid then we have to make the new array
                    sum = num;
                    piece++;//increment of subarrays
                }
                else{
                    sum+=num;//sum=sum+num
                }

            }
            if(piece>m){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return end;// we can return start too because in the end the start=end
    }

//    public class SplitArray {
//        public static void main(String[] args) {
//
//        }
//
//        public int splitArray(int[] nums, int m) {
//            int start = 0;
//            int end = 0;
//
//            for (int i = 0; i < nums.length; i++) {
//                start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
//                end += nums[i];
//            }
//
//            // binary search
//            while (start < end) {
//                // try for the middle as potential ans
//                int mid = start + (end - start) / 2;
//
//                // calculate how many pieces you can divide this in with this max sum
//                int sum = 0;
//                int pieces = 1;
//                for(int num : nums) {
//                    if (sum + num > mid) {
//                        // you cannot add this in this subarray, make new one
//                        // say you add this num in new subarray, then sum = num
//                        sum = num;
//                        pieces++;
//                    } else {
//                        sum += num;
//                    }
//                }
//
//                if (pieces > m) {
//                    start = mid + 1;
//                } else {
//                    end = mid;
//                }
//
//            }
//            return end; // here start == end
//        }
//    }
}
