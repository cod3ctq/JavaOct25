import javax.swing.*;
import javax.swing.text.StyleContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("Nokia", "1100", "Blanco", "Chico");
        c1.llamar("37637");
        c1.mandarMensaje("9234234", "hola");
        c1.alarma("10:96");

        Smartphone s1 = new Smartphone();
        s1.llamar("2342342");
        s1.mandarMensaje("32435423", "holaa");
        s1.alarma("45:98");

        //invoca a metodos de la clase hija, y solo a traves del obbjeto de la clase
        // hija son accesibles
        s1.videoLlamada();
        s1.abrirYoutube();
        s1.capturarImagen();

        Procesador proc = new Procesador(); //nucleos:8, fecuencia:3.2, fabricante: "Qualcom", generacion: 2
        Camara cam = new Camara(1);//fps:120, mpx: 200, zoom:100, estabilizador: true, valorISO: 5000)

        Smartphone s2 = Smartphone();// marca: "Samsung", modelo: "S23 Ultra", color: "Negro", tamaño: Grande,
                // SistemaOperativo: Android, conectividad: "Wifi6, gps, bluetooth", proc, cam);
    }
}