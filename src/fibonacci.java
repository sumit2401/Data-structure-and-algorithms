public class fibonacci {
    public static void main(String[] args) {
int ans = fibo(4);
        System.out.println(ans);
    }
    //fibonacci using recursion
    //this is not the best way to write the code because in here there are many repeated funtions calls which cause it increase the complexity of the program
    static int fibo(int n){
        //the base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }


    //if we the recursive tree of fibonacci series you'll get that many function are repeated itself many times

    //                 f(4)
    //             /          \
  //            f(3)    +     f(2)
    //           / \          /  \
    //       f(2) + f(1)   f(1) + f(0)
//            /\
    //    f(1)+f(0)

    //as you can see in the upper recursive tree of fibonacci series the f(2) is repeating itself which cause the increasing of complexity that's why we use dynamic program
}
