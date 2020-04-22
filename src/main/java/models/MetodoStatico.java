package models;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class MetodoStatico {
    private static List<Servicio> services;
    private static List<Tarea> tasks;
    private static List<Prestador> providers;

    public static List<Servicio> getServices(){
        if(services==null)
            MetodoStatico.instanciacion();
        return services;
    }

    public static List<Tarea> getTasks(){
        if(tasks == null)
            MetodoStatico.instanciacion();
        return tasks;
    }

    public static List<Prestador> getProviders(){
        if(providers == null)
            MetodoStatico.instanciacion();
        return providers;
    }

    public static void instanciacion(){
        Servicio computing = new Servicio();
        Servicio electrical = new Servicio();

        tasks = new ArrayList<Tarea>();

        Tarea computerFix = new Tarea("Computer fix");
        Tarea systemOperativeInstallation = new Tarea("Installation  of SO");
        Tarea refrigeratorFix = new Tarea("Refrigerator fix");
        Tarea lightFix = new Tarea("Light Fix");

        tasks.add(computerFix);
        tasks.add(systemOperativeInstallation);
        tasks.add(refrigeratorFix);
        tasks.add(lightFix);

        computing.agregarTarea(computerFix);
        computing.agregarTarea(systemOperativeInstallation);
        electrical.agregarTarea(refrigeratorFix);
        electrical.agregarTarea(lightFix);

        Prestador juan = new Prestador(1,"Juan","Perez",2022222212, tiposDeDocumentos.DNI,222222);
        Prestador martin = new Prestador(2,"Martin","Perez",203333312,tiposDeDocumentos.DNI,33333);
        DisponibilidadHoraria DisponibiliadHoraria = new DisponibilidadHoraria();
        DisponibilidadHoraria anotherDisponibiliadHoraria = new DisponibilidadHoraria();
        juan.agregarDisponibilidadHoraria(DisponibiliadHoraria);
        martin.agregarDisponibilidadHoraria(anotherDisponibiliadHoraria);

       services = new ArrayList<Servicio>();
       services.add(computing);
       services.add(electrical);

       providers = new ArrayList<Prestador>();
       providers.add(juan);
       providers.add(martin);

    }
}
