package modelo;

import java.util.Date;

public class Cliente extends Persona{
    private Integer id;
    private Integer ID_location;
    private Date Created_At;
    private Date Updated_At;

    public Cliente(){
    
    }

    public Cliente(Integer id, Integer ID_location, Date Created_At, Date Updated_At) {
        this.id = id;
        this.ID_location = ID_location;
        this.Created_At = Created_At;
        this.Updated_At = Updated_At;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getID_location() {
        return ID_location;
    }

    public void setID_location(Integer ID_location) {
        this.ID_location = ID_location;
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

    
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", Nombre=" + super.getNombre() +
                ", Apellido=" + super.getApellido() +
                ", ID_location='" + ID_location + '\'' +
                ", Created_At='" + Created_At + '\'' +
                ", Updated_At='" + Updated_At + '\'' +
                '}';
    }
}
