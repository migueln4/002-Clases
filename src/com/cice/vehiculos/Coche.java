package com.cice.vehiculos;

public class Coche {

    //los atributos de las clases son, habitualmente, PRIVADOS
    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;

    public void arrancar() {
        System.out.println("Estoy arrancando.");
        System.out.println("[MOTOR]: Arrancando.");
    }

    public void acelerar() {
        int admiraciones = potencia/100;
        String cadena1 = "";
        String cadena2 = "";
        String cadenafinal;
        for(int i=0;i<admiraciones;i++) {
            cadena1 += "¡";
        }
        cadenafinal = cadena1+"Acelerand";
        for(int i=0;i<potencia;i+=10) {
            cadenafinal+="o";
        }
        if (admiraciones > 0) {
            for(int i=0;i<admiraciones;i++) {
                cadena2 += "!";
            }
            cadenafinal += cadena2;
        } else {
            cadenafinal += ".";
        }
        System.out.println(cadenafinal);
    }

    public void frenar() {
        System.out.println("Reduzco la velocidad.");
    }

    public void parar() {
        System.out.println("[MOTOR]: Apagando.");
        System.out.println("[MOTOR]: Parado.");
    }

    /*
    Si se hace así, cuando alguien intente meter una potencia negativa, así se va a quedar. Eso no lo estamos contemplando.

    public void setPotencia(int potenciaDada) {
        potencia = potenciaDada;
    }*/

    public void setPotencia(int potenciaDada) {
        if (potenciaDada > 0) { //No es lo habitual que esto esté aquí porque cuando se setea algo, estamos seguros de que lo que se setea es como realmente se debe hacer.
            this.potencia = potenciaDada;
        }
    }

    public int getPotencia() { return this.potencia;}

}
