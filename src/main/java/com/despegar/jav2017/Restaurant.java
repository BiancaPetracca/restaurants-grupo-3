package com.despegar.jav2017;

public class Restaurant {

    public Restaurant(String id, String nombre, Integer telefono, String zona,
                      Integer recomendaciones, Double costoPorPersona, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.zona = zona;
        this.recomendaciones = recomendaciones;
        this.costoPorPersona = costoPorPersona;
        this.activo = activo;
    }

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
