package com.despegar.jav2017;

public class Restaurant {

    private String id;
    private String nombre;
    private Integer telefono;
    private String zona;
    private Integer recomendaciones;
    private Double costoPorPersona;
    private Boolean activo;

    public Boolean tieneMejorReferenciaQue(Integer referenciaMinima) {
        return recomendaciones > referenciaMinima;
    }

    public Boolean estaActivo() {
        return activo;
    }
}
