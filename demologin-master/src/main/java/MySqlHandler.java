import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySqlHandler {

    private Connection dbConnection;

    public MySqlHandler() throws SQLException {

        dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demologin","root","ramona1996");
    }

    public boolean addUser(User x){
          String sqlCmd = "INSERT INTO users(username,password,mail) VALUES('" + x.username + "','" + x.password + "','" +
                           x.mail + "')";

          System.out.print(sqlCmd);

        try {
            Statement statement = dbConnection.createStatement();
            return statement.execute(sqlCmd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }


}
