package connection_db;
import java.sql.*;

public class InsertarFactura {
    String resultado = "OK";
    public String insert( String idProducto, String fecha, String razonSocial, String rfc, String email, String direccion, String total, String numeroFactura) {
        Statement stmt = null;
        try{
            Connection c = Connect.connect();
            DatabaseMetaData meta = c.getMetaData();  
            stmt = c.createStatement();
            System.out.println(meta.getURL());
            System.out.println("Updating table dim_producto");
            String sql = "INSERT INTO dim_factura ([no_factura], [fecha], [razon_social], [rfc], [e-mail], [direccion], [total], [id_producto]) " +
                "VALUES ( '" + numeroFactura + "', '" + fecha + "', '" + razonSocial + "', '" + rfc + "', '" + email + "', '" + direccion + "', '" + total + "', '" + idProducto + "');";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            //c.commit();
            c.close();
            System.out.println("done");

            this.resultado = "OK";
        }catch (Exception e){
            //BuscarProducto buscar = new BuscarProducto();
            //String[] result = buscar.buscar(ID);
            //String[] noValues = {};
            //if (result != noValues){
            //    this.resultado = false;
            //}
            System.out.println(e);
            this.resultado =  e.toString();

        }
        return this.resultado;
    }
    
}

