public class Macbook {

    //permite crear atributos con valores globales
    //Valores compartidos por todas las instancias que se hagan de esta clase
    //Atributos de clase
    public static String fabricante = "Apple";
    public static final String SISTEMAOPERATIVO = "Mac OS";
    //Atributos de instancia
    public String modelo;
    public String numSerie;
    public String color;

    public Macbook() {

    }

    public Macbook(String modelo, String numSerie, String color) {
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.color = color;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Macbook.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Macbook{" +
                "modelo='" + modelo + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
