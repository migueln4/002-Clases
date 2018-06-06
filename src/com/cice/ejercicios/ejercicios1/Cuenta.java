package com.cice.ejercicios.ejercicios1;

public class Cuenta {
    private double balance;
    private String titular;
    private String numero;

    public void ingreso(double dinero) {
        if (esPositivo(dinero)) {
            balance += dinero;
        }
    }

    public void reintegro(double dinero) {
        if (esPositivo(dinero) && esPositivo(balance-dinero)) {
            balance -= dinero;
        }
    }

    public void transferencia(double dinero, Cuenta receptor) {
        if (esPositivo(dinero) && esPositivo(balance-dinero)) {
            balance -= dinero;
            receptor.ingreso(dinero);
        }
    }

    public void setDinero(double dinero) {
        if (esPositivo(dinero)) {
            balance = dinero;
        }
    }

    public void setTitular(String nombre) {
        titular = nombre;
    }

    public void setNumero(String nuevoNumero) {
        numero = nuevoNumero;
    }

    public double getDinero() {
        return balance;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    private boolean esPositivo(double dinero) {
        return dinero > 0 ? true : false;
    }

}
