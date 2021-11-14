public class LogicalOperation{

    //Tema ex. 4

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else if (!text.equals("FastTrack")) {
            return ("Got to try some more");
        }
        return ("Try again!");
    }

    //Tema ex. 5

    public String verifyProvidedText(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        }

        return "Not found!";

    }

    //Tema ex. 6

    public String snow(int first) {
        if (first > 8 || first == 6){
        return ("The amount of snow this winter was(cm): " + first);
    }else
        return "Oh the weather outside is frightful";}

    //Tema ex. 7

    public String verifyNumber (int first){
        if (first > 3 && first !=4){
            return ("The number is greater than 3 and not equal to 4");
        }else if (first == 4){
            return ("The number is eqaul to 4");
        }else if (first < 3){
            return ("The number is lower than 3");
        }return "Not your lucky day!";
    }

    //Tema ex. 8
    public void givenNumber (int first){
        switch (first){
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;

        }
    }


    //Tema ex. 9

    public boolean isNumberEven (int first){
        if (first % 2 == 0){
            return true;
        }else if (first % 2 == 1){
            return false;
        }
        return true;
    }

    //Tema ex. 10

    public boolean isEligibleToVote (int first){
        if (first > 18){
            return true;
        }else if (first < 18){
            return false;
        }
        return true;
    }

    //Tema ex. 11

    public int biggerNumber(int first, int second, int third){
        if (first > second && first > third){
            return first;
        }else if (second > first && second > third){
            return second;
        }else {
            return third;
        }
        }



    //14.11.21
    //Tema ex. 1

    public void showNumbers (int first){
        for (int x = first; x <= 100; x++){
            System.out.println(x);
        }
    }

    //Tema ex. 2

    public void showNumbersReverse (int first){
        for(int x = first; x >= -100; x--){
            System.out.println(x);
        }
    }

    //Tema ex. 3

    public void showTheTheNumbers(int first, int last){
        for (int x = first; x <= last; x++){
            System.out.println(x);
        }
    }

//    //Tema ex. 4

    public void biggerNumber(int first, int last){
        for (int x = first; x <= last; x++) {
            System.out.println(x);
        }
            for (int y = last; y <= first; y++){
                System.out.println(y);
            }
    }



    //Tema ex. 5

    public void evenNumber (int small, int big) {
        for (int x = small; x <= big; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //Tema ex. 6

    public void oddNumber (int small, int big){
        for (int x = small; x <= big; x++){
            if (x % 2 == 1){
                System.out.println(x);
            }
        }
    }


    //Tema ex. 7
    public int sumTheNumbers(int first) {
        int sum = 0;
        for (int x = first; x <= 100; x++) {
            sum = x + sum;
        }
        return sum;
    }

    //Tema ex. 8
    public float sumAndAvarage (int first){
        int sum = 0;
        for (int x = first; x <= 100; x++){
            sum = x + sum;
        }
        return (float) sum/ (100 - first + 1);
    }

   //Tema ex. 9
    public void printStars(){
    for (int x = 7; x >= 0; x--){
        System.out.println("*");
        System.out.println(" ");
        for (int y = 1; y < x; y++) {
            System.out.print("*");
        }
    }
}


    //Tema ex. 1 While
    public void countNumbers (int first){
        int x = first;
        while (x <= 100){
            System.out.println(x);
            x++;
        }
    }

    //Tema ex. 2
    public void countNumbersBackwords (int first){
        int x = first;
        while (x >= -100){
            System.out.println(x);
            x--;
        }
    }

    //Tema ex. 3
    public void countBetweenNumbers (int first, int last){
        int x = first;
        while (x <= last){
            System.out.println(x);
            x++;
        }
    }

    //Tema ex. 4
    public void verifyBiggerNumber(int small, int big){
        int x = small;
        int y = big;
        while (x <= y){
            x++;
            System.out.println(x);
        }
        while (y <= x){
            y++;
            System.out.println(y);
        }
  }


    //Tema ex. 5
    public void evenNumbers (int first, int last){
        int x = first;
        while (x <= last){
            if (x % 2 == 0){
            System.out.println(x);
        }
            x++;
        }
    }

    //Tema ex. 6
    public void oddNumbers (int first, int last){
        int x = first;
        while (x <= last){
            if (x % 2 ==1){
                System.out.println(x);
            }
            x++;
        }
    }

    //Tema ex. 7

    public void sumTheInterval (int first, int last){
        int x = first;
        float sum = 0;
        int count = 0;
        while ( x <= last){
            sum = x + sum;
            count++;
            x++;
        }
        System.out.println(sum/count);
    }


    //Tema ex. 8
    public void getAverageDivisibleBySeven(int first, int last){
        int x = first;
        float sum = 0;
        int count = 0;
        while (x <= last){
            if (x % 7 == 0){
                sum = x+ sum;
                count++;
            }
            x++;
        }
        System.out.println(sum/count);
    }

//    //Tema ex. 9
    public void FibonacciPower(){
        int count = 20;
        int x = 0;
        int y = 1;
        int z = 1;
        while (z < count){
            int sum = x + y;
            x = y;
            y = sum;
            System.out.print(x + ", ");
            z++;
        }
        System.out.println("");

    }

    //Tema ex. 10

    // Nu stiu exact daca macar m-am apropiat cat de cat de idea corecta a codului, daaaar, exceptand faptul ca
    // nu-mi mai dau seama cum ar trebui sa fac sa imi afiseze doar 11 pe linie, daca vreau sa le scriu while in while
    // (si ma gandesc ca asa ar si trebui scrise) imi rezulta un sir de cifre care nu prea are vreun sens,
    // iar daca le scriu fiecare while separat mi-l executa doar pe primul (cel cu multiplu de 3)
    // si restul numerelor mi le afiseaza normal, deci ma gandesc ca ideea e oarecum buna dar imi scapa ceva :))
    // anyway.. o sa mai lucrez in seara asta la el poate ii dau de capat :D

    public void CozaLozaWoza(int first, int last) {
        int a = first;
        int x = last;
        while (a < last) {
            if (a % 3 == 0) {
                System.out.print(" Coza ");
            } else if (a % 3 != 0) {
                System.out.print(a);
            }
            a++;
        }

        while (a < last) {
            if (a % 5 == 0) {
                System.out.print(" Loza ");
            } else if (a % 5 != 0) {
                System.out.print(a);
            }
            a++;
        }

        while (a < last) {
            if (a % 7 == 0) {
                System.out.print(" Woza ");
            } else if (a % 7 != 0) {
                System.out.print(a);
            }
            a++;
        }

            while (a < last) {
                if (a % 3 == 0 && a % 5 == 0) {
                    System.out.print(" CozaLoza ");
                } else if (a % 3 != 0 && a % 5 != 0) {
                    System.out.print(a);
                }
                a++;
            }

                while (a < last) {
                    if (a % 3 == 0 && a % 7 == 0) {
                        System.out.print(" CozaWoza ");
                    } else if (a % 3 != 0 && a % 7 != 0) {
                        System.out.print(a);
                    }
                    a++;
                }

                    while (a < last) {
                        if (a % 5 == 0 && a % 7 == 0) {
                            System.out.print(" WozaLoza ");
                        } else if (a % 5 != 0 && a % 7 != 0) {
                            System.out.print(a);
                        }
                        a++;
                    }

                        while (a < last) {
                            if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
                                System.out.print(" ColaLozaWoza ");
                            } else if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0) {
                                System.out.print(a);
                            }
                            a++;
                        }
                    }
                }