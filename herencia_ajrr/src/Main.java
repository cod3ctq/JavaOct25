//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //La abstraccion se refiere  al analisis y sintetizacion
        //de las caracteristicas importantes de un objeto

        Celular c1 = new Celular("Nokia","1100","Blanco","Chico");

        c1.llamar("865675");
        c1.mandarMensaje("765679","Hola");
        c1. alarma("10:15");

        Smartphone s1 = new Smartphone();
        s1.llamar("85873");
        s1.mandarMensaje("7665","Hola");
        s1.alarma("11:50");

        s1.videollamada();
        s1.abrirYoutube();
        s1.capturarImagen();

        Procesador proc = new  Procesador(8,3.2,"Qualcom",2);
        Camara cam = new Camara (120,200,100,true,5000);

        Smartphone s2 = new Smartphone("Samsung","S23 Ultra", "Negro","Grande", "Android","Wifi6",proc, cam);

        System.out.println(s2.getProc().getFabricante());





    }
}