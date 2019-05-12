package coop.tecso.examen.titularescuentasapi.dto;

public abstract class TitularDto {

    private String cuit;

    public TitularDto() {
        super();
    }

    public TitularDto(String cuit) {
        super();
        this.cuit = cuit;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
}
