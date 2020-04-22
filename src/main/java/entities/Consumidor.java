package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consumidor {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numeroDocumento;
    private List<String> domicilios;
    private List<String> emails;
    private List<Integer> telefono;

    public Consumidor(){

        this.domicilios=new ArrayList<>();
        this.emails= new ArrayList<>();
        this.telefono=new ArrayList<>();
    }
    public void contratar(){
        estadoTrabajo contratado = estadoTrabajo.Iniciado;
    }
    public String opinarTrabajoRealizado(String o){
        return opinarTrabajoRealizado(o);
    }
    public void puntuarTrabajoRealizado(int i){
           puntuarTrabajoRealizado(1);
           puntuarTrabajoRealizado(2);
           puntuarTrabajoRealizado(3);
           puntuarTrabajoRealizado(4);
           puntuarTrabajoRealizado(5);
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

    public List<String> getEmails() {
        return emails;
    }

    public List<Integer> getTelefono() {
        return telefono;
    }


    public void agregartelefono(Integer telefono){
        this.telefono.add(telefono);}

    public void agregaremail(String ... emails){
        Collections.addAll(this.emails);
    }
}
