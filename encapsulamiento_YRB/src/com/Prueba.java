package com;

public class Prueba {

    public static void main(String[] args) {
        Casa1 c1 = new Casa1();

        // Forma correcta de acceder a atributos privados mediante setters
        c1.setJardin("dhsdnhsd");
        c1.setCochera("fdg");
        c1.setBaño("ffdfg");

        // Usar getters para obtener e imprimir valores
        System.out.println(c1.getJardin());
        System.out.println(c1.getCochera());
        System.out.println(c1.getBaño());
    }
}

