
package inmobiliaria.Modelos;

public class Operacion {
    private int idOperacion;
    private String Operacion;

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    @Override
    public String toString() {
        return Operacion;
    }
    
    
}
