public class Ingeniero extends Profesionista {

    // Constructor vacío que llama al de la clase padre
    public Ingeniero() {
        super(); // Llama al constructor vacío de Profesionista
    }

    // Constructor con parámetros (opcional)
    public Ingeniero(String nombre, String cedula, String escuela) {
        super(nombre, cedula, escuela);
    }

    @Override
    public void trabajar() {
        System.out.println("El ingeniero está supervisando el proyecto y resolviendo problemas técnicos.");
    }
}
