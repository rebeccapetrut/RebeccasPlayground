public class Lab2 {
    public static int x = 3;
    public static int y = 2;
    public static int z = 10;

    public static void main(String[]args){
        Calculator calc = new Calculator();
        Print printJava = new Print();
        Speed speed = new Speed();
        speed.printSpeed(10000,1,30,15);

        double result = calc.sum(x, y);
        System.out.println(result);

        float sum = calc.sum(x, y, z);
        System.out.println(result);

        String summ = calc.sum("Hola", "amigos");
        System.out.println(result);

        int substract = calc.substract(x,y);
        System.out.println(result);

        double substract1 = calc.substract(x,y);
        System.out.println(result);

        float substract2 = calc.substract(x,y);
        System.out.println(result);

        double subresult = calc.substract(x, y);
        System.out.println(subresult);

        double devide = calc.devide(100, 2,2);
        System.out.println(devide);

        float devide1 = calc.devide(100, 23);
        System.out.println(result);

        float multiply = calc.multiply(25, 10,15);
        System.out.println(multiply);

        double derusult = calc.devide(x, y);
        System.out.println(derusult);

        double multiresult = calc.multiply(x,y);
        System.out.println(multiresult);

        double moduloresult = calc.modulo(x, y);
        System.out.println(moduloresult);

        double modullo = calc.modulo(100, 20);
        System.out.println(modullo);


        printJava.printJava();
        printJava.printMyName();
        printJava.printFace();


       int mediaresult = calc.media(10,25,5) /3;
       System.out.println("Media aritmetica este " + mediaresult);

       float media = calc.media(100,25,50) /3;
       System.out.println("Media aritmetica este " + media);

       float moduloresult2 = calc.modulo2(100, 7);
       System.out.println("Restul impartirii este " + moduloresult2);

        double modulo = calc.modulo2(100, 7, 5);
        System.out.println("Restul impartirii este " + modulo);

       double degreeresult = calc.degree(200);
       System.out.println(degreeresult + " degree Celcius");

       double disresult = calc.toMeters(100);
       System.out.println(disresult + " meters");






    }




    }




