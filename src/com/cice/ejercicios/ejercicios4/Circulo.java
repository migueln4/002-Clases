package com.cice.ejercicios.ejercicios4;

public class Circulo {

    private double radio;
    private double area;
    private double perimetro;
    private double diametro;

    public Circulo() {
        super();
    }

    public Circulo(double radio){
        super();
        this.radio = radio;
        this.area = radio*radio*Math.PI;
        this.diametro = radio*2;
        this.perimetro = 2*Math.PI*radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public double getRadio() {
        return this.radio;
    }
    public double getArea() {return this.area;}
    public double getDiametro() {return this.diametro;}
    public double getPerimetro() {return this.perimetro;}
    public boolean esMayor(Circulo c1,Circulo c2) {
        return c1.getRadio() > c2.getRadio() ? true : false;
    }
}
