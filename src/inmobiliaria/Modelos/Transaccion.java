package inmobiliaria.Modelos;
import java.util.Date;
public class Transaccion {

    private int idTransaccion;
    private Date fecha;
    private Vendedor vendedor;
    private Operacion operacion;
    private Inmueble inmueble;
    private float monto;

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Transaccion(Date fecha, Vendedor vendedor, Operacion operacion, Inmueble inmueble, float monto) {
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.operacion = operacion;
        this.inmueble = inmueble;
        this.monto = monto;
    }
    
    
 
}
