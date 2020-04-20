package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private Prestador prestador;
    private Consumidor consumidor;
    private List<Tarea> tareas;
    private LocalDate fecha;
    private double horario;
    private estadoTrabajo estado;

    public Trabajo(){
       this.tareas= new ArrayList<>();
       this.estado= estadoTrabajo.NOIniciado;
    }
    public void cambiarEstado(){
        estadoTrabajo cambioDeEstado = estadoTrabajo.NOIniciado;
    }

    public void agregarTarea(Tarea unaTarea){
          this.tareas.add(unaTarea);
    }
    public void eliminarTarea(Tarea unaTarea){
        this.tareas.remove(unaTarea);
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
}
