import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {


    //Tema ex. 1
    // am adaugat in metoda si try & catch (desi nu se cerea in tema)
    // pentru ca folosesc metoda in programul Java si vreau sa acopar si ipoteza in care
    // nu introduci un int/double pentru a selecta meniul

    public int getInt() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please enter a number.");
                int x = scan.nextInt();
                return x;
            } catch (InputMismatchException exception) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    //Tema ex. 2
    public float getFloat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        float x = scan.nextFloat();
        return x;
    }

    public double getDouble() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please enter a number.");
                double x = scan.nextDouble();
                return x;
            } catch (InputMismatchException exception) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    public String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String.");
        String x = scan.next();
        return x;

    }

    //Tema ex.3

    public int[] getArray(int size) {
        int[] myArray = new int[size];
        System.out.println("Enter the array values.");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getInt();
        }
        return myArray;
    }

    //Tema ex. 4

    public int getIntList() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value!");
            }
        } while (true);
    }


    public List<Integer> getList() {
        List<Integer> myList = new ArrayList<>();
        System.out.println("Enter the ArrayList values.");

        myList.add(getIntList());

        return myList;
    }


}
