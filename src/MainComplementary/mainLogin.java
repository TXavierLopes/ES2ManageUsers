package MainComplementary;

import com.Registry;
import com.controllerApp;

import java.util.Scanner;

public class mainLogin {
    public static void main(String[] args) {

        controllerApp containerapp = new controllerApp();
        Scanner myObj = new Scanner(System.in);
        String email;
        String password;

        System.out.println("\n  Enter Email ");
        email = myObj.nextLine();
        System.out.println("  Enter Password  |");
        password = myObj.nextLine();


        String token = containerapp.loginUser(email, password);
        Registry admin = new Registry(4, "eve.holt@reqres.in", "cityslicka", token);

    }
}
