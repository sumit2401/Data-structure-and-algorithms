public class armstrong {
    public static void main(String[] args) {
 int num = 153;
        if(isarm(num)==true){
            System.out.println("yes "+ num+ " it is armstrong number");
        }
        else{
            System.out.println("no "+ num +" is not armstrong number");
        }
    }

    static boolean isarm(int num){
        int temp, sum=0, digit=0, last=0;
        //find the digit
        temp = num;
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp=num;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last, digit));

            temp = temp/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }

//    static boolean isArmstrong(int n){
//            int temp, digits=0, last=0, sum=0;
////assigning n into a temp variable
//            temp=n;
////loop execute until the condition becomes false
//            while(temp>0)
//            {
//                temp = temp/10;
//                digits++;
//            }
//            temp = n;
//            while(temp>0)
//            {
////determines the last digit from the number
//                last = temp % 10;
////calculates the power of a number up to digit times and add the resultant to the sum variable
//                sum +=  (Math.pow(last, digits));
////removes the last digit
//                temp = temp/10;
//            }
////compares the sum with n
//            if(n==sum)
////returns if sum and n are equal
//                return true;
////returns false if sum and n are not equal
//            else return false;
//        }
////driver code

}
