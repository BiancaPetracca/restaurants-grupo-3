package com.despegar.jav2017.contratar;

public class ExperienciaLaboral {

    private Empresa empresa;
    private Integer aniosTrabajados;
    private Categoria categoria;

    public ExperienciaLaboral(Empresa empresa, Integer aniosTrabajados, Categoria categoria) {
        this.empresa = empresa;
        this.aniosTrabajados = aniosTrabajados;
        this.categoria = categoria;
    }

    public Double sueldoPromedio(Empleado empleado) {
        return categoria.calcularSueldo(empleado, empresa);
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExperienciaLaboral that = (ExperienciaLaboral) o;

        if (!empresa.equals(that.empresa)) return false;
        if (!aniosTrabajados.equals(that.aniosTrabajados)) return false;
        return categoria.equals(that.categoria);
    }

    @Override
    public int hashCode() {
        int result = empresa.hashCode();
        result = 31 * result + aniosTrabajados.hashCode();
        result = 31 * result + categoria.hashCode();
        return result;
    }
}
