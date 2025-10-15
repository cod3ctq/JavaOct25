
//El proposito real de la herencia es la ESPECIALIZACION

public class Smartphone extends Celular{
    String sistemaOperativo;
    String conectividad;

//compocision: construccion de objetos a partir de otros mas simples
    Procesador proc ;
    camara cam ;
//aqui todo default

    public Smartphone(){}

    public Smartphone(String marca, String modelo, String color, String tamaño, String sistemaOperativo, String conectividad, Procesador proc, camara cam) {
        super(marca, modelo, color, tamaño);
        this.sistemaOperativo = sistemaOperativo;
        this.conectividad = conectividad;
        this.proc = proc;
        this.cam = cam;

    }

    public Smartphone(String samsung, String s23, String s) {
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public Procesador getProc() {
        return proc;
    }

    public void setProc(Procesador proc) {
        this.proc = proc;
    }

    public camara getCam() {
        return cam;
    }

    public void setCam(camara cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", proc=" + proc +
                ", cam=" + cam +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }


void videollamada(){

}

void abriryoutube(){

}







}
