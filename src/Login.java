import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {


//        String username = "Rebecca";
//        String password = "parola15";
//
//        String givenUsername = scan.next();
//        String givenPassword = scan.next();
//
//        if(username.equals(givenUsername) && password.equals(givenPassword)){
//            System.out.println("Log in successful.");
//            return true;
//        }else{
//            System.out.println("Log in unsuccessful.");
//            return false;
//        }
//    }

    public boolean isLoggedIn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entry username and password:");

        HashMap<String, String> log = new HashMap<>();
        log.put("Rebecca", "password15");
        log.put("John", "password");
        log.put("Jane", "password");
        log.put("Doe", "password");
        log.put("Rudolph", "thereindeer");

        String givenUsername = scan.next();
        String givenPassword = scan.next();

        if(log.containsKey(givenUsername) && log.containsValue(givenPassword)){
            System.out.println("Log in successful.");
            return true;
        }else {
            System.out.println("Log in unsuccessful.");
            return false;
        }
    }

    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        } while (!repeat && count <= 3);
        return repeat;
    }


}
