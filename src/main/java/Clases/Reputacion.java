package Clases;

public abstract class Reputacion {
    private int puntuacionTotal;

    public Reputacion(){

    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }


    public void recibirCalificacion(Calificacion calificacion,Prestador prestador){

    }
}
