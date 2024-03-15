public class pattern21 {
    public static void main(String[] args) {
        int n=5;
        int nn=n,nst=0;
//        while (row<=n){
//            for (int i=1;i<=nsn;i++){
//                System.out.print(i+" ");
//            }
//
//            for (int i=1;i<=nst;i++){
//                System.out.print("  ");
//            }
//
//            for (int i=nst;i>=1;i--){
//                System.out.print("  ");
//            }
//
//            for (int i=nsn;i>=1;i--){
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//
//            nsn--;
//            nst++;
//            row++;
//        }
        for(int row=1; row<=n; row++){
            for(int i=1; i<=nn; i++){
                System.out.print(i+" ");
            }
            for(int i= 1; i<=nst; i++ ){
                System.out.print("* ");
            }
            for(int i= nst; i>=1; i--){
                System.out.print("* ");
            }
            for(int i=nn; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
            nn--;
            nst++;
        }
    }
}
