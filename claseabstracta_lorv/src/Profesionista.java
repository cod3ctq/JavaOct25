public abstract class Profesionista {
    //clase abstracta : clase cualquiera que contiene al menos 1 metodo abstracto
    String titulo;
    String cedula;
    String nombre;

    public Profesionista(String nombre, String titulo, String cedula) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.cedula = cedula;
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

    public abstract void trabajar(int horas);

    //metodo abstracto : Metodo sin cuerpo, sin implementacion o logica
    // Que debes hacer c

   public abstract void trabajar();

}
