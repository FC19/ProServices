package Clases;

import java.util.List;

public class Consumidor {
    String nombre;
    String apellido;
    String tipoDocumento;
    int numeroDocumento;
    List<String> domicilios;
    List<String> emailS;
    List<int> telefono;

    public Consumidor(){

    }
    public boolean contratar(){

    }
    public String opinarTrabajoRealizado(){

    }
    public int puntuarTrabajoRealizado(){

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

    public List<String> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<String> domicilios) {
        this.domicilios = domicilios;
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
}
