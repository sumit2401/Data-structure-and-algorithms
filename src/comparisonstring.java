import java.util.Arrays;

public class comparisonstring {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("sumit");
        System.out.println( new int[]{1,2,3,4});// the output of this print method is some random character and numbers because it was using java compiler default toString() method
        //if we want the desired output the override the toString() method
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); //output - [1, 2, 3, 4]

    }
}
