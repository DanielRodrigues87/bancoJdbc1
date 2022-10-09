import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Conexao extends SQLDataException {

    private final String url = "jdbc:postgresql://localhost:5432/livraria";

    private final String usuario = "postgres";
    private final String senha = "1234";

    Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection(url,usuario,senha);
        boolean isConnected = conn.isValid(0);
        System.out.println("Está conectado: " + isConnected);
        return conn;
    }


    }

