package controlador.dao;

import modelo.RangoAnio;

/**
 *
 * @author patob
 */
public class RangoAnioDao extends AdaptadorDao<RangoAnio>{
    RangoAnio rangoAnio;

    public RangoAnioDao(RangoAnio rangoAnio) {
        super(RangoAnio.class);
        this.rangoAnio = rangoAnio;
    }

    public RangoAnio getRangoAnio() {
        return rangoAnio;
    }

    public void setRangoValores(RangoAnio rangoAnio) {
        this.rangoAnio = rangoAnio;
    }
    
    public RangoAnioDao() {
        super(RangoAnio.class);
    }

}
