package crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMySql {
    Connection cn;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/users","root", "");
            System.out.println("CONNECTED");
        }catch(Exception e)
        {
            System.out.println("ERROR"+e);
        }
        return cn;
    }
}
