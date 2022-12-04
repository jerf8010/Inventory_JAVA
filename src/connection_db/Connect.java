package connection_db;
import java.sql.*;

public class Connect {
    private static Connection c = null;
    public static Connection connect() throws Exception{
        try {
            Class.forName("org.sqlite.JDBC");
        }catch(Exception e1){
            System.out.println(e1);
        }
        
        try {
           System.out.println("Connecting with database...");
           if (c == null){
            System.out.println("There are not any connection");
            c = DriverManager.getConnection("jdbc:sqlite:./db/db_inventario.db");
            System.out.println("Connection ready");
           }else{
            System.out.println("Previous Connection: " + c);
            c.close();
            c = DriverManager.getConnection("jdbc:sqlite:./db/db_inventario.db");
            System.out.println("Connection ready");
           }
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

