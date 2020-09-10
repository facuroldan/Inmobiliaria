package inmobiliaria.GestorBD;

import inmobiliaria.Modelos.Operacion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OperacionBD {
    Conexiones conn = new Conexiones();
    public ArrayList<Operacion> ObtenerOperaciones(){
        ArrayList<Operacion> lista = new ArrayList<Operacion>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT IdOperacion, Operacion From Operaciones");
            while(rs.next()){
                int idOperacion = rs.getInt("IdOperacion");
                String operacion = rs.getString("Operacion");
                Operacion op = new Operacion();
                op.setIdOperacion(idOperacion);
                op.setOperacion(operacion);
                lista.add(op);
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
