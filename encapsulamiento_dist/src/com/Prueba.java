package com;

public class Prueba {
    public static void main(String[] args) {
        Casa1 c1=new Casa1();
        //forma incorrecta de acceder a un atributo privado:
        //c1.jardin="frfffr";
        //no se puede acceder de manera directa

        //forma correcta de acceder a un atributo privado:
        //setters y getters, porque son publicos
        c1.setJardin("frfrgre");
        c1.getJardin();
    }
}
