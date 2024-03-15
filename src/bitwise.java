public class bitwise {
    public static void main(String[] args) {
 int n = 5;
       bin(n);
    }
    //find the number if it is even or odd
    static boolean eno(int num){
        return ( num & 1 )==1; //if we and any number with  1 we'll get 1 that's how we prove this is odd or even
    }

    //program to convert decimal into binary code
    static void bin(int n){
        String str="";
        while( n>0){
            int rem = n%2;
            str= rem+str;
            n=n/2;

        }
        System.out.print(str);
    }
}
