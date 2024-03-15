public class LINEAR_SEARCH {
   public static void main(String[] args) {
       int[] arr = {1,7,23,79,19,27,19,0,3,19};
       int target=19;
       int ans=linersearch(arr,target);
       System.out.println(ans);
   }
   static int linersearch(int[] arr, int target){
       if(arr.length==0){
           return -1 ;
       }
       for(int index = 0; index < arr.length; index ++){
           int element= arr[index];
           if(element==target){
               return index;
           }

       }
       return -1;
   }
   static boolean charactersearch(String name, char target){
      if(name.length()==0)
          return false;
   }
}
