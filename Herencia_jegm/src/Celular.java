public class Celular {
    String marca;
    String modelo;
    String color;
    String tamaño;

    public Celular() {}

    public Celular(String marca, String modelo, String color, String tamaño) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }

    //Comportamiento

    /*
    * Métodos nativos : Nacieron o se crearon aquí mismo
    * Métodos herdados (sobreescritura)
    * Métodos implementados (traidos desde interfaces)
    * */

    public void llamar(String numero){
        System.out.println("Llamando al número: "+numero);
    }
    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando :\n"+mensaje+"\n al número: "+numero);
    }
    public void alarma(String hora){
        System.out.println("La alarma sonará a las: "+hora);
    }
}
