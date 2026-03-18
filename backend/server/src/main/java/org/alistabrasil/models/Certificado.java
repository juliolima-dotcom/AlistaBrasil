package org.alistabrasil.models;

public class Certificado {
    private int idCertificado;
    private String tipoCertificado;
    private String dataEmissao;
    private String codigoAutenticado;

    public Certificado(int idCertificado, String tipoCertificado, String dataEmissao) {
        this.idCertificado = idCertificado;
        this.tipoCertificado = tipoCertificado;
        this.dataEmissao = dataEmissao;
    }

    public int getIdCertificado() {
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

    

    
}
