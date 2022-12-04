package connection_db;

import java.sql.*;

public class EditarProducto {
    public void editar( String ID, String [] result) {
        try {
            String Nombre = result[0];
            String Marca = result[1];
            String Precio = result[2];
            String Categoria = result[3];
            String Gamma = result[4];
            String Existencia = result[5];
            
            Connection c = Connect.connect();
            c.setAutoCommit(true);
            DatabaseMetaData meta = c.getMetaData();  
            System.out.println(meta.getURL());
            System.out.println("Updating table dim_producto");
            String sql = "UPDATE dim_producto " +
                            "SET [Nombre] = '" + Nombre + "', " + 
                                "[Marca] = '" + Marca + "', " +  
                                "[Precio] = '" + Precio + "', " +  
                                "[Categoria] = '" + Categoria + "', " + 
                                "[Gamma] = '" + Gamma + "', " + 
                                "[Existencia] = '" + Existencia  + "' " +
                                "WHERE [ID] = '" + ID + "' ;" ;
            System.out.println(sql);

            PreparedStatement ps = c.prepareStatement(sql);
            //ps.setString(1, Nombre);
            //ps.setString(2, Marca);
            //ps.setFloat(3, Float.parseFloat(Precio));
            //ps.setString(4, Categoria);
            //ps.setString(5, Gamma);
            //ps.setInt(6, Integer.parseInt(Existencia));
            //ps.setString(7, ID);
            int i = ps.executeUpdate();
            System.out.println(i);

            ps.close();
            //c.commit();
            c.close();
            System.out.println("done");
        }catch (Exception e){
            System.out.println(e);
        }
    }


    
}
