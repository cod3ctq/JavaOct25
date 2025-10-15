//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("Nokia","1100","Blanco","Chico");

        c1.llamar("2534534543");
        c1.mandarMensaje("1243214234", "Hola");
        c1.alarma("10:15");

        Smartphone s1 = new Smartphone();

        s1.llamar("25309843");
        s1.mandarMensaje("09873214234", "Adios");
        s1.alarma("10:25");
        //Invoca a metodos de la clase hija y solo a traves del objeto de la clase
        //hija son accesible
        s1.videoLlamada();
        s1.abrirYoutube();
        s1.capturarImagen();

        //Se invocan los objetos (procesador y camara) para poder llenar los atributos especificos al momento
        // de crear un nuevo smarthphone

        Procesador proc = new Procesador(8, 3.2, "Qualcom", 2);
        Camara cam = new Camara(120, 200,100, true, 5000);

        Smartphone s2 = new Smartphone("Samsung", "s23", "Negro",
                "Grande", "android", "Wifi6, 5g, gps, bluetooth", proc, cam);

        System.out.println(s2.getProc().getFabricante());

    }
}