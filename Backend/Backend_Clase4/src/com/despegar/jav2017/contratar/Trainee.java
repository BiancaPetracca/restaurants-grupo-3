package com.despegar.jav2017.contratar;

public class Trainee implements Categoria {
    @Override
    public Double calcularSueldo(Empleado empleado, Empresa empresa) {
        return empresa.getSueldoBase();
    }

}
