package Clases;

import java.util.List;

public class Prestador {
    String nombre;
    String apellido;
    int cuil;
    String tipoDocumento;
    int numeroDocumento;
    List<String> emails;
    List<int> telefono;
    DisponibilidadHoraria disponibilidadesHorarias;

    public Prestador(){

    }
    public boolean aceptarTrabajo(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public List<String> getEmailS() {
        return emailS;
    }

    public void setEmailS(List<String> emailS) {
        this.emailS = emailS;
    }

    public List<int> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<int> telefono) {
        this.telefono = telefono;
    }

    public DisponibilidadesHorarias getDisponibilidadesHorarias() {
        return disponibilidadesHorarias;
    }

    public void setDisponibilidadesHorarias(DisponibilidadesHorarias disponibilidadesHorarias) {
        this.disponibilidadesHorarias = disponibilidadesHorarias;
    }
}
