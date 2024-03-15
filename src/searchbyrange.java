public class searchbyrange {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
                int target = 4;
        System.out.println(byrange(arr, 1 , 4 , target));

    }
// 1 and 4 are the indexex of the array
    static int byrange(int[]arr, int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            int element= arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
