public class Procesador {
    int nucles;
    double frecuencia;
    String fabricante;
    int generacion;

    public Procesador(){

    }

    public Procesador(int nucles, double frecuencia, String fabricante, int generacion) {
        this.nucles = nucles;
        this.frecuencia = frecuencia;
        this.fabricante = fabricante;
        this.generacion = generacion;
    }

    public int getNucles() {
        return nucles;
    }

    public void setNucles(int nucles) {
        this.nucles = nucles;
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
                "nucles=" + nucles +
                ", frecuencia=" + frecuencia +
                ", fabricante='" + fabricante + '\'' +
                ", generacion=" + generacion +
                '}';
    }
}
