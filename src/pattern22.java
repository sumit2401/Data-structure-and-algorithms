public class pattern22 {
    public static void main(String[] args) {
        //            *
        //           * *
        //          * * *
        //         * * * *
        int n=4;
        int row=1;
        int nsp=n-1,nst=1;
        while(row<=n){
            for (int i=1;i<=nsp;i++){
                System.out.print("  ");
            }

            for (int i=1;i<=nst;i++){
                System.out.print("*   ");
            }

            nst++;
            nsp--;
            row++;
            System.out.println();
        }
    }
}
