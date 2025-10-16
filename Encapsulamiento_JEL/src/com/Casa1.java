package com;

public class Casa1 {

    private String bano;
    private String cochera;
    private String jardin;
    protected String puerta;
    protected String acera;
    protected String patio;

    public String fachada;
    public int numero;

    public Casa1(){

    }

    public Casa1(String bano, String cochera, String jardin, String puerta, String acera, String patio, String fachada, int numero) {
        this.bano = bano;
        this.cochera = cochera;
        this.jardin = jardin;
        this.puerta = puerta;
        this.acera = acera;
        this.patio = patio;
        this.fachada = fachada;
        this.numero = numero;
    }

    public String getBano() {
        return bano;
    }

    public void setBano(String bano) {
        this.bano = bano;
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

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getAcera() {
        return acera;
    }

    public void setAcera(String acera) {
        this.acera = acera;
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
                "bano='" + bano + '\'' +
                ", cochera='" + cochera + '\'' +
                ", jardin='" + jardin + '\'' +
                ", puerta='" + puerta + '\'' +
                ", acera='" + acera + '\'' +
                ", patio='" + patio + '\'' +
                ", fachada='" + fachada + '\'' +
                ", numero=" + numero +
                '}';
    }
}
