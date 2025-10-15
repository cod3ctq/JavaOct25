public class Smartphone extends Celular {
        String sistemaOperativo;
        String conectividad;

        // Composición: Construción de objetos complejos a partir de otros más simples
        Procesador proc;
        Camara cam;
    public Smartphone(){}
    public Smartphone(String marca, String modelo, String color, String tamaño, String sistemaOperativo, String conectividad, Procesador proc,Camara cam) {
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
    public void setCamara(Camara cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", proc=" + proc +
                ", conectividad='" + conectividad + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", camara=" + cam +
                '}';
    }

    public void videoLlamada(){

    }
    public void capturarImagen(){

    }
    public void abrirYoutube(){

    }
}
