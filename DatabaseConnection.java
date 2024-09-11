import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DatabaseConnection {
    public static void main(String[] args) {
        //step 1: Load the JDBC driver
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
    }
}
