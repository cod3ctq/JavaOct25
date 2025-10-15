public class Celular {
    String marca;
    String modelo;
    String color;
    String tamaño;

    public Celular (){

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
    public  void  llamar (String numero){
        System.out.println("LLamando al numero" + numero);
    }

    public void mandarMensaje (String numero, String mensaje){
        System.out.println("Enviando :\n" + mensaje + "\n al numero" + numero);
    }

    public void alarma (String hora){
        System.out.println( "la alarma sonara a las" + hora);
    }


    /*comportamiento
    1- Metodos nativos : Nacieron o se crearon aqui mismo, no tiene otr origen
    2.- Metodos Heredados (se sobreescribe
    3.- Metodos implementados (Traidos desde interfaces)
     */


}
