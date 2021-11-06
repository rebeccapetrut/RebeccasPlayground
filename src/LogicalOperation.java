public class LogicalOperation {

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
        String x = "The number is ";
        int y = 2;
        switch (y){
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


    }
