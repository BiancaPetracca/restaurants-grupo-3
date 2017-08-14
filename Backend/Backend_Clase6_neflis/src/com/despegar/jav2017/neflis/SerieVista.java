package com.despegar.jav2017.neflis;

import java.util.ArrayList;
import java.util.List;

public class SerieVista {

    private Serie serie;
    private List<Capitulo> capitulos = new ArrayList<>();

    public Boolean fueVisto(Capitulo capitulo) {
        return capitulos.contains(capitulo);
    }
}
