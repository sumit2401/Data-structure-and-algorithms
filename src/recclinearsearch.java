//import java.util.ArrayList;
//
//public class recclinearsearch {
//    public static void main(String[] args) {
//     int[] arr = {3,1,2,18,9};
//        System.out.println(find(arr, 18, 0));
//        System.out.println(findindex(arr, 18, 0));
////        System.out.println(findindexlast(arr, 18, arr.length-1));
//
//
//    }
//
//    //check weather the element exist in the array or not
//
//    //for returning ture or false
//    static boolean find( int[]arr,int target, int index){
//        if(index==arr.length){
//            return false;
//        }
//        return arr[index]==target || find(arr, target, index+1);
//    }
//
//    //for returning index
//    static int findindex(int[] arr, int target, int index){
//        if(index== arr.length){
//            return -1; //returning -1 bcoz the element doesnot exist
//        }
//
//        if (arr[index]== target){
//            return index;
//        }
//        else{
//            return findindex(arr, target, index+1);
//        }
//    }
////    static int findindexlast(int[]arr, int target, int index) {
////        if (index == -1) {
////            return -1;
////        }
////        if (arr[index] == target) {
////            return index;
////        }
////        else {
////           return findindexlast(arr, target, index - 1);
////        }
////    }
//
//    static ArrayList<Integer> list = new ArrayList<>();
//    static int addlist(int[] arr, int target, int index){
//        if (index == -1) {
//            return -1;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        else {
//            return findindexlast(arr, target, index - 1);
//        }
//    }
//}
