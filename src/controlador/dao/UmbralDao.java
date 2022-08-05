package controlador.dao;


import modelo.Umbral;

public class UmbralDao extends AdaptadorDao<Umbral> {
    private Umbral umbral;

    public Umbral getUmbral() {
        return umbral;
    }

    public void setUmbral(Umbral umbral) {
        this.umbral = umbral;
    }

    public UmbralDao() {
        super(Umbral.class);
    }

}
