package paquete2;

import com.Casa1;

public class Casa2 {
    Casa1 ca1=new Casa1();
    //en clases de otros paquetes no se puede tener acceso de manera
    //directa a otras clases
    public Casa2(){
        //acceso a un atributo public en una clase de otro
        //paquete y es un ACCESO INCORRECTO
        ca1.fachada="";
        ca1.numero=12;
        //NO IMPORTA QUÉ MODIFICADOR DE ACCESO TENGAN LOS ATRIBUTOS
        //SIEMPRE DEBEN SER ACCESIDOS A TRAVES DE GETTERS/SETTERS
        ca1.setFachada("greg");
        ca1.setNumero(32);
        //protected puede extender la visibilidad de un componennte
        //hasta el tercer nivel, heredando:
        //Casa2 extends Casa1
    }
}
