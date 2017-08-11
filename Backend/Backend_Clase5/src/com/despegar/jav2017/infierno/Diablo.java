package com.despegar.jav2017.infierno;

import java.util.*;

public class Diablo {

    private Map<Demonio, Double> demoniosACargo = new HashMap<>();
    private Set<Alma> almas = new HashSet<>();

    public void pedirRendicionDeCuentas(Demonio demonio) {
        demonio.rendirCuentas(this);
    }

    public void sumarPoderAdquirido(Demonio demonio, Set<Alma> almasSuministradas){
        almasSuministradas.forEach(alma ->
                agregarPoderEntregado(demonio, alma.poder()));
    }


    private void agregarPoderEntregado(Demonio demonio, Double poder) {
        Double nuevoPoder = demoniosACargo.get(demonio) + poder;
        demoniosACargo.put(demonio, nuevoPoder);
    }

    private Demonio pequenioDemonio(){
      Double minimoPoder = Collections.min(demoniosACargo.values());
      return demoniosACargo.entrySet().stream()
              .filter(demonio -> demonio.getValue().equals(minimoPoder))
              .map(Map.Entry::getKey)
              .findFirst()
              .orElse(new NingunDemonio());
    }

    public void castigar(Demonio demonio) {
        demonio.disminuirNivelDeMaldadHasta(0.1);
        demonio.deprimirse();
    }

    public void absorber(Set<Alma> almasCazadas) {
        almas.addAll(almasCazadas);
    }

    public void asignarMision(Demonio demonio, Mision mision){
        if(mision.puedeSerCumplidaPor(demonio))
            demonio.notificarQuePuedeCumplirMision();
    }
}


