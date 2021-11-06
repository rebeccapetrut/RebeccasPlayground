public class Lab3 {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();

        String text = "FastTrackkk90";
        System.out.println(op.verifyText(text));

        String text2 = "FastTrackIT";
        System.out.println(op.verifyProvidedText("FastTrackkIT", 6));

        int first = 7;
        System.out.println(op.snow(first));

        op.verifyNumber(2);
        System.out.println(op.verifyNumber(2));

        op.givenNumber(2);

        op.isNumberEven(2);
        System.out.println(op.isNumberEven(2));

        op.isEligibleToVote(90);
        System.out.println(op.isEligibleToVote(90));

        op.biggerNumber(10,40,69);
        System.out.println(op.biggerNumber(10,49,69));

    }



}
