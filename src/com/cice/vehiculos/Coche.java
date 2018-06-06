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
        System.out.println("¡Acelerandooooooo!");
    }

    public void frenar() {
        System.out.println("Reduzco la velocidad.");
    }

    public void parar() {
        System.out.println("[MOTOR]: Apagando.");
        System.out.println("[MOTOR]: Parado.");
    }

}
