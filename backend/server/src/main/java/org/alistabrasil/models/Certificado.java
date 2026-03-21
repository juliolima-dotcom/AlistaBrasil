package org.alistabrasil.models;

public class Certificado {

    private String idCertificado;
    private String tipoCertificado;
    private String dataEmissao;
    private String codigoAutenticado;

    public Certificado(String idCertificado, String tipoCertificado, String dataEmissao) {
        this.idCertificado = idCertificado;
        this.tipoCertificado = tipoCertificado;
        this.dataEmissao = dataEmissao;
    }

    public String getIdCertificado() {
        return idCertificado;
    }

    public String getTipoCertificado() {
        return tipoCertificado;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getCodigoAutenticado() {
        return codigoAutenticado;
    }

    public String toString(){

        return "Numero de certificado: " + 
        idCertificado + "\nTipo de certficado: " +
        tipoCertificado + "Data de Emissão: " +
        dataEmissao + "Código de autenticação: " + 
        codigoAutenticado;
        
    }  
}
