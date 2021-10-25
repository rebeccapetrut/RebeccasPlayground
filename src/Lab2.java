public class Lab2 {
    public static int x = 3;
    public static int y = 2;

    public static void main(String[]args){
        Calculator calc = new Calculator();
        Print printJava = new Print();

        double result = calc.sum(x, y);
        System.out.println(result);

        double subresult = calc.substract(x, y);
        System.out.println(subresult);

        double derusult = calc.devide(x, y);
        System.out.println(derusult);

        double multiresult = calc.multiply(x,y);
        System.out.println(multiresult);

        double moduloresult = calc.modulo(x, y);
        System.out.println(moduloresult);

        printJava.printJava();

    }
}
