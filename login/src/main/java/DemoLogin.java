import java.sql.SQLException;

public  class DemoLogin implements LoginCapable {
    private MySqlHandler sql;

    public DemoLogin() throws SQLException {
        sql = new MySqlHandler();
    }

    public boolean register(User x) {
        return sql.addUser(x);
        //citesc de la tastatura user, pass, mail
        // creez un user cu aceste date
        // comanda intrarea in baza de date
        //error handling;
    }

    public boolean login() {
        return false;
    }

    public boolean logout() {
        return false;
    }
}
