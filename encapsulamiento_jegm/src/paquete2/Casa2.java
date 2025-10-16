package paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {
    public Casa2() {
        //Acceso a un atributo public en la clase de otro paquete
        //Acceso incorrecto
        this.fachada = "";
        this.numero = 12;

        //Acceso a atributos protegidos en una clase de otros paquetes
        // es posible sólo cuando se aplica herencia
        this.acera ="dsf";
        this.patio ="lkjg";
        this.puerta ="lkjlh";
    }
}
