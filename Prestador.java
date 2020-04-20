package Clases;

import java.util.ArrayList;
import java.util.List;

public class Prestador {
    private String nombre;
    private String apellido;
    private int cuil;
    private tiposDeDocumentos tipoDocumento;
    private int numeroDocumento;
    private List<String> emails;
    private List<Integer> telefono;
    private List<DisponibilidadHoraria> disponibilidadesHorarias;

    public Prestador(){
        this.emails= new ArrayList<>();
        this.telefono=new ArrayList<>();
        this.disponibilidadesHorarias=new ArrayList<>();

    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public  void setTelefono(List<Integer> telefono){this.telefono = telefono;}

    public void setDisponibilidadesHorarias(List<DisponibilidadHoraria> disponibilidadesHorarias) {
        this.disponibilidadesHorarias = disponibilidadesHorarias;
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

    public tiposDeDocumentos getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(tiposDeDocumentos tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public List<String> getEmails() {
        return emails;
    }

    public List<Integer> getTelefono() {
        return telefono;
    }

    public void cambiarReputacion(Reputacion reputacion){}

}
