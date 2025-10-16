package com;

public class Casa1 {
//Encapsulamiento:
    //Tipos de encapsulamiento: Public, Private; Protected
    private String baño;
    private String cochera;
    private String jardin;
    protected String puerta;
    protected String patio;
    protected String acera;
    public String fachada;
    public int numeroExterior;

    public Casa1(){}


    public Casa1(String baño, String cochera, String jardin, String puerta, String patio, String acera, String fachada, int numeroExterior) {
        this.baño = baño;
        this.cochera = cochera;
        this.jardin = jardin;
        this.puerta = puerta;
        this.patio = patio;
        this.acera = acera;
        this.fachada = fachada;
        this.numeroExterior = numeroExterior;
    }

    public String getBaño() {
        return baño;
    }

    public void setBaño(String baño) {
        this.baño = baño;
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

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getAcera() {
        return acera;
    }

    public void setAcera(String acera) {
        this.acera = acera;
    }

    public String getFachada() {
        return fachada;
    }

    public void setFachada(String fachada) {
        this.fachada = fachada;
    }

    public int getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(int numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    @Override
    public String toString() {
        return "Casa1{" +
                "baño='" + baño + '\'' +
                ", cochera='" + cochera + '\'' +
                ", jardin='" + jardin + '\'' +
                ", puerta='" + puerta + '\'' +
                ", patio='" + patio + '\'' +
                ", acera='" + acera + '\'' +
                ", fachada='" + fachada + '\'' +
                ", numeroExterior=" + numeroExterior +
                '}';
    }
}
