//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Abstracción: análisis y sintetización de las características importantes de
        // un objeto

        Celular c1 = new Celular("Nokia","1100","Blanco","Mediano");

        c1.llamar("5615854223");
        c1.mandarMensaje("5615854223","Hola");
        c1.alarma("10:20");

        Smartphone s1 = new Smartphone();
        s1.llamar("5615854223");
        s1.mandarMensaje("5615854223","Otro mensaje");
        s1.alarma("10:50");

        //Invoca a métodos de la clase hija, y sólo a traves del objeto de la clase hija
        s1.videoLlamada();
        s1.videoLlamada();
        s1.abrirYoutube();
        Procesador proc = new Procesador(8,3.2,"Qualcom",2);
        Camara cam = new Camara(120,200,100,true,5000);

        Smartphone s2 = new Smartphone("Samgsung","S23 Ultra","Negro","Grande","Android","Wifi6, 5g, gps, Bluetooth",proc,cam);
        System.out.println(s2.getProc().getFabricante());
    }
}