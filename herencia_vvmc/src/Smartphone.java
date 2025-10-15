//El proposito real de la herencia es la ESPECIALIZACION
//estoy mutando la clase base (le agrego algo mas)
//la herencia no es bidireccional
public class Smartphone extends Celular{
    String sistemaOp, conectividad;
    //composicion: contruccion de objetos complejos a partir de otros
    //mas simples. Son tipos de datos personalizados.

    Procesador proc;//tiene los 4 atribuos en 1 solo, los encapsula
    Camara cam;//en lugar de agregar 5 atributos de camara, mejor agregue solo 1, lo encapsule, lo estructure
    public Smartphone(){

    }

    public Smartphone(String marca, String modelo, String color, String tamaño, String sistemaOp, String conectividad, Procesador proc, Camara cam) {
        super(marca, modelo, color, tamaño);
        this.sistemaOp = sistemaOp;
        this.conectividad = conectividad;
        this.proc = proc;
        this.cam = cam;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
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
                "sistemaOp='" + sistemaOp + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", proc=" + proc +
                ", cam=" + cam +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
    public void videoLlamada(){

    }
    public void capturarImagen(){

    }
    public void abrirYt(){

    }
}
