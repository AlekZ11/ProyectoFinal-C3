package modelo;


public class Umbral {
    private Integer ID_Umbral;
    private String descripcion;
    private Integer ID_RangoAnio;
    private String tipo;
    private Double valorMin;
    private Double valorMax;
    private Integer clave_Umbral;

    public Umbral(){   }

    public Umbral(Integer ID, String descripcion, Integer ID_RangoAnio, String tipo, Double valoresMin, Double valoresMax, Integer claveUmbral) {
        this.ID_Umbral = ID;
        this.ID_RangoAnio = ID_RangoAnio;
        this.tipo = tipo;
        this.valorMin = valoresMin;
        this.valorMax = valoresMax;
        this.clave_Umbral = claveUmbral;
        this.descripcion = descripcion;
    }

    public Integer getID_Umbral() {
        return ID_Umbral;
    }

    public void setID_Umbral(Integer ID_Umbral) {
        this.ID_Umbral = ID_Umbral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getID_RangoAnio() {
        return ID_RangoAnio;
    }

    public void setID_RangoAnio(Integer ID_RangoAnio) {
        this.ID_RangoAnio = ID_RangoAnio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorMin() {
        return valorMin;
    }

    public void setValorMin(Double valorMin) {
        this.valorMin = valorMin;
    }

    public Double getValorMax() {
        return valorMax;
    }

    public void setValorMax(Double valorMax) {
        this.valorMax = valorMax;
    }

    public Integer getClave_Umbral() {
        return clave_Umbral;
    }

    public void setClave_Umbral(Integer clave_Umbral) {
        this.clave_Umbral = clave_Umbral;
    }

    
}
