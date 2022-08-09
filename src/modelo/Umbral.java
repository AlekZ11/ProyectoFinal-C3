package modelo;


public class Umbral {
    private Integer ID;
    private Integer ID_RangoAnio;
    private Double valorMin;
    private Double valorMax;
    private Integer claveUmbral;

    public Umbral(){   }

    public Umbral(Integer ID, Integer ID_RangoAnio, Double valoresMin, Double valoresMax, Integer claveUmbral) {
        this.ID = ID;
        this.ID_RangoAnio = ID_RangoAnio;
        this.valorMin = valoresMin;
        this.valorMax = valoresMax;
        this.claveUmbral = claveUmbral;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID_RangoAnio() {
        return ID_RangoAnio;
    }

    public void setID_RangoAnio(Integer ID_RangoAnio) {
        this.ID_RangoAnio = ID_RangoAnio;
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

    public Integer getClaveUmbral() {
        return claveUmbral;
    }

    public void setClaveUmbral(Integer claveUmbral) {
        this.claveUmbral = claveUmbral;
    }

    
}
