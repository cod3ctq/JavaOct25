public class Procesador {

    int nucleos;
    double frecuencia;
    String fabricante;
    int generacion;


    public Procesador(int nucleos, double frecuencia, String fabricante, int generacion) {
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
        this.fabricante = fabricante;
        this.generacion = generacion;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "nucleos=" + nucleos +
                ", frecuencia=" + frecuencia +
                ", fabricante='" + fabricante + '\'' +
                ", generacion=" + generacion +
                '}';
    }

    public Procesador(){}

}
