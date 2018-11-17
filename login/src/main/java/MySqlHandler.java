import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlHandler {
    private Connection dbConnection;

    public MySqlHandler() throws SQLException

    {


        dbConnection = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/demologin", "root", "admin");


    }

    public boolean addUser(User x) {

    String SqlCmd = "Insert Into user(username, password, mail)" + "Values(colari,123,colari@gmail.com)";

    try{
        Statement statement = dbConnection.createStatement();
        return statement.execute(SqlCmd);
    } catch(
    SQLException e)

    {
        e.printStackTrace();
    }
    return false;
  }

}







