import java.util.*;
public class check {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int[]arr= {7,1,14,11};
        tcs1();


//        boolean ans = checkIfExist(arr);
//        System.out.println(ans);
    }
    public static void tcs1(){

        int n=sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[n];

        int a=sc.nextInt();

        int b=sc.nextInt(); int c=sc.nextInt();

        int d=sc.nextInt();
        for (int i=1;i<n-1;i++){

            int res1=b+ i*a; int res2=d+i*c;

            arr1[i-1]=res1; arr2[i-1]=res2;

        } for(int i=0;i<arr1.length;i++) {

            int val = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (val == arr2[j]) {
                    System.out.println(val);

                    return;

                }
            }
        }
        System.out.println("No value found");
    }
   static boolean checkIfExist(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;

            for(int i = start; i<arr.length; i++){
                for(int j = mid; j<end ; j++){
                    if(arr[i]==2*arr[j]){
                        return true;
                    }
                    else if(arr[i]>2*arr[j]){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
            }
        }
        return false;
    }
}
