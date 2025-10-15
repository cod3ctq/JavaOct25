public class Smartphone extends Celular {
    String SistemaOperativo;
    String conectividad;

    //Composicion : construccion de objetos complejos a partir de otros mas simples

    Procesador proc;
    Camara cam;

    public Smartphone(){}

    public Smartphone(String marca, String modelo, String color, String tamaño, String sistemaOperativo, String conectividad, Procesador proc, Camara cam) {
        super(marca, modelo, color, tamaño);
        SistemaOperativo = sistemaOperativo;
        this.conectividad = conectividad;
        this.proc = proc;
        this.cam = cam;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
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
                "SistemaOperativo='" + SistemaOperativo + '\'' +
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
