import java.nio.channels.SelectableChannel;
import java.sql.SQLException;

public class Main {

    public static void main(String args[])
    {
        try {

            DemoLogin app = new DemoLogin();
            User x = new User();
            app.register(x);
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Startup failed");
        }



    }


}


