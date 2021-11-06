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

        double subresult = calc.substract(x, y);
        System.out.println(subresult);

        double derusult = calc.devide(x, y);
        System.out.println(derusult);

        double multiresult = calc.multiply(x,y);
        System.out.println(multiresult);

        double moduloresult = calc.modulo(x, y);
        System.out.println(moduloresult);

        printJava.printJava();
        printJava.printMyName();
        printJava.printFace();


       int mediaresult = calc.media(10,25,5) /3;
       System.out.println("Media aritmetica este " + mediaresult);

       float moduloresult2 = calc.modulo2(100, 7);
       System.out.println("Restul impartirii este " + moduloresult2);

       double degreeresult = calc.degree(200);
       System.out.println(degreeresult + " degree Celcius");

       double disresult = calc.toMeters(100);
       System.out.println(disresult + " meters");




       int x= 10;
       calc.doStuff(x);

    }




    }




