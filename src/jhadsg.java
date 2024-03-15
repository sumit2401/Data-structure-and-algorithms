public class jhadsg {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);// it gives us the maximum value element
            //math.min gives us the minimum value element
            end += arr[i];
        }
        System.out.println(start + "and" + end);

    }
}
