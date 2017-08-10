package com.despegar.jav2017.contratar;

public class App {

    public static void main(String args[]){
        Empleado bianca = new Empleado("Bianca", "Petracca", 8000.5);
        Empresa despegarSA = new Empresa(8000.0);
        despegarSA.contratar(bianca);
        ExperienciaLaboral despegar = new ExperienciaLaboral(despegarSA, 0, new Trainee());
        bianca.agregarExperiencia(despegar);
        bianca.sueldoPromedio(despegar);
    }
}
