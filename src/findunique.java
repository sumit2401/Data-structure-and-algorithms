public class findunique {
    public static void main(String[] args) {
        //find the unique number from the array
        int[] arr={1,2,3,6,3,2,1};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;
        //apply for each loop
        for(int n:arr){ //for every n in array
            unique^=n; //xor the array... so in xor the a^a =0 so the element which are repeated will convert in zero and the only number which is unique left
        }
        return unique;
    }

}
