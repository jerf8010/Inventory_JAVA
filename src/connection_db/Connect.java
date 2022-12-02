package connection_db;
import java.sql.*;

public class Connect {
    public static Connection connect(){
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
        }catch(Exception e1){
            System.out.println(e1);
        }
        
        try {
           System.out.println("Connecting with database...");
           c = DriverManager.getConnection("jdbc:sqlite:./db/db_inventario.db");
           DatabaseMetaData meta = c.getMetaData();  
           System.out.println("The driver name is " + meta.getDriverName()); 
           System.out.println("The connection is " + c); 
           System.out.println("Done"); 

        } catch (SQLException e2 ) {
            System.out.println(e2.getMessage());  
        }
        System.out.println("Opened database successfully");
        return c; 

    }
}

