//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Celular c1=new Celular("Nokia","100","Blanco","Chico");
        c1.llamar("7333223323");
        c1.mandarMensaje("32344324","hola");
        c1.alarma("10:15");
        Smartphone s1=new Smartphone();
        s1.llamar("43543543");
        s1.mandarMensaje("35325","otro mensaje");
        s1.alarma("5:40");
        //Invoca a metodos de la clase hija, y solo atraves del
        //objetivo de la clase hija son accesibles
        s1.videoLlamada();
        s1.abrirYt();
        s1.capturarImagen();
        //primero se crea al objeto secundario (procesador) y despues se llena el principal (smartphone)
        //igual con camara
        //del objeto mas grande al mas pequeño
        Procesador proc=new Procesador(8,3.2,"Qualcomm",2);
        Camara cam=new Camara(120,200,100,true,5000);
        Smartphone s2=new Smartphone("Samsung","S23 ultra","Negro","Grande","Android","Wifi6,5g,bt,gps,etc.",proc,cam);
        //se accede primero al principal/padre (smartphone/s2) y despues al secundario
        System.out.println(s2.getProc().getFabricante());
    }
}