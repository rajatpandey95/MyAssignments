package basic_data_structure_assignment;

import java.util.Scanner;

class Login {
    String userId = "Ajay", password = "password";
    static int loginCounter = 0;

    public String loginUser(String user, String pass) {
        loginCounter++;
        if (loginCounter <= 3 && user.equals(userId) && pass.equals(password)) {
            return "passed";
        }

        if (loginCounter >= 3) {
            System.out.println("You have entered wrong credentials 3 times");
            System.out.println("Contact Admin");
            return "";
        }

        return "wrong";
    }
}

public class question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Login obj = new Login();

        while (true) {
            System.out.println("Enter userId");
            String userId = sc.nextLine();

            System.out.println("Enter password");
            String password = sc.nextLine();

            String res = obj.loginUser(userId, password);
            if (res.equals("wrong")) {
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }
            if (res.equals("passed")) {
                System.out.println("Welcome Ajay");
                break;
            }
            if (res.equals("")) {
                break;
            }
        }

    }
}
