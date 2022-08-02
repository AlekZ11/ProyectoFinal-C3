package modelo;

public class Administrador extends Persona {
    private Integer id;
    private String usuario;
    private String password;

    public Administrador(){   }

    public Administrador(Integer id, String nombre, String apellido, String identificacion, String usuario, String password){
        super(nombre, apellido, identificacion);
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
