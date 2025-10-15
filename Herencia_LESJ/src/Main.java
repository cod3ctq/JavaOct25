//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Smarphone s1 = new Smarphone();

s1.abirYoutube();
s1.capturarImagen();
s1.videollamada();

Procesador proc = new Procesador(8,3.2, "Quealcom", 2);
Camara cam = new Camara(120,200,100,true,5000);
Smarphone s2= new Smarphone("Samnsung", "S23 Ultra",
        "Negro", "Grande", "Android",
        "Wifi 6, 5g, gps, bluetooth",proc,cam);

        System.out.println(s2.getProc().getFabricantes()); // Para saber datos especificos
    }
}
/*Celular c1 = new Celular("Nokia" , "1100", "Blanco", "CHICO");

c1.llamar("7445009855");
c1.mandarMensaje("7445009855", "Hola");
c1.alarma("10:15");*/

