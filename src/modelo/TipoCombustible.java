package modelo;

import java.sql.Date;

public class TipoCombustible {
    private Integer ID;
    private String tipo;
    private Date created_At;

    public TipoCombustible() {
    }

    public TipoCombustible(Integer ID, String tipo) {
        this.ID = ID;
        this.tipo = tipo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }
    
    
    
}
