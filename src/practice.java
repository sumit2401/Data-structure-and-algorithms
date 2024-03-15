public class practice {
    public static void main(String[] args) {
       int[] arr={1,3,4,6,7,68,72};
        System.out.println(binearysearch(arr, 4));
   }
    //sum of arrays
    static int array(){
        int sum = 0;
        int[] arr = {1,2,3,4,5,6};
        for(int i=0; i<=arr.length-1; i++){

            sum= sum+arr[i];

        }
return sum;
    }

    static int linersearch(int []arr, int target){
        for(int i=0; i<=arr.length-1;i++){
            if(target==arr[i]){
                int ans = i;
                System.out.print(ans);
            }
        }
        return -1;
    }

    static int binearysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static void bubblesort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        b=temp;
    }
}
