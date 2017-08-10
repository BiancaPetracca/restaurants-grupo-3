package com.despegar.jav2017.contratar;

public class Gerente implements Categoria {
    @Override
    public Double calcularSueldo(Empleado empleado, Empresa empresa) {
        return empresa.getCantidadDeEmpleados() / 10 * empleado.getSueldoActual();
    }
}
