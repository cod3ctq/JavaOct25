//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Celular c1 =new Celular("Nokia","N1100","Negro","x  Grande");

    c1.llamar("5576767676");
    c1.mandarMensaje("66485784","Hola");
    c1.alarma("10:15");

    Smartphone s1= new Smartphone();
    s1.llamar("6673593");
    s1.mandarMensaje("556385047","Hola como estas ");

    //invoca metodos de el hijo al padre
    s1.abriryoutube();
    s1.videollamada();

    Procesador proc = new Procesador(8,3.2,"QUALCOM",5);




    }

}