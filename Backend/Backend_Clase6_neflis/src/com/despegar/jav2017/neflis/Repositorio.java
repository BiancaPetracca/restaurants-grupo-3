package com.despegar.jav2017.neflis;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Repositorio {

    Set<Contenido> contenidos = new HashSet<>();
    Set<Usuario> usuarios = new HashSet<>();


    public Set<Contenido> getRecomendadosPara(Usuario usuario){
        return contenidos.stream()
                .filter(contenido -> contenido.esRecomendadoPara(usuario))
                .collect(Collectors.toSet());
    }

}
