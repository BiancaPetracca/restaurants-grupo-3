package com.despegar.jav2017.infierno;

import java.util.*;

public class Diablo {

    private Set<Demonio> demoniosACargo = new HashSet<>();
    private Set<Alma> almas = new HashSet<>();

    private Demonio pequenioDemonio(){
      return demoniosACargo.stream()
              .max(Comparator.comparingDouble(Demonio::getPoderEntregado))
              .orElse(new NingunDemonio());
    }

    public void absorber(Set<Alma> almasCazadas) {
        almas.addAll(almasCazadas);
    }

    public void asignarMision(Demonio demonio, Mision mision){
        if(mision.puedeSerCumplidaPor(demonio))
            demonio.notificarQuePuedeCumplirMision();
    }
}


