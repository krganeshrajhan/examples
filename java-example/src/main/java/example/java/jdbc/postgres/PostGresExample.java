package example.java.jdbc.postgres;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostGresExample {

    public static void main(String[] args) throws SQLException, URISyntaxException {

        URI dbUri = new URI("postgres://pitrkadtgxccjx:e017dd080ee7f9d7c7671dc010e83019a1b83caa07df2c39c9723aa6f544071b@ec2-54-75-224-168.eu-west-1.compute.amazonaws.com:5432/dbcnn3d74er54j");

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        Connection conn =  DriverManager.getConnection(dbUrl, username, password);
        System.out.println(conn.isValid(10));
    }
}
