public class Macbook {
    //static=permite crear atributos con valores globales=
    //que son valores compartidos por todas las instancias que se hagan
    //de esta clase.
    //Atributos de clase: (porque desde la clase se les esta dando
    //un valor)
    //son valores que todavia pueden ser cambiados, sino tendriamos
    //que hacerlos final
    public static String fabricante="Apple";
    //al llamar a la clase se accede a la constante
    public static final String SISTEMA_OP="Mac OS";
    //Atributos de instancia: porque le correspondera a cada objeto
    //darle un valor a los atributos
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
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
