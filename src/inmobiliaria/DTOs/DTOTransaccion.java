package inmobiliaria.DTOs;
import inmobiliaria.Modelos.*;
import java.util.Date;

public class DTOTransaccion {
    private int idTransaccion;
    private Date fecha;
    private Operacion operacion;
    private Inmueble inmueble;
    private double monto;
    private Vendedor vendedor;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    

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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public DTOTransaccion(int idTransaccion, Date fecha, Operacion operacion, Inmueble inmueble, double monto, Vendedor vendedor) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.operacion = operacion;
        this.inmueble = inmueble;
        this.monto = monto;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "DTOTransaccion{" + "idTransaccion=" + idTransaccion + ", fecha=" + fecha + ", operacion=" + operacion + ", inmueble=" + inmueble + ", monto=" + monto + '}';
    }
    
    public int ContarAlquileres(){
        int contador = 0;
        if(operacion.getIdOperacion() == 1)
            contador++;
        return contador;
    }
}
