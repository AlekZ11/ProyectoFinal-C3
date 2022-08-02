package modelo;

public class TipoCombustible {
    private Integer ID;
    private String tipo;

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
    
    
}
