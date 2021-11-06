public class Calculator {

    //Tema ex. 2
    public double sum(int first, double second){
        double result = first + second;
        return result;
    }

    public int substract( int fisrt, int second){
        int result = fisrt - second;
        return result;
    }

    public int devide(int first, int second){
        int result = first / second;
        return result;
    }

    public int multiply(int first, int second){
        int result = first * second;
        return result;
    }

    public int modulo(int first, int second){
        int result = first % second;
        return result;
    }

    //Tema ex. 4

    public int media(int x, int y, int z){
        int mediaresult = (x + y + z);
        return mediaresult;
    }

    //Tema ex. 6

    public float modulo2( int first, float second){
        float moduloresult2 = (first % second);
        return moduloresult2;}

    //Teme ex. 7

    public double degree(double fahrenheit){
        double degreeresult = (0.55555555 * (fahrenheit-32)) ;
        return degreeresult;
    }

    //Tema ex. 8
    public double toMeters(double inch){
        double distresult= (inch * 0.0254);
        return distresult;
    }


    public static void doStuff(int y){
        y= y+5;
        System.out.println(y);
    }

}
