public class Camara {

    int fps;
    double pixeles;
    double zoom;
    boolean estabilizador;
    int valorISO;

    public Camara(){}

    public Camara(int fps, double pixeles, double zoom, boolean estabilizador, int valorISO) {
        this.fps = fps;
        this.pixeles = pixeles;
        this.zoom = zoom;
        this.estabilizador = estabilizador;
        this.valorISO = valorISO;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public double getPixeles() {
        return pixeles;
    }

    public void setPixeles(double pixeles) {
        this.pixeles = pixeles;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    public boolean isEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(boolean estabilizador) {
        this.estabilizador = estabilizador;
    }

    public int getValorISO() {
        return valorISO;
    }

    public void setValorISO(int valorISO) {
        this.valorISO = valorISO;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "fps=" + fps +
                ", pixeles=" + pixeles +
                ", zoom=" + zoom +
                ", estabilizador=" + estabilizador +
                ", valorISO=" + valorISO +
                '}';
    }
}
