package modelo;


public class Umbral {
    private Integer id;
    private Integer anioMin;
    private Integer anioMax;
    private Double [] valoresMin = new Double[4];
    private Double [] valoresMax = new Double[4];
    private Integer id_valor;

    public Umbral(){   }

    public Umbral(Integer id, Integer anioMin, Integer anioMax, Double [] valoresMin, Double [] valoresMax, Integer id_valor){
        this.id = id;
        this.anioMin = anioMin;
        this.anioMax = anioMax;
        this.valoresMin = valoresMin;
        this.valoresMax = valoresMax;
        this.id_valor = id_valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnioMin() {
        return anioMin;
    }

    public void setAnioMin(Integer anioMin) {
        this.anioMin = anioMin;
    }

    public Integer getAnioMax() {
        return anioMax;
    }

    public void setAnioMax(Integer anioMax) {
        this.anioMax = anioMax;
    }

    public Double [] getValorMin() {
        return valoresMin;
    }

    public void setValorMin(Double [] valoresMin) {
        this.valoresMin = valoresMin;
    }

    public Double [] getValorMax() {
        return valoresMax;
    }

    public void setValorMax(Double [] valorMax) {
        this.valoresMax = valoresMax;
    }

    public Integer getId_valor() {
        return id_valor;
    }

    public void setId_valor(Integer id_valor) {
        this.id_valor = id_valor;
    }

}
