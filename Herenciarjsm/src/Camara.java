public class Camara {

    int fps;
    double mxp;
    double zoom;
    boolean estabilizador;
    int valorISO;

    public Camara(){}

    public Camara(int fps, double mxp, double zoom, boolean estabilizador, int valorISO) {
        this.fps = fps;
        this.mxp = mxp;
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

    public double getMxp() {
        return mxp;
    }

    public void setMxp(double mxp) {
        this.mxp = mxp;
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
                ", mxp=" + mxp +
                ", zoom=" + zoom +
                ", estabilizador=" + estabilizador +
                ", valorISO=" + valorISO +
                '}';
    }
}
