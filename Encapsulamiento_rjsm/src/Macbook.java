public class Macbook {
    //Permite crear atributos con valores globales
    //Valores compartidos por todas las instancias que se hagan de esta clase
    public static String fabricante ="apple";
    public static final String SISTEMA_OPERATIVO="IOS";


    //Atributos de instancia
    public String modelo;
    public String color;
    public String numSerie;

    public Macbook(){}

    public Macbook(String modelo, String color, String numSerie) {
        this.modelo = modelo;
        this.color = color;
        this.numSerie = numSerie;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Macbook.fabricante = fabricante;
    }

    public static String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public static void setSistemaOperativo(String sistemaOperativo) {
        Macbook.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    @Override
    public String toString() {
        return "Macbook{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numSerie='" + numSerie + '\'' +
                '}';
    }
}
