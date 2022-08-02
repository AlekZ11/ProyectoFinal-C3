package modelo;

public class Cliente extends Persona{
    private Integer id;
    private String provincia;
    private String ciudad;
    private String direccion;

    public Cliente(){   }

    public Cliente(Integer id, String nombre, String apellido, String identificacion, String provincia, String ciudad, String direccion){
        super(nombre, apellido, identificacion);
        this.id = id;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", Nombre=" + super.getNombre() +
                ", Apellido=" + super.getApellido() +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
