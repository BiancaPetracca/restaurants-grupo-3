package com.despegar.jav2017.contratar;

public class Sr implements Categoria {
    @Override
    public Double calcularSueldo(Empleado empleado, Empresa empresa) {
        return empleado.getSueldoActual() * 2;
    }
}
