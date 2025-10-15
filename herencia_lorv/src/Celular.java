public class Celular {

    String marca;
    String modelo;
    String color;
    String tamaño;

    public Celular(){}

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

    //Comportamiento
    /*
    1 - Metodos nativos: metodos que nacieron o se crearon aquí mismo, no tienen otro origen
    2 - Metodos heredados (se sobrescriben)
    3 - Metodo implementado (traidos de interfaces)
     */

    public void llamar(String numero){
        System.out.println("Lllamando al número: "+numero);
    }
    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviado :\n"+mensaje+"\n al numero: "+numero);
    }

    public void alarma(String hora){
        System.out.println("La alarma sonara a las: "+hora);
    }



}
