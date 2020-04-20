package Clases;

public class  MalaReputacion extends Reputacion {
    public int cantVecesTrabajoPorSemana=1;
    public int cantidad =0;


    public int getCantVecesTrabajoPorSemana() {
        return cantVecesTrabajoPorSemana;
    }

    public void setCantVecesTrabajoPorSemana(int cantVecesTrabajoPorSemana) {
        this.cantVecesTrabajoPorSemana = cantVecesTrabajoPorSemana;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void recibirCalificacion (Calificacion calificacion){

    }
}


