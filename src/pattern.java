public class pattern {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 0; row <2*n ; row++) {
            int total =  row>n ? 2*n-row:row; //means if row>n (?)then total = 2n-row (:)otherwise total =row
            for (int col = 0; col <total ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

