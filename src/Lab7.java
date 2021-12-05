import java.util.List;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Read read = new Read();
//        int x = read.getInt();
//        System.out.println("The number is: " + x);
//
//        float y = read.getFloat();
//        System.out.println("The number is: " + y);
//
//        double z = read.getDouble();
//        System.out.println("The number is: " + z);
//
//        String a = read.getString();
//        System.out.println("The String is: " + a);


        LogicalOperation op = new LogicalOperation();
//        int[] array = read.getArray(5);
//        op.printArray(array);


//        List<Integer> myList = read.getList();
//        op.printMyList(myList);

        int[] myArray = {1,2,3,4,5};
        op.getArrayPosition(myArray, 1);






    }

}
