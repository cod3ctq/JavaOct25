package com;

public class Casa1 {
    private String banio;
    private String cochera;
    private String jardin;
    protected String acera;
    protected String puerta;
    protected String patio;
    public String fachada;
    public int numero;

    public Casa1(){

    }

    public Casa1(String banio, String cochera, String jardin, String acera, String puerta, String patio, String fachada, int numero) {
        this.banio = banio;
        this.cochera = cochera;
        this.jardin = jardin;
        this.acera = acera;
        this.puerta = puerta;
        this.patio = patio;
        this.fachada = fachada;
        this.numero = numero;
    }

    public String getBanio() {
        return banio;
    }

    public void setBanio(String banio) {
        this.banio = banio;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
    }

    public String getJardin() {
        return jardin;
    }

    public void setJardin(String jardin) {
        this.jardin = jardin;
    }

    public String getAcera() {
        return acera;
    }

    public void setAcera(String acera) {
        this.acera = acera;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getFachada() {
        return fachada;
    }

    public void setFachada(String fachada) {
        this.fachada = fachada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Casa1{" +
                "banio='" + banio + '\'' +
                ", cochera='" + cochera + '\'' +
                ", jardin='" + jardin + '\'' +
                ", acera='" + acera + '\'' +
                ", puerta='" + puerta + '\'' +
                ", patio='" + patio + '\'' +
                ", fachada='" + fachada + '\'' +
                ", numero=" + numero +
                '}';
    }
}
