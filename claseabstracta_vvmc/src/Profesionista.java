//Clase abstracta : Clase cualquiera que contiene al menos 1 método abstracto
public abstract class Profesionista {
    String titulo;
    String cedula;
    String nombre;

    public Profesionista(){}

    public Profesionista(String titulo, String cedula, String nombre) {
        this.titulo = titulo;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "titulo='" + titulo + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Método abstracto : Método sin cuerpo, sin implementación o lógica
    public abstract void trabajar(int horas);
}
