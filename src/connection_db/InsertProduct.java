package connection_db;
import java.sql.*;

public class InsertProduct {
    Boolean resultado = true;
    public Boolean insert( String ID, String Nombre, String Marca, String Precio, String Categoria, String Gamma, String Existencia) {
        Statement stmt = null;
        try{
            Connection c = Connect.connect();
            DatabaseMetaData meta = c.getMetaData();  
            stmt = c.createStatement();
            System.out.println(meta.getURL());
            System.out.println("Updating table dim_producto");
            String sql = "INSERT INTO dim_producto ([ID], [Nombre], [Marca], [Precio], [Categoria], [Gamma], [Existencia])" +
                "VALUES ( '" + ID + "', '" + Nombre + "', '" + Marca + "', '" + Precio + "', '" + Categoria + "', '" + Gamma + "', '" + Existencia + "');";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            //c.commit();
            c.close();
            System.out.println("done");

            this.resultado = true;
        }catch (Exception e){
            BuscarProducto buscar = new BuscarProducto();
            String[] result = buscar.buscar(ID);
            String[] noValues = {};
            if (result != noValues){
                this.resultado = false;
            }
            System.out.println(e);
        }
        return this.resultado;
    }
    
}

