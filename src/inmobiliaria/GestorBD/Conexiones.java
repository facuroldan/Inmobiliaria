package inmobiliaria.GestorBD;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexiones {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void abrirConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inmobiliaria","sa","123456");
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    public void cerrarConexion(){
        try{
            if(con != null && !con.isClosed())
                con.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    
}
