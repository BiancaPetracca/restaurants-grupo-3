package com.despegar.jav2017.contratar;

import java.util.HashSet;
import java.util.Set;

public class Empresa {

    private Set<Empleado> empleados = new HashSet<>();

    private Double sueldoBase;

    public Empresa(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Integer getCantidadDeEmpleados() {

        return empleados.size();
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void contratar(Empleado empleado){
        empleados.add(empleado);
    }

    public void despedir(Empleado empleado){
        empleados.remove(empleado);
    }


}
