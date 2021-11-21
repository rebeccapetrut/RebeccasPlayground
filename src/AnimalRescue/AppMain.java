package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Animal rex = new Animal();
        rex.setName("Rex");

        rex.setAge(1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        rex.setName("Blackie");
        System.out.println(rex.getName());

        Animal freddie = new Animal();
        System.out.println(freddie.getName());
        freddie.setName("Freddie");

        Animal max = new Animal();


        Recreation activity = new Recreation();
        activity.setActivity("petting");
        activity.setActivity2("eating");
        System.out.println(activity.getActivity1());

        AnimalFood animalFood = new AnimalFood();
        animalFood.setWeightAvailability(23);
        animalFood.setWeight(53);
        System.out.println(animalFood.getName());

        Rescuer girl = new Rescuer();
        girl.setName("Jane");
        girl.setAge(24);
        girl.setMoney(2500);
        System.out.println(girl.getName());

        Doctor veterinary = new Doctor();
        veterinary.setName("Vetty");
        veterinary.setSpecialization("doggo doc");
        System.out.println(veterinary.getSpecialization());

        Persian tommy = new Persian();
        tommy.setName("Tommy");

        DogFood food = new DogFood();
        food.setName("Britcare");

        Rottweiler marco = new Rottweiler();
        marco.setName("Marco");

        Doctor doc = new Doctor();
        doc.setSpecialization("doggo dog");







    }
}
