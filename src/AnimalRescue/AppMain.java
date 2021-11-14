package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
                Animal rex = new Animal();
                rex.setName("Rex");
                rex.setBreed("Labrador");
                rex.setAge(1);
                System.out.println(rex.getName());
                System.out.println(rex.getAge());
                rex.play();
                rex.setName("Blackie");
                System.out.println(rex.getName());

                Animal freddie = new Animal();
                System.out.println(freddie.getName());
                freddie.setName("Freddie");

                Animal max= new Animal();
                max.setBreed("Buldog");

                Recreation activity = new Recreation();
                activity.setActivity("petting");
                activity.setActivity2("eating");
                System.out.println(activity.getActivity1());

                AnimalFood food = new AnimalFood();
                food.setName("BritCare");
                food.setWeightAvailability(23);
                food.setWeight(53);
                System.out.println(food.getName());

                Rescuer girl = new Rescuer();
                girl.setName("Jane");
                girl.setAge(24);
                girl.setMoney(2500);
                System.out.println(girl.getName());

                Veterinary veterinary = new Veterinary();
                veterinary.setName("Vetty");
                veterinary.setSpecialization("doggo doc");
                System.out.println(veterinary.getSpecialization());

            }
        }
