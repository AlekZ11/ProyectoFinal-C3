package modelo;


public class Vehiculo {
    private Integer id;

    private Integer id_cliente;
    private String marca;
    private String modelo;
    private Integer anio;
    private String placa;
    private String tipoVehiculo;
    private String tipoCombustible;

    public Vehiculo(){   }

    public Vehiculo(Integer id, String marca, String modelo, Integer anio, String placa, String tipoVehiculo, String tipoCombustible, Integer id_cliente){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
        this.id_cliente = id_cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", placa='" + placa + '\'' +
                ", tipoVehiculo=" + tipoVehiculo +
                ", tipoCombustible=" + tipoCombustible +
                ", Propietario=" + id_cliente +
                '}';
    }
}
