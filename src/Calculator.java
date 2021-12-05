public class Calculator {


    //Tema ex. 1 21.11.21

    //Tema ex. 2
    public double sum(int first, double second) {
        double result = first + second;
        return result;
    }

    //new
    public float sum(int first, float second, int third) {
        float result = first + second + third;
        return result;
    }

    //new
    public String sum(String first, String second) {
        String result = first + second;
        return result;
    }


    public int substract(int fisrt, int second) {
        int result = fisrt - second;
        return result;
    }

    //new
    public double subtract(double fisrt, double second) {
        double result = fisrt - second;
        return result;
    }

    //new
    public float subtract(float fisrt, float second) {
        float result = fisrt - second;
        return result;
    }


    public int divide(int first, int second) {
        int result = first / second;
        return result;
    }

    //new
    public double divide(double first, double second, double third) {
        double result = first / second / third;
        return result;
    }

    //new
    public float devide(float first, int second) {
        float result = first / second;
        return result;
    }


    public int multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    //new
    public float multiply(float first, float second, float third) {
        float result = first * second * third;
        return result;
    }

    //new
    public double multiply(int first, int second, double third, double fourth) {
        double result = first * second * third * fourth;
        return result;
    }

    public int modulo(int first, int second) {
        int result = first % second;
        return result;
    }

    //new
    public double modulo(double first, double second) {
        double result = first % second;
        return result;
    }
    //new
    public float modulo(int first, int second, float third) {
        float result = first % second % third;
        return result;
    }

    //Tema ex. 4

    public int media(int x, int y, int z) {
        int mediaresult = (x + y + z);
        return mediaresult;
    }

    public float media(float x, float y, float z) {
        float media = (x + y + z);
        return media;
    }

    //Tema ex. 6

    public float modulo2(int first, float second) {
        float moduloresult2 = (first % second);
        return moduloresult2;
    }

    public double modulo2(int first, double second, double third) {
        double modulo = (first % second % third);
        return modulo;
    }

    //Teme ex. 7

    public double degree(double fahrenheit) {
        double degreeresult = (0.55555555 * (fahrenheit - 32));
        return degreeresult;
    }

    //Tema ex. 8
    public double toMeters(double inch) {
        double distresult = (inch * 0.0254);
        return distresult;
    }


}

