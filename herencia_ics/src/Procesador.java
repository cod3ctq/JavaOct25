public class Procesador {

    int nucleos;
    double frecuencia;
    String fabricante;
    int genracion;

    public Procesador(){

    }

    public Procesador(int nucleos, double frecuencia, String fabricante, int genracion) {
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
        this.fabricante = fabricante;
        this.genracion = genracion;
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

    public int getGenracion() {
        return genracion;
    }

    public void setGenracion(int genracion) {
        this.genracion = genracion;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "nucleos=" + nucleos +
                ", frecuencia=" + frecuencia +
                ", fabricante='" + fabricante + '\'' +
                ", genracion=" + genracion +
                '}';
    }
}
