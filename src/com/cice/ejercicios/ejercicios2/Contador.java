package com.cice.ejercicios.ejercicios2;

public class Contador {
    private int cuenta;

    public void incrementar(int n) {
        cuenta += n;
    }
    public void decrementar(int n) {
        if (cuenta-n >= 0) {
            cuenta -= n;
        }
    }
    public void setCuenta(int n) {
        if (cuenta > 0) {
            cuenta = n;
        }
    }
    public int getCuenta() {
        return cuenta;
    }
}
