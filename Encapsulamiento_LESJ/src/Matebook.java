public class Matebook {
//Permite crear atributos con valores globales
//Valores compartidos por todas las instancias que se hagande esta clase
//Atributos de clase

    public static String fabricante = "Apple";
    public static  final  String SISTEMA_OPERATIVO = "Max OS";
    
    //Atributos de instacncia 
    public static String modelo;
    public static String color;
    public static String numSerie;





    public Matebook(String matebookA1) {
        this.modelo = modelo;
        this.color = color;
        this.numSerie = numSerie;

    }

    public Matebook(String matebookA1, String gris, String Modelo) {
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Matebook.fabricante = fabricante;
    }


    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Matebook.modelo = modelo;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Matebook.color = color;
    }

    public static String getNumSerie() {
        return numSerie;
    }

    public static void setNumSerie(String numSerie) {
        Matebook.numSerie = numSerie;
    }


}
