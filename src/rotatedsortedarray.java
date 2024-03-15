public class rotatedsortedarray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int ans = leet(arr);
        System.out.println(ans);
    }
    static int findpivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            //case no.1
            if(mid<end && arr[mid]>arr[mid+1]){
                // we write the case mid<end , suppose at some point the mid is the end element of array then the mid+1 element is out of range element in this case it shows us error
                //this mid<end check the mid is always less than end so that it can't exceed the range of array or length of array
                // if the first condition is not true than the system will not goin to check arr[mid]>arr[mid+1]
                return mid;
            }

            //case no.2
            // if the mid>start is not true then the system will not consider arr[mid]<arr[mid-1]
            else if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case  no.3
            else if(arr[start]>=arr[mid]){
                end= mid-1;
            }
            //case no.4
            else if(arr[start]<arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }

    static int findmin(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            //case no.1
            if(mid<end && arr[mid]>arr[mid+1]){
                // we write the case mid<end , suppose at some point the mid is the end element of array then the mid+1 element is out of range element in this case it shows us error
                //this mid<end check the mid is always less than end so that it can't exceed the range of array or length of array
                // if the first condition is not true than the system will not goin to check arr[mid]>arr[mid+1]
                return mid;
            }

            //case no.2
            // if the mid>start is not true then the system will not consider arr[mid]<arr[mid-1]
            else if (mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            //case  no.3
            else if(arr[start]<=arr[mid] && arr[mid]>arr[end]){
                start= mid+1;
            }
            //case no.4
            else {
                end=mid-1;
            }
        }
        return arr[start];
    }

    static int leet(int[] num){
        if (num == null || num.length == 0) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && num[mid] < num[mid - 1]) {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return num[start];
    }

}
