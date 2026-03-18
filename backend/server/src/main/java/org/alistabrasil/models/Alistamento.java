package org.alistabrasil.models;

public class Alistamento {
    private int idAlistamento;
    private String dataAlistamento;
    private String status;
    private String observacoes;
    
    public Alistamento(int idAlistamento, String dataAlistamento) {
        this.idAlistamento = idAlistamento;
        this.dataAlistamento = dataAlistamento;
    }

    public String getDataAlistamento() {
        return dataAlistamento;
    }
    public void setDataAlistamento(String dataAlistamento) {
        this.dataAlistamento = dataAlistamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }







    
}
