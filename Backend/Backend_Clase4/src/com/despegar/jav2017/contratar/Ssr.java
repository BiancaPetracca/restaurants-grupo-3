package com.despegar.jav2017.contratar;

public class Ssr implements Categoria {
    @Override
    public Double calcularSueldo(Empleado empleado, Empresa empresa) {
        return empleado.getAniosDeExperiencia() * 5000.0;
    }
}
