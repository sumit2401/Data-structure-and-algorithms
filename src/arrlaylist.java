import java.util.ArrayList;
import java.util.Scanner;

public class arrlaylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.set(2,20); //update 20 in 2nd index
//        list.clear(20);
//        System.out.println(list.contains(10));
//        System.out.println(list);

        Scanner sc =  new Scanner(System.in);


        for(int i =0; i<5; i++){
            list.add(sc.nextInt());
        }

        for(int i =0; i<5; i++){
            System.out.print(list.get(i)); //here i is the index value

        }

    }

}
