public class findmin {
    public static void main(String[] args) {
        int[] arr= {5,6,3,2,4,6};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
