import java.sql.SQLException;
import java.util.Scanner;

public class DemoLogin implements LoginCapable {

    private MySqlHandler sql;

    public DemoLogin() throws SQLException {
        sql = new MySqlHandler();

    }

    public boolean register(User x) {
        return sql.addUser(x);
    }

    public boolean login() {
        return false;
    }

    public boolean logout() {
        return false;
    }
}
