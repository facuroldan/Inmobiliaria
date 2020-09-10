package inmobiliaria.GestorBD;
import java.sql.*;
import inmobiliaria.Modelos.*;
import inmobiliaria.DTOs.DTOTransaccion;
import java.util.ArrayList;
public class TransaccionesBD {
    Conexiones conn = new Conexiones();
    public void agregarVenta(Transaccion t){
        try{
            conn.abrirConexion();
            PreparedStatement ps = conn.getCon().prepareStatement("INSERT INTO Transacciones (fecha, idVendedor, IdOperacion, IdInmueble, monto) VALUES (?, ?, ?, ?, ?)");
            ps.setObject(1, t.getFecha());
            ps.setInt(2, t.getVendedor().getIdVendedor());
            ps.setInt(3, t.getOperacion().getIdOperacion());
            ps.setInt(4, t.getInmueble().getIdInmueble());
            ps.setFloat(5, t.getMonto());
            ps.executeUpdate();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
        finally{
            conn.cerrarConexion();
        }
    }
    public ArrayList<DTOTransaccion> ObtenerTransacciones(){
        ArrayList<DTOTransaccion> lista = new ArrayList<DTOTransaccion>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("exec spr_Transacciones");
            while(rs.next()){
                int idTransaccion = rs.getInt("IdTransaccion");
                Date fecha = rs.getDate("Fecha");
                String vendedor = rs.getString("Vendedor");
                String inmueble = rs.getString("Inmueble");
                String operacion = rs.getString("operacion");
                float monto = rs.getFloat("Monto");
                
                Inmueble inm = new Inmueble();
                inm.setInmueble(inmueble);
                Operacion op = new Operacion();
                op.setOperacion(operacion);
                Vendedor v = new Vendedor();
                v.setNombreCompleto(vendedor);
                
                DTOTransaccion DT = new DTOTransaccion(idTransaccion, fecha, op, inm, monto, v);
                lista.add(DT);
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
    public ArrayList<DTOTransaccion> ObtenerMayorMontoDeVenta(){
        ArrayList<DTOTransaccion> lista = new ArrayList<DTOTransaccion>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("exec spr_MayorTransaccion");
            while(rs.next()){
                int idTransaccion = rs.getInt("IdTransaccion");
                Date fecha = rs.getDate("Fecha");
                String vendedor = rs.getString("Vendedor");
                String inmueble = rs.getString("Inmueble");
                String operacion = rs.getString("operacion");
                float monto = rs.getFloat("Monto");
                
                Inmueble inm = new Inmueble();
                inm.setInmueble(inmueble);
                Operacion op = new Operacion();
                op.setOperacion(operacion);
                Vendedor v = new Vendedor();
                v.setNombreCompleto(vendedor);
                
                DTOTransaccion DT = new DTOTransaccion(idTransaccion, fecha, op, inm, monto, v);
                lista.add(DT);
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
    
    public ArrayList<DTOTransaccion> ObtenerTransaccionesDeOficina(){
        ArrayList<DTOTransaccion> lista = new ArrayList<DTOTransaccion>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("exec spr_TransaccionOficina");
            while(rs.next()){
                int idTransaccion = rs.getInt("IdTransaccion");
                Date fecha = rs.getDate("Fecha");
                String vendedor = rs.getString("Vendedor");
                String inmueble = rs.getString("Inmueble");
                String operacion = rs.getString("operacion");
                float monto = rs.getFloat("Monto");
                
                Inmueble inm = new Inmueble();
                inm.setInmueble(inmueble);
                Operacion op = new Operacion();
                op.setOperacion(operacion);
                Vendedor v = new Vendedor();
                v.setNombreCompleto(vendedor);
                
                DTOTransaccion DT = new DTOTransaccion(idTransaccion, fecha, op, inm, monto, v);
                lista.add(DT);
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
