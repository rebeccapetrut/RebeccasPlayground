package AnimalRescue;

public abstract class Animal {

        private int age;
        private float weight;
        private int heightInCm;
        private String name;
        private String color;
        private int healthLevel;
        private int hungryLevel;
        private int moodLevel;
        private String faveFood;
        private String faveRecreation;





        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }

        public float getWeight(){
            return weight;
        }

        public void setWeight(float weight){
            this.weight = weight;
        }

        public int getHeightInCm(){
            return heightInCm;
        }

        public void setHeightInCm(int heightInCm){
            this.heightInCm = heightInCm;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public int getHealthLevel(){
            return healthLevel;
        }

        public void setHealthLevel(int healthLevel){
            this.healthLevel = healthLevel;
        }

        public int getHungryLevel(){
            return hungryLevel;
        }

        public void setHungryLevel(int hungryLevel){
            this.hungryLevel = hungryLevel;
        }

        public int getMoodLevel(){
            return moodLevel;
        }

        public void setMoodLevel(int moodLevel){
            this.moodLevel = moodLevel;
        }

        public String getFaveFood(){
            return faveFood;
        }

        public void setFaveFood(String faveFood){
            this.faveFood = faveFood;
        }

        public String getFaveRecreation(){
            return faveRecreation;
        }

        public void setFaveRecreation(String faveRecreation){
            this.faveRecreation = faveRecreation;
        }


        public abstract void eat();

        public abstract void sleep();

        public abstract void speak();

        public abstract void play();

    }
