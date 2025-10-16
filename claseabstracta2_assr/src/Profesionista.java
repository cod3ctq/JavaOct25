public abstract class Profesionista {

    String nombre;
    String cedula;
    String escuela;

    // Constructor vacío
    public Profesionista() {}

    // Constructor completo
    public Profesionista(String nombre, String cedula, String escuela) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.escuela = escuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", escuela='" + escuela + '\'' +
                '}';
    }

    // Método abstracto
    public abstract void trabajar();
}
