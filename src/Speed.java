
public class Speed {

    //Tema ex. 9

    public void printSpeed(int meters, int h, int m, int s){
        double totalTimeInSeconds, speedInMetersPerSeconds, speedInMilesPerHours, speedInKilometersPerHours, totalTimeInHours;

        totalTimeInSeconds=s+(m*60)+(h*3600);
        speedInMetersPerSeconds=meters/totalTimeInSeconds;
        System.out.println("Viteza in Metri/Secunda: "+speedInMetersPerSeconds);


        totalTimeInHours=h+(m/60)+(s/3600);
        speedInKilometersPerHours=(meters/1000)/totalTimeInHours;
        System.out.println("Viteza in Kilometri/Ora: "+ speedInKilometersPerHours);

        speedInMilesPerHours=(meters/1609)/totalTimeInHours;
        System.out.println("Viteza in Mile/Ora: "+speedInMilesPerHours);

    }






}




