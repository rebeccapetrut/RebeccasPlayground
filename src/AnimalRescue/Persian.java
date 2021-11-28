package AnimalRescue;

public class Persian extends Cat {

    @Override
    public void play() {
        System.out.println("Chasing the lights");
    }

    @Override
    public void catchMouse() {
        System.out.println("I'm a princess, I don't do that");
    }

    @Override
    public void eat() {
        System.out.println("Eating treats");
    }

    @Override
    public void speak() {
        System.out.println("fancy miau");

    }
}
