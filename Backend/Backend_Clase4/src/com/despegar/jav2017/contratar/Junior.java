package com.despegar.jav2017.contratar;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class Junior implements Categoria {
    @Override
    public Double calcularSueldo(Empleado empleado, Empresa empresa) {
        return max(empleado.getSueldoActual(), empresa.getSueldoBase());
    }
}
