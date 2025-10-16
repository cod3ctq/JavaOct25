package com;

public class Prueba {
    public static void main(String[] args) {


        Casa1 c1 = new Casa1();

        //Forma incorrecta de acceder a atributos privados
        //c1.jardin = "JSJJSjs";
        //c1.cochera = "SJAIISKL"


        //Forma correcta de acceder a atribustos privados: getter Y setter
        c1.setJardin("Jardin");
        c1.setCochera("Cochera");
        c1.setBaño("Baño");
        c1.getJardin();
        c1.getCochera();
        c1.getBaño();


    }
}
