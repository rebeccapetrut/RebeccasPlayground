public class ProgramStart extends MenuOptions{
    Read read = new Read();


    public void printMenu(){
        System.out.println(Messages.MENU_OPTION);
    }

    public void printCalcSubMenu(){
        System.out.println(Messages.SUBMENU_CALC);
    }

    public void printLogicalSubMenu(){
        System.out.println(Messages.SUBMENU_LOGICALOP);
    }


    public boolean runMenuOption() {
        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println(Messages.GOOD_BYE);
                return false;
            case 1:
                runCalcSubMenuOption();
                return true;
            case 2:
                runLogicalSubMenuOption();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runCalcSubMenuOption(){
        printCalcSubMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println(Messages.GOOD_BYE);
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                doDivide();
                return true;
            case 4:
                doMultiply();
                return true;
            case 5:
                doModulo();
                return true;
            case 6:
                doMedia();
                return true;
            case 7:
                doDegree();
                return true;
            case 8:
                doMetres();
                return true;
            case 9:
                runMenuOption();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }

    }

    public boolean runLogicalSubMenuOption() {
        printLogicalSubMenu();
        int option = read.getInt();
        switch (option) {
            case 0:
                System.out.println(Messages.GOOD_BYE);
                return false;
            case 1:
                doEvenNumber();
                return true;
            case 2:
                doBiggerNumber();
                return true;
            case 3:
                doSumAndAverage();
                return true;
            case 4:
                doSumNumbers();
                return true;
            case 5:
                doEligibleToVote();
                return true;
            case 6:
                runMenuOption();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }



    public void runProgram(){
        boolean repeatProgram;
        do{
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }

// inca nu mi-am dat seama cum sa il fac sa se intoarca la submeniu dupa ce face o
// operatie, si nu la meniu principal, dar o sa mai incerc :D


}
