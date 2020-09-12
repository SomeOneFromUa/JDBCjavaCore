import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private final String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
    private final String login = "root";
    private final String password = "1111";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(this.url, this.login, this.password);
    }
}
