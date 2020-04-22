package entities;

import java.time.LocalDate;

public class DisponibilidadHoraria {
   private LocalDate dia;
    private double horarioInicio;
    private double horarioFiin;

    public DisponibilidadHoraria(){

    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public double getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(double horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public double getHorarioFiin() {
        return horarioFiin;
    }

    public void setHorarioFiin(double horarioFiin) {
        this.horarioFiin = horarioFiin;
    }
}
