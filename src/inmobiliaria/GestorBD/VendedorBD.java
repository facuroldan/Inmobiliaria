package inmobiliaria.GestorBD;
import inmobiliaria.Modelos.Vendedor;
import java.sql.*;
import java.util.ArrayList;
public class VendedorBD {
    Conexiones conn = new Conexiones();
    public ArrayList<Vendedor> ObtenerVendedores(){
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("Select idVendedor, nombreCompleto From Vendedores");
            while(rs.next()){
                int idVendedor = rs.getInt("IdVendedor");
                String nombreCompleto = rs.getString("nombreCompleto");
                Vendedor vend = new Vendedor();
                vend.setIdVendedor(idVendedor);
                vend.setNombreCompleto(nombreCompleto);
                lista.add(vend);
            }
            rs.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
        finally{
            conn.cerrarConexion();
        }
        return lista;
        
    }
}
