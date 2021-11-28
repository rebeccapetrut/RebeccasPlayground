package AnimalRescue;

public abstract class Cat extends Animal{

    public void purr(){
        System.out.println("Puurrrrr");
    }

    @Override
    public void sleep() {

    }

   public abstract void play();

    public abstract void catchMouse();

    public void waggingTail(){
        System.out.println("wagging tail");
    }

    public void scratchingThings(){
        System.out.println("Let me scratch that");
    }


}
