//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("Nokia","1100", "Blanco", "Chico");

        c1.llamar("37637656");
        c1.mandarMensaje("9876897", "hola");
        c1.alarma("10:15");


        Smartphone s1 = new Smartphone();
        s1.llamar("546343654");
        s1.mandarMensaje("3246342","otro mensaje");
        s1.alarma("17:40");

        //Invoca a metodos de la clase hija, y solo a traves del objeto de la clase
        //hija son accesibles
        s1.videollamada();
        s1.abrirYoutube();
        s1.capturarImagen();


        Procesador proc = new Procesador(8,3.2,"Qualcomm", 2);
        Camara cam = new Camara(120,200,100,true,5000);

        Smartphone s2 = new Smartphone("Samsung", "S23 Ultra", "Negro",
                "Grande","Android",
                "Wifi6, 5g, gps, bluetooth",proc,cam);

        System.out.println(s2.getProc().getFabricante());




    }
}