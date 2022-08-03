package controlador.dao;

import modelo.Persona;

public class UmbralDao extends AdaptadorDao<Persona> {
    private Persona umbral;

    public Persona getPersona() {
        return umbral;
    }

    public void setPersona(Persona umbral) {
        this.umbral = umbral;
    }

    public UmbralDao() {
        super(Persona.class);
    }

}
