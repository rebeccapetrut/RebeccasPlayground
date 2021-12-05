public class MenuOptions {
    Calculator calc = new Calculator();
    LogicalOperation op = new LogicalOperation();
    Read read = new Read();

    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.RESULT_SUM + calc.sum(first, second));
    }

    public void doSubtract(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.RESULT_SUBTRACT + calc.substract(first, second));
    }

    public void doDivide(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.RESULT_DIVIDE + calc.divide(first,second));
    }

    public void doMultiply(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.RESULT_MULTIPLY + calc.multiply(first, second));
    }

    public void doModulo(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.RESULT_MODULO + calc.modulo(first, second));
    }

    public void doMedia(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println(Messages.RESULT_MEDIA + calc.media(first, second, third));
    }

    public void doDegree(){
        double first = read.getDouble();
        System.out.println(Messages.RESULT_DEGREE + calc.degree((first- 32 * 0.55555555)));
    }

    public void doMetres(){
        double first = read.getDouble();
        System.out.println(Messages.RESULT_METERS + calc.toMeters(first * 0.0254));
    }

    public void doEvenNumber(){
        int first = read.getInt();
        System.out.println(Messages.RESULT_EVENNUMBER + op.isNumberEven(first));
    }

    public void doBiggerNumber(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println(Messages.RESULT_BIGGERNUMBER + op.biggerNumber(first, second, third));
    }

    public void doSumAndAverage(){
        int first = read.getInt();
        System.out.println(Messages.RESULT_SUMANDAVERAGE + op.sumAndAverage(first));
    }

    public void doSumNumbers(){
        int first = read.getInt();
        System.out.println(Messages.RESULT_SUMNUMBERS + op.sumTheNumbers(first));
    }

    public void doEligibleToVote(){
        int first = read.getInt();
        System.out.println(Messages.RESULT_ELIGIBLETOVOTE + op.isEligibleToVote(first));
    }
}
