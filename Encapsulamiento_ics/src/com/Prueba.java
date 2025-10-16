package com;

public class Prueba {

    public static void main(String[] args) {

        Casa1 c1 = new Casa1();

        // forma incorrecta de acceder a un atributo privado
        //c1.jardin = "hkjdankebn";


        //forma correcta de acceder a un atributo privado : con getter y setter

        c1.setJardin("jnfnrfkjr");
        c1.setCochera("nkcedse");
        c1.setBaño("frfdf");
        c1.getJardin();
        c1.getCochera();
        c1.getBaño();


    }


}
