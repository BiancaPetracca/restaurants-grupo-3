package com.despegar.jav2017;

public class App {

    public static void main(String args[]){

        Elefante dumbo = new Elefante(5400);
        Jirafa pepona = new Jirafa(900);
        Doctor drWho = new Doctor();
        drWho.hacerRutina(dumbo, 5);
        drWho.hacerRutina(pepona, 2);
    }
}
