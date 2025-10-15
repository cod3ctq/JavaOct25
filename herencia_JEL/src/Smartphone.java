
//EL PROPOSITO REAL DE LA HERENCIA ES LA ESPECIALIZACION
public class Smartphone extends Celular{

    String sistemaOperativo;
    String conectividad;

    Procesador proc; //Es un objeto de la clase procesador
    Camara cam; //Es un objeto de la clase procesador

    //Composicion : Contruccion de objetos complejos a partir de otros mas simples
    //Procesador, Camara, Almacenamiento, Touchscreen, GPS

    public Smartphone(){

    }

    public Smartphone(String marca, String modelo, String color, String tamano, String sistemaOperativo, String conectividad, Procesador proc, Camara cam) {
        super(marca, modelo, color, tamano);
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
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", proc=" + proc +
                ", cam=" + cam +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
    //Metodos nativos de smarthphone
    public void videoLlamada(){

    }

    public void capturarImagen(){

    }

    public void abrirYoutube(){
    }

}
