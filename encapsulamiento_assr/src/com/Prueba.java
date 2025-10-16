package com;


    public class Prueba {
        public static void main(String[] args) {

            Casa1 c1 = new Casa1();
            //forma incorrecta
            // c1.baño();
             //c1.jardin();
             //c1.cochera();



            // Forma correcta de acceder a los atributos privados atravez de set y  get
            c1.setJardin("ugiu ygi ugi ug");
            c1.setBaño("regunire");
            c1.setCochera("dqdqbs");

            // Mostrar los valores
            System.out.println("Jardín: " + c1.getJardin());
            System.out.println("Baño: " + c1.getBaño());
            System.out.println("Cochera: " + c1.getCochera());
        }
    }


