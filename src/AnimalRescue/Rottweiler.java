package AnimalRescue;

public class Rottweiler extends Dog{

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }

    @Override
    public void waggingTail() {
        System.out.println("Ain't got no tail to wag");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch");
    }
}
