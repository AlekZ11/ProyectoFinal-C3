package controlador.dao;

import modelo.Umbral;

public class UmbralDao extends AdaptadorDao<Umbral> {
    private Umbral umbral;

    public Umbral getPersona() {
        return umbral;
    }

    public void setPersona(Umbral umbral) {
        this.umbral = umbral;
    }

    public UmbralDao() {
        super(Umbral.class);
    }

}
