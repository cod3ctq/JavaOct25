public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular("Nokia", "1100","Blanco", "Chico");

        c1.llamar("7896574858");
        c1.mandarMensaje("9876897","hola");
        c1.alarma("10:15");

        Smartphone s1 = new Smartphone();
        s1.llamar("546343654");
        s1.mandarMensaje("87949493","Otro mensaje");
        s1.alarma("17:40");

        s1.videollamada();
        s1.abrirYoutube();
        s1.capturarImagen();

        Procesador proc = new Procesador(8,3.2,"Qualcom",2);
        Camara cam = new Camara(120,200,100,true,500);

        Smartphone s2 = new Smartphone("Samsung", "s23 ultra", "Negro", "Grande",
                "Android","wifi6, 5g, gps, bluetoth", proc, cam);

        System.out.println(s2.getProc().getFabricante());

    }
}
