import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String [] args){
        try {
            DemoLogin app = new DemoLogin();
            app.register(creazaUser());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Startup failed");
        }

    }

    public static User creazaUser(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu datele: ");
        String username = sc.next();
        String password = sc.next();
        String mail = sc.next();

        User user = new  User(username,password,mail);

        return user;

    }
}
