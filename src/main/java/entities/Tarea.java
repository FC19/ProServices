package entities;

public class Tarea {
  private  String nombre;
  private String descripcion;

    public Tarea(String nombre){
        this.nombre         = nombre;
        this.descripcion    = this.nombre;
    }

    public void actualizarDescripcion(String descripcion){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
