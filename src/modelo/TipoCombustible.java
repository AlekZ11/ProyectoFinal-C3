package modelo;

import java.sql.Date;

public class TipoCombustible {
    private String tipo;
    private Date created_At;

    public TipoCombustible() {
    }

    public TipoCombustible( String tipo) {
        this.tipo = tipo;
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
