public class Macbook {


    //permite crear atributos con valores globales
    //valores compartidos pro todas las instancias que se hagan de esta clase
    //atributos de clase
    public static String fabricante ="Apple";
    public static String sistemaOperativo ="Mac Os";

    //atributos de instancia

    public String modelo;
    public String color;
    public String numSerie;


    public Macbook(){


    }

    public Macbook(String modelo, String color, String numSerie) {
        this.modelo = modelo;
        this.color = color;
        this.numSerie = numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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
                "fabricante='" + fabricante + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numSerie='" + numSerie + '\'' +
                '}';
    }
}
