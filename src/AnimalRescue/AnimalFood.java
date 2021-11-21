package AnimalRescue;

public class AnimalFood {
    private String name;
    private float weight;
    private float weightAvailability;

    private float price;
    private String taste;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeightAvailability(){
        return weightAvailability;
    }

    public void setWeightAvailability(float weightAvailability){
        this.weightAvailability = weightAvailability;
    }



    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getTaste(){
        return taste;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }
}
