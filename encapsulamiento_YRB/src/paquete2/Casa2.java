package paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {

    Casa1 ca1 = new Casa1 ();

    public Casa2(){
        //Acceso a un tributo public en una clase de otro paquete
        //Acceso indirecto

        this.fachada ="";
        this.numero =12;

        // Acceso a atributos en una clase de otro paquete es
        // posible solo cuando se aplica herencia

        this.acera="hdgdyw";
        this.patio= "jfnjdkd";
        this.puerta="nsudnhs";


        //No importa que modificador de acceso tengan los atributos
        // siempre deben ser accedidos atraves de getter/setter
        ca1.setFachada("vflgvj");
        ca1.setNumero(12);

    }
}
