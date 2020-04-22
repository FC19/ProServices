package entities;

import java.util.List;

public class Servicio {
    private String nombre;
    private String descripcion;
    private List<Tarea> tareas;

    public Servicio(){

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

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea tarea){
        this.tareas.add(tarea);
    }
}
