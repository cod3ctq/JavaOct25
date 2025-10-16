package paquete2;

import com.Casa1;

public class Casa2 extends Casa1 {
    Casa1 ca1= new Casa1();   //se debe importar de paquete a paquete.

    public Casa2(){

        //ca1.fachada=""; //tambien es una manera incorrecta aunque no te den error
        //ca1.numero=23;  //

        //no importa que modificador de acceso tengan los atributos ne la clase, siempre deben ser accedidos a travez de get y set

        ca1.setFachada("");
        ca1.setNumero(23);

        //se puede hacer herencia entre clases y juntar modificadores de acceso

        this.acera="76";




    }

}
