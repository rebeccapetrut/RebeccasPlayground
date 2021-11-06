package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
                Dog rex = new Dog();
                rex.name = "Rex";
                rex.breed = "Labradord";
                rex.age = 1;
                System.out.println(rex.name);
                System.out.println(rex.age);
                rex.play();
                rex.name = "Blackie";
                System.out.println(rex.name);

                Dog freddie = new Dog();
                System.out.println(freddie.name);
                freddie.name = "Freddie";

                Dog max = new Dog();
                max.breed = "Buldog";

                Recreation activity = new Recreation();
                activity.activity1 = "petting";
                activity.activity2 = "eating";
                System.out.println(activity.activity1);

                DogFood food = new DogFood();
                food.name = "BritCare";
                food.weightAvailability = 23;
                food.weight = 53;
                System.out.println(food.name);

                Girl girl = new Girl();
                girl.name = "Jane";
                girl.age = 24;
                girl.money = 2500;
                System.out.println(girl.name);

                Veterinary veterinary = new Veterinary();
                veterinary.name = "Vetty";
                veterinary.specialization = "doggo doc";
                System.out.println(veterinary.specialization);

            }
        }
