package com.despegar.jav2017.contratar;

import java.util.HashSet;
import java.util.Set;

public class Empleado {

    public Empleado(String nombre, String apellido, Double sueldoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoActual = sueldoActual;
    }

    private String nombre;
    private String apellido;
    private Set<ExperienciaLaboral> experienciasLaborales = new HashSet<>();
    private Double sueldoActual;

    public Double sueldoPromedio(ExperienciaLaboral experienciaLaboral) {
        return experienciaLaboral.sueldoPromedio(this);
    }

    public Double getSueldoActual() {
        return sueldoActual;
    }

    public Integer getAniosDeExperiencia() {
        return experienciasLaborales.stream()
                .mapToInt(ExperienciaLaboral::getAniosTrabajados).sum();
    }


    public void agregarExperiencia(ExperienciaLaboral experienciaLaboral) {
        experienciasLaborales.add(experienciaLaboral);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleado empleado = (Empleado) o;

        if (!nombre.equals(empleado.nombre)) return false;
        return apellido.equals(empleado.apellido);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        return result;
    }
}

