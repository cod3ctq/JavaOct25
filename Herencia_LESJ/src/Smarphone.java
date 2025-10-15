public class Smarphone extends Celular {
    String sistemaOperativo;
    String conectividad;
    //Composicion : Construccion de objetos complejos a partir de otros mas simples
    Procesador proc;//Es un objeto de la calse procesador
    Camara cam;//Es un objeto de la clase procesador

    //Composicion
    public  Smarphone(){

    }

    public Smarphone(String marca, String modelo, String color, String tamaño, String sistemaOperativo, String conectividad, Procesador proc, Camara cam) {
        super(marca, modelo, color, tamaño);
        this.sistemaOperativo = sistemaOperativo;
        this.conectividad = conectividad;
        this.proc = proc;
        this.cam = cam;
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

    public Camara getCam() {
        return cam;
    }

    public void setCam(Camara cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Smarphone{" +
                "tamaño='" + tamaño + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cam=" + cam +
                ", proc=" + proc +
                ", conectividad='" + conectividad + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }

    public void  videollamada(){

    }

    public  void  capturarImagen(){

    }

    public void abirYoutube(){

    }
}
