package connection_db;
import java.sql.*;

public class BuscarProducto {
    public String[] buscar( String ID ) {
        PreparedStatement ps = null;
        try {
            Connection c = Connect.connect();
            c.setAutoCommit(false);
            DatabaseMetaData meta = c.getMetaData();  
            System.out.println(meta.getURL());
            System.out.println("Updating table dim_producto");
            String sql = "SELECT * FROM [dim_producto] WHERE ID = ?;";
            System.out.println(sql);

            ps = c.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            String Nombre = rs.getString("Nombre");
            String Marca = rs.getString("Marca");
            String Precio = rs.getString("Precio");
            String Categoria = rs.getString("Categoria");
            String Gamma = rs.getString("Gamma");
            String Existencia = rs.getString("Existencia");

            rs.close();
            ps.close();
            c.close();
            System.out.println("done");
            String [] result = {Nombre, Marca, Precio, Categoria, Gamma, Existencia};
            for(int i = 0; i <= 5; i++){
                System.out.println(result[i]);
            }
            return result;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    
}

