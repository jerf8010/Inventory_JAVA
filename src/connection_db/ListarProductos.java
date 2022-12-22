package connection_db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListarProductos {
    List<String> nombreColumn = new ArrayList<String>();
    List<String> marcaColumn = new ArrayList<String>();
    List<String> precioColumn = new ArrayList<String>();
    List<String> existenciaColumn = new ArrayList<String>();

    public String[][] listar() {
        PreparedStatement ps = null;

        try {
            Connection c = Connect.connect();
            c.setAutoCommit(false);
            DatabaseMetaData meta = c.getMetaData();  
            System.out.println(meta.getURL());
            System.out.println("Getting products...");
            String sql = "SELECT [Nombre], [Marca], [Precio], [Existencia] FROM [dim_producto];";
            System.out.println(sql);
            System.out.println("done");

            ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String Nombre = rs.getString("Nombre");
                String Marca = rs.getString("Marca");
                String Existencia = rs.getString("Existencia");
                String Precio = rs.getString("Precio");
                nombreColumn.add(Nombre);
                marcaColumn.add(Marca);
                existenciaColumn.add(Existencia);
                precioColumn.add(Precio);
            }
            //String Marca = rs.getString("Marca");
            //String Precio = rs.getString("Precio");
            //String Categoria = rs.getString("Categoria");
            //String Gamma = rs.getString("Gamma");
            //String Existencia = rs.getString("Existencia");

            rs.close();
            ps.close();
            c.close();
            System.out.println("done");
            System.out.println("Creating array...");

            String[][] results = new String[nombreColumn.size()][4];
            for(int j = 0; j < nombreColumn.size(); j ++){
                results[j][0] = nombreColumn.get(j);
            }
            for(int j = 0; j < marcaColumn.size(); j ++){
                results[j][1] = marcaColumn.get(j);
            }
            for(int j = 0; j < existenciaColumn.size(); j ++){
                results[j][2] = existenciaColumn.get(j);
            }
            for(int j = 0; j < precioColumn.size(); j ++){
                results[j][3] = precioColumn.get(j);
            }
            System.out.println("done");
            return results;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

}
