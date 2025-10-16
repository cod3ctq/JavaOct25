public class Arquitecto extends Profesionista {

    public Arquitecto(String nombre, String cedula, String escuela) {
        super(nombre, cedula, escuela);
    }

    @Override
    public void trabajar() {
        System.out.println("El arquitecto está diseñando planos y supervisando la obra.");
    }
}
