package modelo;


public class Umbral {
    Integer id;
    Integer id_rango;
    String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_rango() {
        return id_rango;
    }

    public void setId_rango(Integer id_rango) {
        this.id_rango = id_rango;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Umbral(Integer id, Integer id_rango, String date) {
        this.id = id;
        this.id_rango = id_rango;
        this.date = date;
    }
}
