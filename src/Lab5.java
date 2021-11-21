public class Lab5 {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();

        int[] array3= op.populateArray(50);
        System.out.println(op.isValueInArray(array3, 5));

        int[] myArray2 = op.populateMyArray(100);
        System.out.println(op.returnevenNumbersInArray(myArray2));

        int[] myArray = op.populateMyArray(100);
        System.out.println(op.getAverageValueFromArray(myArray));

        String[] hobbies = op.populateTheArray();
        System.out.println(op.isValueInArray(hobbies, "complaining"));

        int[] thisArray = op.populatethisArray(50);
        System.out.println(op.verifyNumberFromArray(thisArray,3));

        String[] linesArray = op.figureLines();
        op.printLines(linesArray);

        int[] myArray8 = op.populateTheArraypls(20);
        System.out.println(op.verifyNumberFromTheArray(myArray8, 10));

        int[] array9 = {0, 3, 10, 5, 17, 1};
        System.out.println(op.returnSecondSmallerNumberFromArray(array9));


        int[] theArray = op.populatetheArr(10);
        int[] emptyArray = op.emptyArray(10);
        System.out.println(op.copyValueFromPopulateArray(theArray, emptyArray));


















    }
}
