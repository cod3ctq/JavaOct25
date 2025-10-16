package paquete2;
import com.Casa1;

public class Casa2 extends Casa1{

    //Casa1 ca1 = new Casa1();

    public Casa2(){
        //Acceso a un atributo public en una clase de otro paquete
        //acceso incorrecto
        this.fachada= "";
        this.numero= 12;

        //Acceso a atributos protegidos en una clase de otro paquete
        //es posible solo cuando se solicita herencia
        this.acera = "sadhds";
        this.patio = "sdfgfhs";
        this.puerta = "sdgsa";

        //No importa que modificador de acceso tengan los atributos
        //siempre deben de ser accedidos a traves de getter/setters
        this.setFachada("ddfhsa");
        this.setNumero(34);
    }

}
