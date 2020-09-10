package inmobiliaria.Modelos;

public class Inmueble {
    private int idInmueble;
    private String inmueble;

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }


    @Override
    public String toString() {
        return inmueble;
    }
    
    
}
