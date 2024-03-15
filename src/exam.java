import java.util.Scanner;

public class exam {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean isLeapYear = false;
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        System.out.printf("%d is %s a leap year.\n", n, isLeapYear ? "" : "not");
    }

}

