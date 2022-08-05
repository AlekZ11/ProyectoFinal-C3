package controlador.dao;

import modelo.RangoValores;

/**
 *
 * @author patob
 */
public class RangoValoresDao extends AdaptadorDao<RangoValores>{
    RangoValores rangoValores;

    public RangoValoresDao(RangoValores rangoValores) {
        this.rangoValores = rangoValores;
    }

    public RangoValores getRangoValores() {
        return rangoValores;
    }

    public void setRangoValores(RangoValores rangoValores) {
        this.rangoValores = rangoValores;
    }
    
    public RangoValoresDao() {
        super(RangoValores.class);
    }

}
