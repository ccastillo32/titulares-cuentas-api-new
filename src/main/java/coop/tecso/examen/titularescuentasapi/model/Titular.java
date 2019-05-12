package coop.tecso.examen.titularescuentasapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Representación de la tabla TITULAR
 * @author Cristian
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Titular implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String cuit;
    
    @ManyToOne
    @JoinColumn(name = "tipo")
    private TipoTitular tipo;
    
    private boolean habilitado;
    
    public Titular() {
        super();
        tipo = new TipoTitular();
    }

    public Titular(String cuit, TipoTitular tipo, boolean habilitado) {
        super();
        this.cuit = cuit;
        this.tipo = tipo;
        this.habilitado = habilitado;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public TipoTitular getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitular tipo) {
        this.tipo = tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
