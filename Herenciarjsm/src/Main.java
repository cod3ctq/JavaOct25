//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Celular c1= new Celular("Nokia","1100,","Blanco","Chico");

        c1.llamar("744884");
        c1.mensaje( "hola amigue","40534075430");
        c1.alarma("10:15");




        Smartphone s1 = new Smartphone();
        s1.llamar("56575");
        s1.mensaje("hola amigue","83735795");
        s1.alarma("10:15");
    //hija son accesibles
        s1.abriryoutube();
    s1.capturarimagen();
    s1.videollamada();
Procesador proc= new Procesador(8,3.2,"Qualcom",3);
Camara c2= new Camara(120,200,100,true,5000);
   Smartphone s2= new Smartphone("Samsung","S23","Blanco","Grande");
        System.out.println(s2.getProc().getFabricante());
    }




}