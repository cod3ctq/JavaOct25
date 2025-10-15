public class Celular {
    //Abstraccion se refiere a el analisis y la sintetizacion de las caracteristicas importantes de un objeto.
    String marca;
    String modelo;
    String color;
    String tamaño;

    public Celular(){

    }

    public Celular(String marca, String modelo, String color, String tamaño) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
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

    //Comportamiento (metodos)
    //1. Métodos nativos: Nacieron/crearon aquí mismo, no tienen otro origen
    //2. Métodos heredados (se sobreescriben)
    //3. Métodos implementados (traidos de interfaces)

    public void llamar(String numero){
        System.out.println("Llamando al numero: " + numero);
    }

    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando mensaje al numero: " + numero + " con el mensaje: " + mensaje);
    }

    public void alarma(String hora){
        System.out.println("Alarma programada para las: " + hora);
    }

}
