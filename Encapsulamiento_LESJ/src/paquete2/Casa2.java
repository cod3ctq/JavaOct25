package paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {

    Casa1 ca1 = new Casa1();

    public Casa2() {


        this.fachada = "";
        this.numeroExterior = 12;

        //Acceso a atributos protegidos a una clase de otro paquete
        // Es posible solo cuando se aplica herencia
        this.acera = "snsnmkaj";
        this.patio = "AiSJSJ";
        this.puerta = "KSJKAk";


        // No importa el modificador de acceso que tengan los atribustos
        //Siempre deben ser aceedidos por getter y setter
        ca1.setFachada("Fachada");
        ca1.numeroExterior = 2;


    }
}