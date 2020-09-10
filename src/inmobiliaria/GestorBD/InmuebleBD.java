package inmobiliaria.GestorBD;

import inmobiliaria.Modelos.Inmueble;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class InmuebleBD {
    Conexiones conn = new Conexiones();
    public ArrayList<Inmueble> ObtenerInmuebles(){
        ArrayList<Inmueble> lista = new ArrayList<Inmueble>();
        try{
            conn.abrirConexion();
            Statement st = conn.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT IdInmueble, Inmueble From Inmuebles");
            while(rs.next()){
                int idInmueble = rs.getInt("IdInmueble");
                String inmueble = rs.getString("Inmueble");
                Inmueble inm = new Inmueble();
                inm.setIdInmueble(idInmueble);
                inm.setInmueble(inmueble);
                lista.add(inm);
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
