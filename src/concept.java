public class concept {
    public static void main(String[] args) {
print(5);
    }

    static void print(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
//        print(n--);// infinite recursion because it will print n print then dercreese the value
       print(--n); //correct way

    }
}
