public class Camara {

    int fps;
    double mpx;
    double zoom;
    boolean estabilizador;
    int valorISO;


    public Camara(){}

    public Camara(int fps, double mpx, double zoom, int valorISO, boolean estabilizador) {
        this.fps = fps;
        this.mpx = mpx;
        this.zoom = zoom;
        this.valorISO = valorISO;
        this.estabilizador = estabilizador;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public double getMpx() {
        return mpx;
    }

    public void setMpx(double mpx) {
        this.mpx = mpx;
    }

    public boolean isEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(boolean estabilizador) {
        this.estabilizador = estabilizador;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
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
                ", mpx=" + mpx +
                ", zoom=" + zoom +
                ", estabilizador=" + estabilizador +
                ", valorISO=" + valorISO +
                '}';
    }
}
