package com;

public class Prueba {
    public static void main(String[] args) {

        Casa1 c1 = new Casa1();

        //Forma incorrecta de acceder a un atributo privado
//        c1.jardin = "sa<fsd";
//        c1.baño = "asdfsdd";

        //Forma correcta de acceder a un atributo privado : getter o setters
        c1.setJardin("werf");
        c1.setCochera("sdf");

    }
}
