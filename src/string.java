public class string {
    public static void main(String[] args) {
        //comparison

        //both of the object pointing toward the same value so they place in string pooling
        String a ="Sumit";
        String b = "Sumit";
        System.out.println(a==b);//true
        String c =a;
        System.out.println(c==a);//true


        //in here we are creating new string object of same values and here the object value take place outside the string pooling
        String name = new String("Sumit");
        String name2 = new String("Sumit");
        System.out.println(name==name2);//false
        // .equals method only care about values if the values are same then it will give you true it really don't care if the ref variable are pointing toward the same the object or not
        System.out.println(name.equals(name2));//true

        //another comparison
        String name3 = "Sumit";
        String name4 = "Sumit   ";
        System.out.println(name3.equals(name4));//false
        System.out.println(name4.charAt(0));// output-"S" //internally the string act like an array thats why we get the particular character fromm the string using index values


        //internal working check
        System.out.println(56);

                }

}
