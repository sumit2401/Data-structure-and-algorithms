public class duplicateelementinrotatedsortedarray {
    public static void main(String[] args) {
        int[] arr={3,3,1,3};
        int ans = findpivotinduplicate(arr);
        System.out.println(ans);
    }
    static int findpivotinduplicate(int []arr){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }

        }
        return -1;
    }
}
