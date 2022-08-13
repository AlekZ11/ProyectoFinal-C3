package modelo;

import java.util.Date;

public class Cliente{
    private Integer ID;
    private String nombre;
    private String apellido;
    private String identificacion;
    private Integer ID_Ubicacion;
    private Date Created_At;
    private Date Updated_At;

    public Cliente(){
    
    }

    public Cliente(Integer id, String nombre, String apellido, String identificacion, Integer ID_location, Date Created_At, Date Updated_At) {
        this.ID = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.ID_Ubicacion = ID_location;
        this.Created_At = Created_At;
        this.Updated_At = Updated_At;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getID_Ubicacion() {
        return ID_Ubicacion;
    }

    public void setID_Ubicacion(Integer ID_Ubicacion) {
        this.ID_Ubicacion = ID_Ubicacion;
    }

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date Created_At) {
        this.Created_At = Created_At;
    }

    public Date getUpdated_At() {
        return Updated_At;
    }

    public void setUpdated_At(Date Updated_At) {
        this.Updated_At = Updated_At;
    }

    public String toString() {
        return "Cliente{" +
                "id=" + ID +
                ", Nombre=" + nombre +
                ", Apellido=" + apellido +
                ", ID_location='" + ID_Ubicacion + '\'' +
                ", Created_At='" + Created_At + '\'' +
                ", Updated_At='" + Updated_At + '\'' +
                '}';
    }
}
