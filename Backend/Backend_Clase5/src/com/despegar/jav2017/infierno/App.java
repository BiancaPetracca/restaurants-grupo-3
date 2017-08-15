package com.despegar.jav2017.infierno;

public class App {

    public static void main(String args[]){
        Diablo diablo = new Diablo();
        Demonio demonio = new DemonioDeSombras(10, "Un demonio!");
        Demonio totallyEvil = new DemonioDeFuego(100.0, -4, "Totally evil demon");
        diablo.pequenioDemonio();
    }
}
