public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("Nokia", "1100", "Blanco", "Chico");

        c1.llamar("54765");
        c1.mandarMensaje("474715", "hola");
        c1.alarma("10:15");

        Smartphone s1 = new Smartphone();
        s1.llamar("54765");
        s1.mandarMensaje("474715", "hola");
        s1.alarma("10:15");
        s1.videollamada();
        s1.capturarImagen();

        Procesador proc = new Procesador(8, 3.2, "Qualcom", 2);
        Camara cam = new Camara(120, 200, 100, true, 5000);

        Smartphone s2 = new Smartphone("Samsung", "S23 Ultra", "Negro", "Grande", "Android", "Wifi6,5g,gps,bluetooth", proc, cam);

        System.out.println(s2.getProc().getFabricante());
    }
}
