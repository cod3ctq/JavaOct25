//El proposito real de la herencia es la ESPECIALIZACION

public class Smartphone extends Celular{

    String sistemaOperativo;
    String conectividad;


    //Composicion:
    Procesador proc; //Es un objeto de la clase de procesador
    Camara cam;

    public Smartphone(){}

    public Smartphone(String marca, String modelo, String color, String tamaño, String sistemaOperativo, String conectividad, Procesador proc, Camara cam) {
        super(marca, modelo, color, tamaño);
        this.sistemaOperativo = sistemaOperativo;
        this.conectividad = conectividad;
        this.proc = proc;
        this.cam = cam;
    }

    //procesador, camara, almacenamiento, touch, gps


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

    public Camara getCam() {
        return cam;
    }

    public void setCam(Camara cam) {
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

    public void videollamada(){

    }

    public void capturarImagen(){

    }

    public void abrirYoutube(){

    }

}
