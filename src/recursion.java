public class recursion {
    public static void main(String[] args) {
     recursionexample(1);
        System.out.println();
        print1(1);
    }

//    public static int sum(int k) {
//            if (k > 0) {
//                return k + sum(k - 1); //10+9+8+7+6+5+4+3+2+1
//            } else {
//                return 0;
//            }
//        }

        static void recursionexample(int n){
        //it is the condition where your function stop making new call.... if we don't put this base conditointhe function call itself indefintely{infinitly)
            if(n==10){ //base condition in recursion
                System.out.println(10);
                return;
            }
            System.out.println(n); //body
            //recursion call(means the function call itself)
            recursionexample(n+1);

        }
        //elaboration of upper recursionexample

    //all the lower functions which are create are the elaboration of upper recursionexample
        static void print1(int n ){
            System.out.println(n);
            print2(2);
        }
    static void print2(int n ){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n ){
        System.out.println(n);
        print4(4);
    }  static void print4(int n ){
        System.out.println(n);
        print5(5);
    }  static void print5(int n ){ //this is the base condition where the function isn't call other function
        System.out.println(n);//this is the condition where the program will stop running and remove from the stack memory

    }





    }

