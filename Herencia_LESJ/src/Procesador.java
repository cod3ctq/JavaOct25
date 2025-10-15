public class Procesador {

    int nucleos;
    double frecuencia;
    String fabricantes;
    int generacion;

    public Procesador(){

    }

    public Procesador(int nucleos, double frecuencia, String fabricantes, int generacion) {
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
        this.fabricantes = fabricantes;
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

    public String getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(String fabricantes) {
        this.fabricantes = fabricantes;
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
                ", fabricantes='" + fabricantes + '\'' +
                ", generacion=" + generacion +
                '}';
    }
}
