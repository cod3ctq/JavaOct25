package com;

public class prueba {
    public static void main(String[] args) {
        Casa1 c1 = new Casa1();

        // Forma incorrecta de acceder a un atributo privado
        //c1.jardin = "fvertui";
        //c1.baño =3;
//forma correcta de acceder a un atributo privado
        c1.setJardin("6789");
        c1.setCochera("e3");
        c1.setBaño("wj");
        c1.getJardin();
        c1.getCochera();
        c1.getBaño();



    }
}
