package com;
//mecanismo para controlar por medio de los 3 modificadores de acceso
public class Casa1 {

    private String baño;
    private String cochera;
    private String jardin;

    protected String acera;
    protected String puerta;
    protected String patio;

    public String fachada;
    public int numero;
//constructor vacio
    public Casa1(){}
//constructor lleno
    public Casa1(String baño, String cochera, String jardin, String acera, String puerta, String patio, String fachada, int numero) {
        this.baño = baño;
        this.cochera = cochera;
        this.jardin = jardin;
        this.acera = acera;
        this.puerta = puerta;
        this.patio = patio;
        this.fachada = fachada;
        this.numero = numero;
    }
//get y set
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

    //tostring


    @Override
    public String toString() {
        return "Casa1{" +
                "baño='" + baño + '\'' +
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
