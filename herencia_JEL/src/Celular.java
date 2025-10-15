public class Celular {

    String marca;
    String modelo;
    String color;
    String tamano;

    public Celular() {

    }

    public Celular(String marca, String modelo, String color, String tamano) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamano = tamano;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }

    //  COMPORTAMIENTO

    /*
    1   - Metodos nativos : Nacieron o se crearon aqui mismo, no tienen otro origen
    2   - Metodos heredados (sobreescritura) :
    3   - Metodos implementados (traidos de interfaces)
     */

    public void llamar(String numero){

        System.out.println("Llamar al numero: " + numero);

    }

    public void mandarMensaje(String numero, String mensaje){

        System.out.println("Enviando : " + mensaje + "\nal numero: " + numero);

    }

    public void alarma(String hora) {

        System.out.println("La alarma sonara a las: " + hora);
    }


}
