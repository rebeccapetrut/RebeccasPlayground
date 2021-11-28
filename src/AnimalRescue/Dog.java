package AnimalRescue;

public abstract class Dog extends Animal{

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    public abstract void play();

    public void waggingTail(){
        System.out.println("Da din coada");
    }

    public void gnawStuff(){
        System.out.println("Mmmmm this taste good");
    }

    public void digIn(){
        System.out.println("Must find treasure");
    }

    public void bite(){
        System.out.println("bite");
    }




}
