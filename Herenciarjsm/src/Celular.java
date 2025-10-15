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

    // comportamiento puede llegar a una clase
    /*
    1- metodos nativos : nacieron o crearon aqui mismo, no tiene otro origen
    2-metodos heredados ( se sobreescriben)
    3- metodos implementados ( traidos de interfases)
     */

public void llamar(String numero){
    System.out.println("Llamando al numero"+numero);
}
public void mensaje(String mensaje, String numero){
    System.out.println("Enviando: \n"+mensaje+"\n al numero"+numero);
}
public void alarma(String hora){
    System.out.println("Alarmando a la hora:"+hora);
}



}
