public class recc {

 //printing number from n to 1 using recursion
    static void fun(int n){
        if(n==1){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }

    //iterative form

    static void funi(int n){
        for (int i = n; i>=1; i--){
            System.out.println(i);
        }
    }

    //----------------------------------------------------------------------

    //print number from 1 to n

    //in this first the function get execute then it print th number
    static void fun1(int n){
        if(n==0){
            return;
        }
        fun1(n-1);
        System.out.println(n+" ");
    }


    //interative

    static void fun1i(int n){
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }


    //-----------------------------------------------------------------
    //factorial of 5
    static int factorial(int n){
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);

    }

    //iterative

    static void factoriali(int n){
        int i = n;
        while(i>=1){
            int ans = n*n-1;
            System.out.println(ans);
        }
    }

    //-----------------------------------------------------------

    //sum of individual digit of the number
    static int summm(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+summm(n/10);
    }
//product of individual digit of the number
    static int product(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
  static int sum =0;
    static int reversenumber(int n){
    int digit = (int)(Math.log10(n))+1; //log10(1234) = 3.09 thats why we add 1 so that tha digit count is same as the number of digits in number.......if the number is 12335 then the log value must be around 4.903842(somthing like this) so we have to add 1 if we want the number of digits of the number
    return helper(n,digit);

    }
    private static int helper(int n , int a){
        if(n%10==n){
            return n;
        }

        int rem = n%10;
        return rem*(int)(Math.pow(10, a-1))+helper(n/10, a-1);

    }

    //palindorne

    static void palindrone(int n){

    }
    public static void main(String[] args) {

        System.out.println(reversenumber(1234));
    }
}


