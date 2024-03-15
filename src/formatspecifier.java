import java.util.Formatter;

public class formatspecifier {
    public static void main(String[] args) {

        float a = 12.34567f;//f in  end donat that the number is float datatype
        System.out.printf("formatted number is %.3f ", a); //output = 12.345
        System.out.println();
        //printf in used when we want to find the format specifier
        //%.3f means it will give the three digit after decimal

        System.out.printf("The value of pie : %.3f",Math.PI);//output = 3.142
        System.out.println();

        System.out.printf("Hello! My name is %s and I'm a %s", "Sumit" , "Programmer");
        System.out.println();


        //second way to write format specifier
        Formatter formatter = new Formatter(); //crating new formatter class object
        formatter.format("%s","Sumit");
        System.out.println(formatter);

    }
}
