import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        if (first > 8 || first == 6) {
            return ("The amount of snow this winter was(cm): " + first);
        } else
            return "Oh the weather outside is frightful";
    }

    //Tema ex. 7

    public String verifyNumber(int first) {
        if (first > 3 && first != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (first == 4) {
            return ("The number is eqaul to 4");
        } else if (first < 3) {
            return ("The number is lower than 3");
        }
        return "Not your lucky day!";
    }

    //Tema ex. 8
    public void givenNumber(int first) {
        switch (first) {
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

    public boolean isNumberEven(int first) {
        if (first % 2 == 0) {
            return true;
        } else if (first % 2 == 1) {
            return false;
        }
        return true;
    }

    //Tema ex. 10

    public boolean isEligibleToVote(int first) {
        if (first > 18) {
            return true;
        } else if (first < 18) {
            return false;
        }
        return true;
    }

    //Tema ex. 11

    public int biggerNumber(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }


    //14.11.21
    //Tema ex. 1

    public void showNumbers(int first) {
        for (int x = first; x <= 100; x++) {
            System.out.println(x);
        }
    }

    //Tema ex. 2

    public void showNumbersReverse(int first) {
        for (int x = first; x >= -100; x--) {
            System.out.println(x);
        }
    }

    //Tema ex. 3

    public void showTheTheNumbers(int first, int last) {
        for (int x = first; x <= last; x++) {
            System.out.println(x);
        }
    }

//    //Tema ex. 4

    public void biggerNumber(int first, int last) {
        for (int x = first; x <= last; x++) {
            System.out.println(x);
        }
        for (int y = last; y <= first; y++) {
            System.out.println(y);
        }
    }


    //Tema ex. 5

    public void evenNumber(int small, int big) {
        for (int x = small; x <= big; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //Tema ex. 6

    public void oddNumber(int small, int big) {
        for (int x = small; x <= big; x++) {
            if (x % 2 == 1) {
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
    public float sumAndAvarage(int first) {
        int sum = 0;
        for (int x = first; x <= 100; x++) {
            sum = x + sum;
        }
        return (float) sum / (100 - first + 1);
    }

    //Tema ex. 9
    public void printStars() {
        for (int x = 7; x >= 0; x--) {
            System.out.println("*");
            System.out.println(" ");
            for (int y = 1; y < x; y++) {
                System.out.print("*");
            }
        }
    }


    //Tema ex. 1 While
    public void countNumbers(int first) {
        int x = first;
        while (x <= 100) {
            System.out.println(x);
            x++;
        }
    }

    //Tema ex. 2
    public void countNumbersBackwords(int first) {
        int x = first;
        while (x >= -100) {
            System.out.println(x);
            x--;
        }
    }

    //Tema ex. 3
    public void countBetweenNumbers(int first, int last) {
        int x = first;
        while (x <= last) {
            System.out.println(x);
            x++;
        }
    }

    //Tema ex. 4
    public void verifyBiggerNumber(int small, int big) {
        int x = small;
        int y = big;
        while (x <= y) {
            x++;
            System.out.println(x);
        }
        while (y <= x) {
            y++;
            System.out.println(y);
        }
    }


    //Tema ex. 5
    public void evenNumbers(int first, int last) {
        int x = first;
        while (x <= last) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    //Tema ex. 6
    public void oddNumbers(int first, int last) {
        int x = first;
        while (x <= last) {
            if (x % 2 == 1) {
                System.out.println(x);
            }
            x++;
        }
    }

    //Tema ex. 7

    public void sumTheInterval(int first, int last) {
        int x = first;
        float sum = 0;
        int count = 0;
        while (x <= last) {
            sum = x + sum;
            count++;
            x++;
        }
        System.out.println(sum / count);
    }


    //Tema ex. 8
    public void getAverageDivisibleBySeven(int first, int last) {
        int x = first;
        float sum = 0;
        int count = 0;
        while (x <= last) {
            if (x % 7 == 0) {
                sum = x + sum;
                count++;
            }
            x++;
        }
        System.out.println(sum / count);
    }

    //    //Tema ex. 9
    public void FibonacciPower() {
        int count = 20;
        int x = 0;
        int y = 1;
        int z = 1;
        while (z < count) {
            int sum = x + y;
            x = y;
            y = sum;
            System.out.print(x + ", ");
            z++;
        }
        System.out.println("");

    }

    //Tema ex. 10
    public void CozaLozaWoza(int first, int last) {
        int a = first;
        int x = last;
        while (a < last) {
            if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
                System.out.print(" ColaLozaWoza ");
            } else if (a % 5 == 0 && a % 7 == 0) {
                System.out.print(" WozaLoza ");
            } else if (a % 3 == 0 && a % 7 == 0) {
                System.out.print(" CozaWoza ");
            } else if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(" CozaLoza ");
            } else if (a % 7 == 0) {
                System.out.print(" Woza ");
            } else if (a % 5 == 0) {
                System.out.print(" Loza ");
            } else if (a % 3 == 0) {
                System.out.print(" Coza ");
            } else {
                System.out.print((a + " "));
            }
            if (a % 11 == 0) {
                System.out.println();
            }

            a++;

        }
    }


    // 21.11.21

    //Tema ex. 1

    // Inca nu am facut principiul polimorfismului, urmeaza sa il facem abia luni. Dar am
    // cautat niste informatii despre el.. nu stiu in ce masura o sa fie ok cum am rezolvat.
    // Eu am inteles ca prin intermediul acestui principiu impreuna cu mostenirea poti crea o clasa
    // care sa mosteneasca o alta clasa, si care sa suprascrie functinalitatea unei metode din clasa
    // pe care a mostenit-o.
    // Iar strict legat de exercitiul de la tema, eu am multiplicat, sa zic asa, metodele din clasa
    // Calculator, la care am modificat numarul sau tipul de parametri.

    //Tema ex. 2

    public int[] populateArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    //Tema ex. 3
    public int[] populateMyArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }


    public int[] returnevenNumbersInArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                System.out.println(myArr[i]);
            }
        }
        return myArr;
    }

    //Tema ex. 4
    public int[] populateThisArray(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < max; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public float getAverageValueFromArray(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum / array.length);
    }

    //Tema ex. 5
    public String[] populateTheArray() {
        String[] hobbiesArr = new String[5];
        hobbiesArr[0] = "eating";
        hobbiesArr[1] = "sleeping";
        hobbiesArr[2] = "shopping";
        hobbiesArr[3] = "complaining";
        hobbiesArr[4] = "learning";
        return hobbiesArr;
    }

    public boolean isValueInArray(String[] hobbiesArr, String value) {
        for (int i = 0; i < hobbiesArr.length; i++) {
            if (hobbiesArr[i].equals(value)) {
                return true;
            }
        }
        return false;

    }

    //Tema ex. 6
    public int[] populatethisArray(int max) {
        int[] thisArray = new int[max];
        for (int i = 0; i < thisArray.length; i++) {
            thisArray[i] = i + 1;
        }
        return thisArray;
    }

    public int verifyNumberFromArray(int[] thisArray, int value) {
        for (int i = 0; i < thisArray.length; i++) {
            if (thisArray[i] == value) {
                return thisArray[i] - 1;
            }
        }
        return value;
    }

    //Tema ex. 7
    public String[] figureLines() {
        String liness = "- - - - - - - - - -";
        String[] linesArray = new String[10];
        for (int i = 0; i < linesArray.length; i++) {
            linesArray[i] = liness;
        }
        return linesArray;
    }

    public void printLines(String[] linesArr) {
        for (int i = 0; i < linesArr.length; i++) {
            System.out.println(linesArr[i]);
        }

    }

    //Tema ex. 8
    public int[] populateTheArraypls(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public int[] verifyNumberFromTheArray(int[] myArrray, int value) {
        if (isValueInArray(myArrray, value)) {
            int[] secondArray = new int[myArrray.length - 1];
            for (int i = 0, j = 0; i < myArrray.length; i++) {
                if (myArrray[i] != value) {
                    secondArray[j] = myArrray[i];
                    j++;
                }
            }
            return secondArray;
        }
        return myArrray;
    }


    //Tema ex. 9 - aici am gasit metoda asta cu conceptul de MAX_VALUE, pe care l-am inteles, dar
    // nu imi dau seama de ce in main imi afiseaza pozitia din memorie a array-ului, daca in sout
    // i-am dat array-u pe care l-am tratat in metoda

    public int[] returnSecondSmallerNumberFromArray(int[] array9) {
        int smallest = Integer.MAX_VALUE;
        int secondSmalest = Integer.MAX_VALUE;
        for (int i = 0; i < array9.length; i++) {
            if (array9[i] < smallest) {
                secondSmalest = smallest;
                smallest = array9[i];
            } else if (array9[i] < secondSmalest) {
                secondSmalest = array9[i];
            }
        }
        return array9;
    }

    public int getSecondSmallestNrInArray(int[] myArray) {
        int temporary = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }


    //Tema ex. 10 - aici nu mi-am dat seama cum sa copiez array-ul populat in cel nepopulat, sau
    //si in cazul in care l-am rezolvat bine in main imi afiseaza tot pozitia array-ului din memorie

    public int[] populatetheArr(int max) {
        int[] theArray = new int[max];
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = i + 1;
        }
        return theArray;
    }

    public int[] emptyArray(int max) {
        int[] emptyArray = new int[max];
        return emptyArray;
    }

    public void copyValueFromPopulateArray(int[] theArray, int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = theArray[i];
            System.out.println(emptyArray[i]);
        }

    }

    //28.11.21
    //Tema ex. 1

    public List<Integer> getListPopulated(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            myList.add(i);
        }
        return myList;
    }

    public void printMyList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //Tema ex. 2

    public void printMyList(List<Integer> myList, int number) {
        for (int i = 0; i < myList.size(); i++) {
        }
        myList.add(myList.lastIndexOf(number));
        System.out.println(myList);
    }

    //Tema ex. 3


    public List<Integer> getPopulatedList(double max) {
        List<Integer> myList3 = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList3.add(i);
        }
        return myList3;
    }

    public void printThisList(List<Integer> myList, int value) {
        for (int i = value; i <= myList.size(); i++) {
            System.out.println(myList.get(i - 1));
        }
    }


    // Tema ex. 4

    public List<Integer> getPopulatedList(float max) {
        List<Integer> myList3 = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList3.add(i);
        }
        return myList3;
    }

    public List<Integer> getPopulatedList(int max) {
        List<Integer> myList4 = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList4.add(i);
        }
        return myList4;
    }

    public void getReverseList(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    //Tema ex. 5

    public List<String> myStringList(int max) {
        List<String> myStringList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myStringList.add(0, "That's");
            myStringList.add(1, "the");
            myStringList.add(2, "way");
            myStringList.add(3, "I");
            myStringList.add(4, "like");
            myStringList.add(5, "it");
        }
        return myStringList;

    }

    public void printMyList(List<String> myStringList, int number, String value) {
        for (int i = 0; i < myStringList.size(); i++) {
        }
        myStringList.add(number, value);
        System.out.print(myStringList);
    }

    //Tema ex. 6 - aici nu stiu de ce nu vrea sa puna numarul pe prima pozitie :))
    // am incercat si cu index 0, si fara index in ideea ca poate il pune pe prima pozitie automat, no luck
    // si nu imi dau seama de ce pune un numar mai mic decat cel introdus, gen 2 in loc de 3

    public void printMyList(List<Double> my6List, double number) {
        for (int i = 0; i < my6List.size(); i++) {
            my6List.add(0, number);
            System.out.println(my6List);
        }

    }

    //Tema ex. 7 aici ma gandesc ca nu trebuia sa scriem manual cu sout pozitiie, nu stiu daca e
    // ok ideea, daaar nu reusesc sa il fac pe j sa porneasca de la valoarea 0,
    // am incercat si j = i-1 dar imi zice ca e out of bounds
    // si nu stiu exact unde ar trebui sa pun sout pentru ca asa cum e acum imi afiseaza fiecare valoare
    // de 5 ori, adica lungimea listei; daca il pun in al 2-lea for nu mai citeste variabila j

    public void printThisMfList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                System.out.println("Pe pozitia " + myList.get(j) + " este valoarea " + myList.get(i));
            }
        }
    }

    //Tema ex. 8

//    public void getTheBiggerNumber(List<Integer> myList){
//        for(int i = 0; i < myList.size(); i++){
//            System.out.println(Collections.max(myList));
//        }
//    }

    public int getTheBiggerNumber(List<Integer> myList) {
        List<Integer> myStringList = new ArrayList<>();
        myList.add(10);
        myList.add(1);
        myList.add(16);
        myList.add(6);
        myList.add(9);
        myList.add(65);
        int max = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
            }
        }
        return max;
    }

    //Tema optionala liste
    //ex. 1

    public List<Integer> getTheListPopulated(int number) {
        List<Integer> myExtraList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            myExtraList.add(i);
        }
        return myExtraList;
    }

    public void printSwitchedPositionFromList(List<Integer> myExtraList) {
        myExtraList.set(0, 5);
        myExtraList.set(4, 0);
        System.out.println(myExtraList);
    }

    //Tema ex. 2 - si aici imi afiseaza o valoare de atatea ori cat e lista de lunga

    public List<Integer> printEvenList(List<Integer> myExtraList3) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < myExtraList3.size(); i++) {
            for (int j = 0; j < myExtraList3.size(); j++) {
                if (i % 2 == 0) {
                    evenList.add(myExtraList3.get(i));
                }
            }
        }
        return evenList;
    }

    //Tema ex. 3

    public List<Integer> getSortedListFromUnsorted(List<Integer> unsortedList) {
        unsortedList.add(0, 10);
        unsortedList.add(1, 5);
        unsortedList.add(2, 3);
        unsortedList.add(3, 6);
        unsortedList.add(4, 9);
        unsortedList.add(5, 2);
        unsortedList.add(6, 7);
        unsortedList.add(7, 8);
        unsortedList.add(8, 1);
        unsortedList.add(9, 4);
        unsortedList.add(10, 11);

        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = unsortedList.size() - 1; j > i; j--) {
                if (unsortedList.get(i) > unsortedList.get(j)) {
                    int temp = unsortedList.get(i);
                    unsortedList.set(i, unsortedList.get(j));
                    unsortedList.set(j, temp);
                }
            }
        }
        return unsortedList;
    }


    //Tema optionala siruri
    // Ex.1

    public void printTheArrayWithTheSpecificNumber(int[] thisArray){
        int index = 3;
        int value = 5;
        for(int i = thisArray.length-1; i > index; i--){
            thisArray[i] = thisArray[i-1];
        }
        thisArray[index] = value;
        System.out.println(thisArray);
    }


    //Tema ex. 2

    public void getSmallestAndBiggestNumberFromArray(){
        int[] myArray = {2, 50, 10, 34, 15, 6, 79, 4};
        int smallest = myArray[0];
        int biggest = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] < smallest){
                smallest = myArray[i];
            }else if (myArray[i] > biggest){
                biggest = myArray[i];
            }
        }
        System.out.println(biggest);
        System.out.println(smallest);
    }

    //Tema ex. 3
    public void reverseTheArray (){
        int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int lastIndex = myArray[myArray.length-1];
        for(int i = myArray.length-1; i < myArray.length; i--){
            System.out.println(myArray[i]);
        }
    }

    //Tema ex. 4
    public void printDuplicateNumbersFromArray(){
        int[] myArray = {15, 20, 30, 45, 15, 50, 60, 20, 45};
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length; j++)
            if( myArray[i] == myArray[j] && i != j){
                myArray[j] = myArray[i];
                System.out.println(myArray[j]);
            }
        }
    }

    //Tema ex. 5 - aici am incercat sa fac un al 3-lea string care sa contina cuvintele comune
    // dar nu prea a mers :))

    public void printCommonElementsFromArray(){
        String[] myStringOfArray = {"This is the result of me having no inspiration"};
        String[] mySecondString = {"The result of having no inspiration"};
        String[] myThirdString = new String[myStringOfArray.length];
        for (int i = 0; i < myStringOfArray.length; i++){
            for(int j = 0; j < mySecondString.length; j++){
                if(myStringOfArray[i].equals(mySecondString[j])){
                    myThirdString[i] = mySecondString[j];
                }
                System.out.println(myThirdString[i]);
            }
        }
    }

    //Tema ex. 6

    public int[] returnTheArrayInAscendingOrder(int[] myArray){
        for(int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }



}