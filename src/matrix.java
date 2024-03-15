import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] arr = { //this is avctually an dynamic array where the column has not a fixed size
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        //we can't print the array without using loop remember that shit
        for (int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){ //arr[row] means what is the array at that particular row... and the column loop run till the length of the array at that row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
